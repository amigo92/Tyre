/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.shaivya.tyre;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Class.forName("org.h2.Driver");
        if(!isCorrectlyInstalled()) {
            //install
            //register user
        }
        else{
            //show login form
        }
        //after successful login
    }
    
    public static boolean isCorrectlyInstalled() {
       try{
           //check if database file exists
           File dbfile = new File("./db.h2");
           if(!dbfile.exists()) return false;
           
           Connection conn = DriverManager.getConnection(DbConf.URL, DbConf.username, DbConf.password);
           Statement stmt = conn.createStatement();
           ResultSet rs = stmt.executeQuery("select * from users");
           int size = 0;
           while(rs.next()) {
               size++;
           }
           if(size < 1) {
               conn.close();
               return false;
           }else{
               conn.close();
               return true;
           }
       }
       catch(Exception e){
           e.printStackTrace();
       }
       return false;
    }
    
    public static void install() {
        try{
            
        }
        catch(Exception e) {
            
        }
    }
}
