/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kos;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author IKHWAN
 */
public class KoneksiInput {
   Connection conn=null;
    public static Connection ConnectDb(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/kos","root","");
            return conn;
        }
    catch(Exception e){
    JOptionPane.showConfirmDialog(null, e);
    return null;   
}
    } 
}
