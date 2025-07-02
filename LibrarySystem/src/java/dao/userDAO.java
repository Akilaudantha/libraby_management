/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.user;
import util.DBConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author Akila Perera
 */
public class userDAO {
    
    public boolean registerUser(user user)
    {
        String q1= "INSERT INTO user VALUES (?,?)";
        
        try
        {
            Connection con=DBConnection.createconnection();
            PreparedStatement p1= con.prepareStatement(q1);
            
            p1.setString(1, user.getUname());
            p1.setString(2, user.getPw());
            
            int row=p1.executeUpdate();
            return row> 0;
            
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            return false;
        }
        
    }
    
    public boolean validateUser(String user,String pw)
    {
        String q2= "SELECT * FROM user WHERE username=? AND password = ? ";
        
        try
        {
        Connection con=DBConnection.createconnection();
        PreparedStatement p2=con.prepareStatement(q2);
        
        p2.setString(1, user);
        p2.setString(2, pw);
        
        ResultSet rs = p2.executeQuery();
        return rs.next();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            return false;
        }
        
    }
    
}
