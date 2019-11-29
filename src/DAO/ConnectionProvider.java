/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 *
 * @author BatHoi
 */
public class ConnectionProvider {
    public static Connection Connect() {
    
       try {
            String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            String url = "jdbc:sqlserver://localhost:1433;databasename=qldt;integratedSecurity=true";
            Class.forName(driver); //load driver
            Connection con = DriverManager.getConnection(url);
            return con;
        } catch (Exception ex) {
            return null;
        }
    }
}
