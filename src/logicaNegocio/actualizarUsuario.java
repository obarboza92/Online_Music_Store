package logicaNegocio;

import accesoDatos.accDat;
import entidades.usuario;



public class actualizarUsuario {
    
    public boolean actualizarUsuario(usuario usr) {

        accDat ad = new accDat();

        boolean respuesta;

        respuesta = ad.actualizarUsuario(usr);

        return respuesta;
    }
}
