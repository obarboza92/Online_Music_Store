package logicaNegocio;

import accesoDatos.accDat;
import entidades.*;

public class registroUsuario {
    
    public boolean ingresarUsuarioSistema(usuario usrLN){
    
    accDat ad = new accDat();
    
    boolean respuesta;
    
    respuesta = ad.ingresarUsuarioSistema(usrLN);
    
    return respuesta;
    }
}
