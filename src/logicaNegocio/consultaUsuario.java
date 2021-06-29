package logicaNegocio;

import accesoDatos.accDat;
import java.util.ArrayList;


public class consultaUsuario {
    
     public ArrayList reporteUsuario() {
        accDat ad = new accDat();

        ArrayList respuesta;

        respuesta = ad.reporteUsuario();

        return respuesta;
    }
}
