
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class BaseDAO {
    protected static Connection conn;
    
    public static Connection open(){
        String username = "root";   
        String password = "";
        String dbname = "inventorysystem";
        String baseURL = "jdbc:mysql://localhost/";
        
        try{
            conn = DriverManager.getConnection(baseURL + dbname, username, password);
            return conn;
        }catch(Exception ex){
            System.out.println(ex);
            return null;
        }
         
    }
    
    public void close() throws SQLException{
        conn.close();
        conn = null;
    }
}
    