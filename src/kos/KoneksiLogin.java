/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kos;
import java.sql.*;
import javax.swing.*;

public class KoneksiLogin {
    Connection conn=null;
    public static Connection ConnectDb(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/kos","root","");
            JOptionPane.showMessageDialog(null, "Connected to Database");
            return conn;
        }
    catch(Exception e){
    JOptionPane.showConfirmDialog(null, e);
    return null;   
}
    }
}
