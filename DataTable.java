package test;
import java.awt.*;
import javax.swing.JTable;
import java.sql.*;

public class DataTable {
	JTable Jt = new JTable();
	Connection con=null;
	String conUrl="";
	public static void main(String[] arge){
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		    Connection con=DriverManager.getConnection("jdbc:sqlserver://10.0.2.15/WIN-GJG6QALD7FS:1433;"
           + "databaseName=aspnet-ResIntel_PrototypeWebForms-2015041402297;user=sa;password=Ryangolf4226;");
			DatabaseMetaData metadata = con.getMetaData();           
	        System.out.println("Database Name: "+ metadata.getDatabaseProductName());
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		
		
	}
	
}
