package logicaNegocio;

import accesoDatos.accDat;
import entidades.usuario;
import java.util.ArrayList;

public class login {

    public usuario login(usuario usrLN) {

        accDat ad = new accDat();

        usuario usr;

        usr = ad.login(usrLN);

        return usr;

    }

    public ArrayList tipoUsuario() {
        accDat ad = new accDat();

        ArrayList respuesta;

        respuesta = ad.reporteUsuario();

        return respuesta;
    }
}
