package test;

import java.awt.*;
import javax.swing.*;
import java.sql.*;


public class GUIDemo { 
    public static void main(String[] args) { 
    	
    	
    	String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
    	String url = "jdbc:odbc:driver={Microsoft Access Driver (*.mdb)};DBQ=/Users/RYAN/Desktop/DudeRanchnew.accdb";
    	String user = "";
    	String pwd = "";
    	Connection con = null;
    	Statement smt = null;
    	ResultSet rs = null;
    	try {
    	    Class.forName(driver);
    	    con = DriverManager.getConnection(url);
    	    smt = con.createStatement();
    	    rs = smt.executeQuery("select * from Customer");
    	    while (rs.next()) {
    	        System.out.println(rs.getString(1));
    	    }
    	    rs.close();
    	    smt.close();
    	    con.close();
    	} catch (Exception e) {
    	    e.printStackTrace();
    	}
    	
    	
    	
    	
    	
    	
    	
        JFrame demo = new JFrame();
        demo.setSize(800, 600);
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JCheckBox checkbox = new JCheckBox("JCheckBox");
        JRadioButton radiobutton = new JRadioButton("JRadiobutton");
        JButton button = new JButton("JButton");
        JButton button2 = new JButton("JButton2");
        
        JLabel label = new JLabel("JLabel");
        
        JTextArea textarea = new JTextArea("JTextArea");
         
        demo.getContentPane().add(BorderLayout.EAST, checkbox);
        demo.getContentPane().add(BorderLayout.WEST, radiobutton);
        demo.getContentPane().add(BorderLayout.BEFORE_FIRST_LINE, button2);
        demo.getContentPane().add(BorderLayout.BEFORE_LINE_BEGINS, button);
        demo.getContentPane().add(BorderLayout.NORTH , label);
        demo.getContentPane().add(BorderLayout.CENTER, textarea);
        
         
        demo.setVisible(true);
     
    }
}