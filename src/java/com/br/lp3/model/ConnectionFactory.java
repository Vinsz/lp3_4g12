package com.br.lp3.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 31431038
 */
public class ConnectionFactory {
   
    private static final String Db = "LP3";
    private static final String User = "mack";
    private static final String Pwd = "mack";
    
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        return DriverManager.getConnection("jdbc:derby://localhost/"+Db+";create=true;user="+User+";password="+Pwd);
    }
}
