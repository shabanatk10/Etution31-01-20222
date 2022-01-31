package testpack;
import java.sql.*;

public class StudloginDeo {
	
	public static Connection getConnection() {
		
		Connection con=null;
		try {
			
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}


public static int save(Studloginuser su) {
	int status=0;
	
	try {
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("insert into studlogin(studusername,studpassword) values(?,?)");
		ps.setString(1,su.getStudusername());
		ps.setString(2,su.getStudpassword());
		status=ps.executeUpdate();
		
	} catch (Exception e) {
		System.out.println(e);
	}
	
return status;

}
}
