package entidades;


public class canciones {
    
    private String codigoCancion;
    private String nombreCancion;
    private double precioCancion;
    private String codigoGeneroCancion;
    private String descripcionGeneroCancion;

    public String getDescripcionGeneroCancion() {
        return descripcionGeneroCancion;
    }

    public void setDescripcionGeneroCancion(String descripcionGeneroCancion) {
        this.descripcionGeneroCancion = descripcionGeneroCancion;
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

    public double getPrecioCancion() {
        return precioCancion;
    }

    public void setPrecioCancion(double precioCancion) {
        this.precioCancion = precioCancion;
    }

    public String getCodigoGeneroCancion() {
        return codigoGeneroCancion;
    }

    public void setCodigoGeneroCancion(String codigoGeneroCancion) {
        this.codigoGeneroCancion = codigoGeneroCancion;
    }


    
}
