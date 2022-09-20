package jdbcexamples;
import  java.sql.*;
import  java.util.*;
public class JdbcApp1 {
static Statement st;
static Connection con;	
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
try{
	Class.forName("com.mysql.jdbc.Driver");  
	 con=DriverManager.getConnection
			("jdbc:mysql://localhost:3306/cgi1","root","root");
	 int i=1;
	while(i<=5)
	{
   
   System.out.println("Enter Pid");
   int id=sc.nextInt();
   System.out.println("Enter Pname");
   String name=sc.next();
   System.out.println("Enter Price");
   double price=sc.nextDouble();
   
	String  vsql="insert  into  product  values("+id+",'"+name+"',"+price+")";
	Statement st=con.createStatement();
	st.executeUpdate(vsql);
	System.out.println("count::: "+i);
	System.out.println("please  check the  table ");
	i++;
	}
	con.close();
	
	
	
}catch(Exception e)
{
System.out.println(e);	
}
		
		
	}

}
