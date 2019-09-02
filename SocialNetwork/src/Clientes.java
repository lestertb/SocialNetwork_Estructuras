/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marco
 */
public class Clientes {
    String nombreUsuario;
    String password;
    String pais;
    String ciudad;
    int cedula;
    String nombre;
    String apellido1;
    String apellido2;
    String urlImage;
    
    public static Clientes instance = null;
    public static Clientes getInstance(){
        if(instance == null){
            instance = new Clientes();
        }
        return instance;
    }

    public Clientes() {
    }
    
    public Clientes(String nombreUsuario, String password, String pais, String ciudad, int cedula, String nombre, String apellido1, String apellido2, String urlImage) {
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.pais = pais;
        this.ciudad = ciudad;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.urlImage = urlImage;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String geturlImage() {
        return urlImage;
    }

    public void seturlImage(String urlImage) {
        this.urlImage = urlImage;
    }
    
}
