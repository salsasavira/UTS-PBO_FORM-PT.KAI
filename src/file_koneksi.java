
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
/**
 *
 * @author asus
 */

public class file_koneksi {
    private static Connection koneksi;
    public static Connection GetConnection() throws SQLException {
        if (koneksi == null) {
            Driver driver = new Driver();
            koneksi = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/data_kereta?zeroDateTimeBehavior=convertToNull","root","");
        }
        return koneksi;
    }
    
}