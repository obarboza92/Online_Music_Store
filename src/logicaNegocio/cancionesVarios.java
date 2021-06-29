package logicaNegocio;

import accesoDatos.accDat;
import entidades.*;
import java.util.ArrayList;

public class cancionesVarios {

    public boolean ingresarCanciones(canciones can) {

        accDat ad = new accDat();

        boolean respuesta;

        respuesta = ad.ingresarCanciones(can);

        return respuesta;
    }

    public ArrayList agregarCancionesToCombo() {

        accDat ad = new accDat();

        ArrayList respuesta;

        respuesta = ad.agregarCancionesToCombo();

        return respuesta;

    }

    public ArrayList actualizarCancionesToCombo() {

        accDat ad = new accDat();

        ArrayList respuesta;

        respuesta = ad.actualizarCancionesToCombo();

        return respuesta;
    }

    public boolean actualizarCancion(canciones cancion) {

        accDat ad = new accDat();

        boolean respuesta;

        respuesta = ad.actualizarCanciones(cancion);

        return respuesta;

    }

}
