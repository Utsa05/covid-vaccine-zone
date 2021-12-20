package classess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
   public Connection con;
    public  void dbConnectNow() {
        {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                 con = DriverManager.getConnection("jdbc:mysql://localhost/covidvaccinezone", "root", "");
                 System.out.println("DB Connected ):");


            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }
    }
  public Connection getConnector(){
        return con;
  }

}
