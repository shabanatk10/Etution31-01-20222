package testpack;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudUserDeo {
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
	
	
	public static int save(StudUser s) {
		int status=0;
		try {
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("insert into Student(firstname,lastname,place,gender,email,phoneNumber,standard,syllabus,school,gardian) values (?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, s.getFirstname());
			ps.setString(2, s.getLastname());
			ps.setString(3, s.getPlace());
			ps.setString(4, s.getGender());
			ps.setString(5, s.getEmail());
			ps.setString(6, s.getPhoneNumber());
			ps.setString(7, s.getStandard());
			ps.setString(8, s.getSyllabus());
			ps.setString(9, s.getSchool());
			ps.setString(10, s.getGardian());
			status=ps.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
		
	}
	
       public static List<StudUser> getallstudents(){
	
	List<StudUser> list=new ArrayList<StudUser>();
		try {
			
			Connection con=getConnection();
	      PreparedStatement ps=con.prepareStatement("select * from Student");
	      ResultSet rs=ps.executeQuery();
	      while(rs.next()) {
	    	  StudUser s=new StudUser();
	    	  s.setStudid(rs.getInt("studid"));
	    	  s.setFirstname(rs.getString("firstname"));
	    	  s.setLastname(rs.getString("lastname"));
	    	  s.setPlace(rs.getString("place"));
	    	  s.setGender(rs.getString("gender"));
	    	  s.setEmail(rs.getString("email"));
	    	  s.setPhoneNumber(rs.getString("phonenumber"));
	    	  s.setStandard(rs.getString("standard"));
	    	  s.setSyllabus(rs.getString("syllabus"));
	    	  s.setSchool(rs.getString("Syllabus"));
	    	  s.setGardian(rs.getString("gardian"));
	    	  list.add(s);
	    	  
	    	  
	      }
		
		
	} catch (Exception e) {
		System.out.println(e);

	}
	return list;
	}

}
