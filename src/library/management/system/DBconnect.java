
package library.management.system;

import com.mysql.jdbc.Connection;

/**
 *
 * @author Tharukshi
 */
public class DBconnect {
    
   
    
    public static Connection connect()
    {
        Connection conn = null;
        
        try
        {
                Class.forName("com.mysql.jdbc.Drivers");
                conn = (Connection) DriverManager.getConnection("jdbc;mysql;//localhost;3306/library","root","");
                
       
        }
        catch (Exception e)
        {
            System.out.println(e);
        
        
        }
            
            
        return conn;
    }
}
