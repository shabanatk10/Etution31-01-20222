package testpack;
import java.sql.*;

public class FacloginDeo {
	
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
	
	public static int save(Facloginuser fu) {
		int status=0;
		try {
			
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("insert into FacLogin(facusername,facpassword) values (?,?)");
			ps.setString(1,fu.getFacusername());
			ps.setString(2, fu.getFacpassword());
			status=ps.executeUpdate();
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return status;
	}

}
