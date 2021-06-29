package entidades;

import java.util.Date;

public class venta {

    private int numeroFactura;
    private String fecha;
    private String identificacionUsuario;
    private Double subTotal;
    private Double totalCompra;
    private String codigoCancion;
    private String nombreCancion;
    private String precioCancion;
    
    private String codigoCancionFactura;
    private String nombreCancionFactura;
    private String precionCancionFactura;
    
    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getIdentificacionUsuario() {
        return identificacionUsuario;
    }

    public void setIdentificacionUsuario(String identificacionUsuario) {
        this.identificacionUsuario = identificacionUsuario;
    }

    public Double getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(Double totalCompra) {
        this.totalCompra = totalCompra;
    }

    public String getCodigoCancion() {
        return codigoCancion;
    }

    public void setCodigoCancion(String codigoCancion) {
        this.codigoCancion = codigoCancion;
    }

    public String getNombreCancion() {
        return nombreCancion;
    }

    public void setNombreCancion(String nombreCancion) {
        this.nombreCancion = nombreCancion;
    }

    public String getPrecioCancion() {
        return precioCancion;
    }

    public void setPrecioCancion(String precioCancion) {
        this.precioCancion = precioCancion;
    }

    public String getCodigoCancionFactura() {
        return codigoCancionFactura;
    }

    public void setCodigoCancionFactura(String codigoCancionFactura) {
        this.codigoCancionFactura = codigoCancionFactura;
    }

    public String getNombreCancionFactura() {
        return nombreCancionFactura;
    }

    public void setNombreCancionFactura(String nombreCancionFactura) {
        this.nombreCancionFactura = nombreCancionFactura;
    }

    public String getPrecionCancionFactura() {
        return precionCancionFactura;
    }

    public void setPrecionCancionFactura(String precionCancionFactura) {
        this.precionCancionFactura = precionCancionFactura;
    }
    
    
}
