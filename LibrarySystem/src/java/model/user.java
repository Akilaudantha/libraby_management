/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Akila Perera
 */
public class user {
    
    private String uname;
    private String pw;
    
    public user (String uname,String pw)
    {
        this.uname=uname;
        this.pw=pw;
    }
    
    public String getUname()
    {
        return uname;
    }
    public String getPw()
    {
        return pw;
    }
    
}
