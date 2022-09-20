package jdbcexamples;
import  java.sql.*;
public class JdbcApp2 {
	static Connection  con;
	static Statement st;
	
	public void  productInsert() throws SQLException,ClassNotFoundException
	{
		
			 con=Conn.getConn();
		String vsql="insert  into  product values(110,'santoor',89)";
		 st=con.createStatement();
		int n1=st.executeUpdate(vsql);
		System.out.println("inserted ::: "+n1);
		con.close();			
			

	}
	

	public void  productUpdate() throws SQLException,ClassNotFoundException
	{
		
			 con=Conn.getConn();
		String vsql="update product  set pname='p20',price=47 where pid=105";
		 st=con.createStatement();
		int n1=st.executeUpdate(vsql);
		System.out.println("Update Records::: "+n1);
		con.close();			
			

	}
	
	public  void  productDelete() throws SQLException,ClassNotFoundException
	{
		 con=Conn.getConn();
			String vsql="delete  from  product where  pid=105";
			 st=con.createStatement();
			int n1=st.executeUpdate(vsql);
			System.out.println("deleted  Records::: "+n1);
			con.close();		
		}
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		JdbcApp2  obj=new JdbcApp2();
		obj.productDelete();
		
		
		
		
	}

}
