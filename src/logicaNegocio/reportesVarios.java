package logicaNegocio;

import accesoDatos.accDat;
import java.sql.Connection;
import java.util.ArrayList;

public class reportesVarios {

    public ArrayList reporteUsuario() {
        accDat ad = new accDat();

        ArrayList respuesta;

        respuesta = ad.reporteUsuario();

        return respuesta;
    }
    
    public Connection reporteConexion() {
        accDat ad = new accDat();
        Connection conn;

        conn = ad.reporteConexionReportes();
        return conn;
        }
}
