package br.com.unip.cc.APS.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection getConnection(){
        try{
          return
             DriverManager.getConnection("jdbc:MySQL://localhost/aps", "admin", "admin123");          
      }
      catch(SQLException e){
          throw new RuntimeException(e);
      }
    }
}
