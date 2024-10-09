
package pratikum1_2;
import java.sql.*;


public class Latihan_1 {
public static void main(String[] args) {
}
    static final String db_unidha2="jdbc:mysql://localhost:3306/db_unidha2";
    public static Connection db_unidha2() throws SQLException , ClassNotFoundException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Proses Deteksi Driver Berhasil");
            DriverManager.getConnection(db_unidha2,"root","");
            System.out.println("Koneksi Database Berhasil");
        }catch (final SQLException ex) {
            System.out.println("Koneksi Database Gagal");
        }
        return null;
        }
    
    }

    
    
    


