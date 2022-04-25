/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;
import java.sql.*;
/**
 *
 * @author tasya
 */
public class connector {
    String url = "jdbc:mysql://localhost/tugasjdbc";
    String username = "root";
    String password = "";
    Connection koneksi;
    Statement statement;
    
    public connector (){
        try{
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            koneksi = DriverManager.getConnection(url, username, password);
            System.out.println("Koneksi Berhasil");
        }catch(Exception ex){
            System.out.println("Koneksi Gagal");
        }
    }

}
        
