
// The simplest way to use sql and jtable to show up data.
// Have to use Microsoft JDBC driver. 
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.*;

import java.util.Vector;
import java.sql.*;

public class DataTable {
   public static void main(String args[]){
	   
	   try{
		   
	   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	   Connection con=DriverManager.getConnection("jdbc:sqlserver://YourServerName:1433;"
	   		+ "databaseName=YourDataBaseName;user=sa;password=YourPassword");
	   ///DatabaseMetaData met=con.getMetaData();
	   //System.out.println("Database Name:" + met.getDatabaseProductName());
	   
	   
	   Statement stmt = con.createStatement();
	   // datatable to store the result
       ResultSet rs = stmt.executeQuery("select * from Tables");
	   JTable table=new JTable(buildTableModel(rs));
	   
	   JOptionPane.showMessageDialog(null, new JScrollPane(table));
	   }catch(Exception e){
		   e.printStackTrace();
		   
	   }}
   
	  public static DefaultTableModel buildTableModel(ResultSet rs)
	   throws SQLException{
		  
		   ResultSetMetaData metaData=rs.getMetaData();
		   
		   Vector<String> columnNames=new Vector<String>();
		   Vector<Vector<Object>> data=new Vector<Vector<Object>>();
		   int columnCount=metaData.getColumnCount();
		   
		  //Head
		   for(int column=1;column<=columnCount;column++){
			   columnNames.add(metaData.getColumnName(column));
		   }
		   
		   //data of the table
		   while(rs.next()){
			   Vector<Object>vector=new Vector<Object>();
			   for(int columnIndex=1;columnIndex<columnCount;columnIndex++){
				   vector.add(rs.getObject(columnIndex));
			   }
			   data.add(vector);
		   }
		   
		   return new DefaultTableModel(data, columnNames);
	   
   }
}
