package logicaNegocio;

import accesoDatos.accDat;
import accesoDatos.conexionBD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionBaseDatos {

    private String url;
    private Connection conexion;
    
    public boolean probarConexion(){
        
        Connection conn;
        
        conn = obtenerConexion();
        
        if(conn != null){
            return true;
        }else{
            return false;
        }        
    }    

    public Connection obtenerConexion() {

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            url = "jdbc:sqlserver://localhost; databaseName=LaVentaMusical; "
                    + "user=Progra_II; password=12345";

            conexion = DriverManager.getConnection(url);

            return conexion;

        } catch (SQLException | ClassNotFoundException ex) {

            JOptionPane.showMessageDialog(null, ex);

            return null;
        }
    }
}
