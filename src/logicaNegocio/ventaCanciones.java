package logicaNegocio;

import accesoDatos.accDat;
import entidades.venta;
import java.util.ArrayList;
import presentacion.ventas;

public class ventaCanciones {

    public ArrayList consultaFacturasRealizadas() {

        accDat ad = new accDat();

        ArrayList respuesta;

        respuesta = ad.consultaFacturasRealizadas();

        return respuesta;
    }

    public boolean ingresocompraCabecera(venta v1) {

        accDat ad = new accDat();

        boolean respuesta;

        respuesta = ad.ingresocompraCabecera(v1);

        return respuesta;
    }

    public boolean ingresocompraDetalle(venta v1) {

        accDat ad = new accDat();

        boolean respuesta;

        respuesta = ad.ingresocompraDetalle(v1);

        return respuesta;
    }

    public ArrayList consultaCompraCabecera() {

        accDat ad = new accDat();

        ArrayList respuesta;

        respuesta = ad.consultaCompraCabecera();

        return respuesta;
    }
}
