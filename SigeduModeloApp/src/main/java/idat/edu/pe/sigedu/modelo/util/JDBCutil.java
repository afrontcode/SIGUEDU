package idat.edu.pe.sigedu.modelo.util;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JDBCutil {
    
    private final String usuarioBD = "root";
    
    private final String passwordBD = "12345678";
    
    private final String urlConeccion = "jdbc:mysql://localhost:3306/sigedu_db?zeroDateTimeBehavior=convertToNull";
    
    private final String driverClass = "com.mysql.jdbc.Driver";
    
    private Connection conecction;
    
    private PreparedStatement sentencia;
    
    private ResultSet resultados;

    public JDBCutil() {
        
        try {
            //1.-Cargo la clase Driver
            Class.forName(driverClass);
            try {
                //2.-Obtener connecion
                conecction = DriverManager.getConnection(urlConeccion, usuarioBD, passwordBD);
                if(conecction !=null)
                    System.out.println("Coneccion exitosa");
            } catch (SQLException ex) {
                Logger.getLogger(JDBCutil.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JDBCutil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Connection getConecction() {
        return conecction;
    }
    
            
            
    
}
