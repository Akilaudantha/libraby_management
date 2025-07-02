/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Akila Perera
 */
public class DBConnection {
    
    private static String url = "jdbc:mysql://localhost:3306/library1";
    private static String user = "root";
    private static String pw = "";
    
    public static Connection createconnection()
            {
                Connection con = null;
                try{
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(url,user,pw);
                }
                catch (Exception e){
                    System.out.println(e.getMessage());
                }
                
                return con;
            }
    
    
    
}
