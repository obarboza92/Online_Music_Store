package logicaNegocio;

import accesoDatos.accDat;
import entidades.*;
import java.util.ArrayList;

public class generosMusicalesVarios {

    public boolean ingresarGeneroMusical(generosMusicales genero) {

        accDat ad = new accDat();

        boolean respuesta;

        respuesta = ad.ingresarGeneroMusical(genero);

        return respuesta;
    }

    public ArrayList actualizarGeneroToCombo() {

        accDat ad = new accDat();

        ArrayList respuesta;

        respuesta = ad.actualizarGeneroToCombo();

        return respuesta;
    }
    
    public boolean actualizarGeneroMusical(generosMusicales gm) {

        accDat ad = new accDat();
        
        boolean respuesta;

        respuesta = ad.actualizarGeneroMusical(gm);

        return respuesta;

    }
}
