package accesoDatos;

import entidades.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import logicaNegocio.ventaCanciones;

public class accDat {

    conexionBD conBD = new conexionBD(); // instancia de la conexion de base de datos (conexionBD)
    ArrayList<canciones> listaCanciones = new ArrayList(); // Arraylist de canciones
    ArrayList<generosMusicales> listaGeneros = new ArrayList(); // Arraylist de generos
    ArrayList<usuario> listaUsuarios = new ArrayList(); // Arraylist usuarios
    ArrayList<venta> listaVentas = new ArrayList(); // Arraylist ventas

    //---------------------------------------------------------------------------------
    //usuarios
    public boolean ingresarUsuarioSistema(usuario usrAD) {

        try {

            Connection conn;
            conn = conBD.obtenerConexion();

            if (conn != null) {

                CallableStatement proc = conn.prepareCall("{call ingresarUsuario(?,?,?,?,?,?,?,?)}");
                proc.setString(1, usrAD.getIdentificacionUsuario());
                proc.setString(2, usrAD.getNombreCompletoUsuario());
                proc.setString(3, usrAD.getGeneroUsuario());
                proc.setString(4, usrAD.getCorreoElectronicoUsuario());
                proc.setString(5, usrAD.getTipoTarjetaUsuario());
                proc.setString(6, usrAD.getNumeroTarjetaUsuario());
                proc.setString(7, usrAD.getContrasenaUsuario());
                proc.setString(8, usrAD.getPerfilUsuario());

                proc.execute();

                conn.close();

                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            return false;
        }
    }

    public ArrayList reporteUsuario() {
        try {

            Connection conn;

            conn = conBD.obtenerConexion();

            if (conn != null) {

                CallableStatement proc = conn.prepareCall("{call repUsuariosSistema()}");

                proc.execute();

                ResultSet resultado = proc.getResultSet();

                while (resultado.next()) {

                    usuario u1 = new usuario();

                    u1.setIdentificacionUsuario(resultado.getString("idUsuario"));
                    u1.setNombreCompletoUsuario(resultado.getString("nombreUsuario"));
                    u1.setGeneroUsuario(resultado.getString("generoUsuario"));
                    u1.setCorreoElectronicoUsuario(resultado.getString("correoElectUsuario"));
                    u1.setTipoTarjetaUsuario(resultado.getString("tipoTarjetaUsuario"));
                    u1.setNumeroTarjetaUsuario(resultado.getString("tarjetaUsuario"));
                    u1.setContrasenaUsuario(resultado.getString("claveUsuario"));
                    u1.setPerfilUsuario(resultado.getString("perfilUsuario"));

                    listaUsuarios.add(u1);
                }

                conn.close();

                return listaUsuarios;

            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }

    public boolean actualizarUsuario(usuario usr) {
        try {

            Connection conn;
            conn = conBD.obtenerConexion();

            if (conn != null) {

                CallableStatement proc = conn.prepareCall("{call actualizarUsuario(?,?,?,?,?,?,?,?)}");
                proc.setString(1, usr.getIdentificacionUsuario());
                proc.setString(2, usr.getNombreCompletoUsuario());
                proc.setString(3, usr.getGeneroUsuario());
                proc.setString(4, usr.getCorreoElectronicoUsuario());
                proc.setString(5, usr.getTipoTarjetaUsuario());
                proc.setString(6, usr.getNumeroTarjetaUsuario());
                proc.setString(7, usr.getContrasenaUsuario());
                proc.setString(8, usr.getPerfilUsuario());

                proc.execute();

                conn.close();

                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            return false;
        }
    }

    public usuario login(usuario usr) {

        try {

            Connection conn;

            conn = conBD.obtenerConexion();

            if (conn != null) {

                CallableStatement proc = conn.prepareCall("{call loginUsuario(?,?)}");

                proc.setString(1, usr.getIdentificacionUsuario());
                proc.setString(2, usr.getContrasenaUsuario());

                proc.execute();

                ResultSet resultado = proc.getResultSet();

                usuario usr1 = new usuario();

                while (resultado.next()) {

                    usr1.setIdentificacionUsuario(resultado.getString("idUsuario"));
                    usr1.setNombreCompletoUsuario(resultado.getString("nombreUsuario"));
                    usr1.setPerfilUsuario(resultado.getString("perfilUsuario"));
                    usr1.setNumeroTarjetaUsuario(resultado.getString("tarjetaUsuario"));
                }

                conn.close();

                return usr;

            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }

    //---------------------------------------------------------------------------------
    //generos musicales
    public boolean ingresarGeneroMusical(generosMusicales genero) {

        try {
            Connection conn;
            conn = conBD.obtenerConexion();

            if (conn != null) {

                CallableStatement proc = conn.prepareCall("{call ingresarGenerosMusicales(?,?)}");
                proc.setString(1, genero.getCodigoGenero());
                proc.setString(2, genero.getDescripcionGenero());

                proc.execute();

                conn.close();

                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            return false;
        }
    }

    public boolean actualizarGeneroMusical(generosMusicales genero) {

        try {
            Connection conn;

            conn = conBD.obtenerConexion();

            if (conn != null) {

                CallableStatement proc = conn.prepareCall("{call actualizarGenerosMusicales(?,?)}");
                proc.setString(1, genero.getCodigoGenero());
                proc.setString(2, genero.getDescripcionGenero());

                proc.execute();

                conn.close();

                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            return false;
        }
    }

    public ArrayList actualizarGeneroToCombo() {
        try {

            Connection conn;

            conn = conBD.obtenerConexion();

            if (conn != null) {

                CallableStatement proc = conn.prepareCall("{call consultarGenerosMusicales()}");

                proc.execute();

                ResultSet resultado = proc.getResultSet();

                while (resultado.next()) {

                    generosMusicales gm = new generosMusicales();

                    gm.setCodigoGenero(resultado.getString("codGenero"));
                    gm.setDescripcionGenero(resultado.getString("descGenero"));

                    listaGeneros.add(gm);
                }

                conn.close();

                return listaGeneros;

            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }

    //---------------------------------------------------------------------------------
    //canciones
    public boolean ingresarCanciones(canciones can) {
        try {
            Connection conn;
            conn = conBD.obtenerConexion();

            if (conn != null) {

                CallableStatement proc = conn.prepareCall("{call ingresarCanciones(?,?,?,?)}");
                proc.setString(1, can.getCodigoCancion());
                proc.setString(2, can.getNombreCancion());
                proc.setString(3, can.getCodigoGeneroCancion());
                proc.setDouble(4, can.getPrecioCancion());

                proc.execute();

                conn.close();

                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            return false;
        }

    }

    public ArrayList agregarCancionesToCombo() {
        try {

            Connection conn;

            conn = conBD.obtenerConexion();

            if (conn != null) {

                CallableStatement proc = conn.prepareCall("{call consultarGenerosMusicales()}");

                proc.execute();

                ResultSet resultado = proc.getResultSet();

                while (resultado.next()) {

                    canciones c1 = new canciones();

                    c1.setCodigoGeneroCancion(resultado.getString("codGenero"));
                    c1.setDescripcionGeneroCancion(resultado.getString("descGenero"));

                    listaCanciones.add(c1);
                }

                conn.close();

                return listaCanciones;

            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }

    }

    public boolean actualizarCanciones(canciones can) {

        try {
            Connection conn;

            conn = conBD.obtenerConexion();

            if (conn != null) {

                CallableStatement proc = conn.prepareCall("{call actualizarCanciones(?,?,?,?)}");
                proc.setString(1, can.getCodigoCancion());
                proc.setString(2, can.getNombreCancion());
                proc.setString(3, can.getCodigoGeneroCancion());
                proc.setDouble(4, can.getPrecioCancion());

                proc.execute();

                conn.close();

                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            return false;
        }
    }

    public ArrayList actualizarCancionesToCombo() {

        try {

            Connection conn;

            conn = conBD.obtenerConexion();

            if (conn != null) {

                CallableStatement proc = conn.prepareCall("{call consultarCanciones()}");

                proc.execute();

                ResultSet resultado = proc.getResultSet();

                while (resultado.next()) {

                    canciones c1 = new canciones();

                    c1.setCodigoCancion(resultado.getString("codCancion"));
                    c1.setNombreCancion(resultado.getString("nombreCancion"));
                    c1.setCodigoGeneroCancion(resultado.getString("codGenero"));
                    c1.setPrecioCancion(Double.parseDouble(resultado.getString("precioCancion")));
                    c1.setDescripcionGeneroCancion(resultado.getString("descGenero"));

                    listaCanciones.add(c1);
                }

                /*while (resultado2.next()){
                    canciones c1 = new canciones();
                    c1.setCodigoGeneroCancion(resultado.getString("codGenero"));
                    listaCanciones.add(c1);
                }*/
                conn.close();

                return listaCanciones;

            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }

    //---------------------------------------------------------------------------------
    //Ventas
    public ArrayList consultaFacturasRealizadas() {

        try {

            Connection conn;

            conn = conBD.obtenerConexion();

            if (conn != null) {

                CallableStatement proc1 = conn.prepareCall("{call repFacturasRealizadas()}");

                proc1.execute();

                ResultSet resultado = proc1.getResultSet();

                while (resultado.next()) {

                    venta v1 = new venta();

                    v1.setNumeroFactura(resultado.getInt("numFact"));
                    v1.setFecha(resultado.getString("fechaCompra"));
                    v1.setIdentificacionUsuario(resultado.getString("idUsuario"));
                    v1.setTotalCompra(resultado.getDouble("totalFact"));
                    v1.setCodigoCancion(resultado.getString("codCancion"));
                    v1.setNombreCancion(resultado.getString("nombreCancion"));

                    listaVentas.add(v1);
                }

                conn.close();

                return listaVentas;

            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }

    public boolean ingresocompraCabecera(venta ventas) {

        try {
            Connection conn;
            conn = conBD.obtenerConexion();

            if (conn != null) {

                CallableStatement proc1 = conn.prepareCall("{call IngresarCompraCabecera(?,?,?,?)}");

                proc1.setInt(1, ventas.getNumeroFactura());
                proc1.setString(2, ventas.getFecha());
                proc1.setString(3, ventas.getIdentificacionUsuario());
                proc1.setDouble(4, ventas.getTotalCompra());

                proc1.execute();

                conn.close();

                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            return false;
        }
    }

    public boolean ingresocompraDetalle(venta v1) {

        try {
            Connection conn;
            conn = conBD.obtenerConexion();

            if (conn != null) {

                CallableStatement proc1 = conn.prepareCall("{call IngresarCompraDetalle(?,?)}");

                    proc1.setInt(1, v1.getNumeroFactura());
                    proc1.setString(2, v1.getCodigoCancion());

                proc1.execute();

                conn.close();

                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            return false;
        }
    }
    
    public ArrayList consultaCompraCabecera(){
        try {

            Connection conn;

            conn = conBD.obtenerConexion();

            if (conn != null) {

                CallableStatement proc1 = conn.prepareCall("{call consultarCompraCabecera()}");

                proc1.execute();

                ResultSet resultado = proc1.getResultSet();

                while (resultado.next()) {

                    venta v1 = new venta();

                    v1.setNumeroFactura(resultado.getInt("numFact"));

                    listaVentas.add(v1);
                }

                conn.close();

                return listaVentas;

            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }
    
    //---------------------------------------------------------------------------------
    //Reportes
    
    public Connection reporteConexionReportes() {
        try {

            Connection conn;
            
            conn = conBD.obtenerConexion();

            if (conn != null) {
                return conn;
            } else {
                return null;
            }

        } catch (Exception ex) {
            return null;
        }
    }
}
