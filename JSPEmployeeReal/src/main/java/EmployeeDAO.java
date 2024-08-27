

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class EmployeeDAO {

	 public static Connection getConnection(){ 
		 Connection con=null; 
		 try{ 
		 Class.forName("oracle.jdbc.driver.OracleDriver"); 
		 
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","prabhakar","prabha225"); 
		 } 
		 catch(Exception e) 
		 { 
		 System.out.println(e); 
		 } 
		 return con; 
		} 
		 
		 public static int save(Employee u){ 
		 int status=0; 
		 try{ 
		 Connection con=getConnection(); 
		 PreparedStatement ps=con.prepareStatement( 
		 "insert into Empregister(EMPid,EMPname,password,email,sex,country,EMPsalary) values(?,?,?,?,?,?,?)"); 
		 ps.setInt(1, u.getEMPid());
		 ps.setString(2,u.getEMPname()); 
		 ps.setString(3,u.getPassword()); 
		 ps.setString(4,u.getEmail()); 
		 ps.setString(5,u.getSex()); 
		 ps.setString(6,u.getCountry()); 
		 ps.setDouble(7, u.getEMPsalary());
		 status=ps.executeUpdate(); 
		 } 
		 catch(Exception e) 
		 { 
		 System.out.println(e); 
		 } 
		 return status; 
		} 
		 
		 
		 public static int update(Employee u){ 
		 int status=0; 
		 try{ 
		 Connection con=getConnection(); 
		 PreparedStatement ps=con.prepareStatement("update EMPregister set EMPname=?,password=?,email=?,sex=?,country=?,EMPsalary=? where EMPid=?"); 
		 ps.setString(1,u.getEMPname()); 
		 ps.setString(2,u.getPassword()); 
		 ps.setString(3,u.getEmail()); 
		 ps.setString(4,u.getSex()); 
		 ps.setString(5,u.getCountry());
		 ps.setDouble(6, u.getEMPsalary());
		 ps.setInt(7,u.getEMPid()); 
		 status=ps.executeUpdate(); 
		 } 
		 catch(Exception e){System.out.println(e);} 
		 return status; 
		} 
		 public static int delete(Employee u){ 
		 int status=0; 
		 try{ 
		 Connection con=getConnection(); 
		 PreparedStatement ps=con.prepareStatement("delete from EMPregister where EMPid=?"); 
		 ps.setInt(1,u.getEMPid()); 
		 status=ps.executeUpdate(); 
		 }catch(Exception e){System.out.println(e);} 
		 
		 return status; 
		} 
		 public static List<Employee> getAllRecords(){ 
		 List<Employee> list=new ArrayList<Employee>(); 
		 
		 try{ 
		 Connection con=getConnection(); 
		 PreparedStatement ps=con.prepareStatement("select * from EMPregister"); 
		 ResultSet rs=ps.executeQuery(); 
		 while(rs.next()){ 
			 Employee u=new Employee(); 
		 u.setEMPid(rs.getInt("EMPid")); 
		 u.setEMPname(rs.getString("EMPname")); 
		 u.setPassword(rs.getString("password")); 
		 u.setEmail(rs.getString("email")); 
		 u.setSex(rs.getString("sex")); 
		 u.setCountry(rs.getString("country")); 
		 u.setEMPsalary(rs.getDouble("EMPsalary"));
		 list.add(u); 
		 } 
		 }catch(Exception e){System.out.println(e);} 
		 return list; 
		} 
		 
		 public static Employee getRecordById(int EMPid){ 
		 Employee u=null; 
		 
		 try{ 
		 Connection con=getConnection(); 
		 PreparedStatement ps=con.prepareStatement("select * from EMPregister where EMPid=?"); 
		
		 ps.setInt(1, EMPid);
		 ResultSet rs=ps.executeQuery(); 
		 while(rs.next()){ 
		 u=new Employee(); 
		 u.setEMPid(rs.getInt("EMPid")); 
		 u.setEMPname(rs.getString("EMPname")); 
		 u.setPassword(rs.getString("password")); 
		 u.setEmail(rs.getString("email")); 
		 u.setSex(rs.getString("sex")); 
		 u.setCountry(rs.getString("country")); 
		 u.setEMPsalary(rs.getDouble("EMPsalary"));
		 } 
		 }catch(Exception e){System.out.println(e);} 
		 return u; 
		} 

}
