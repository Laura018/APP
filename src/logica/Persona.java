/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author ADMIN
 */
public class Persona {
    private String k_tipo_id;
    private long k_numero_id;
    private String n_primer_nombre;
    private String n_segundo_nombre;
    private String n_primer_apellido;
    private String n_segundo_apellido;
    private String n_rol;
    private String o_correo;
    
    public Persona(){
        
    }

    public String getK_tipo_id() {
        return k_tipo_id;
    }

    public void setK_tipo_id(String k_tipo_id) {
        this.k_tipo_id = k_tipo_id;
    }

    public long getK_numero_id() {
        return k_numero_id;
    }

    public void setK_numero_id(long k_numero_id) {
        this.k_numero_id = k_numero_id;
    }

    public String getN_primer_nombre() {
        return n_primer_nombre;
    }

    public void setN_primer_nombre(String n_primer_nombre) {
        this.n_primer_nombre = n_primer_nombre;
    }

    public String getN_segundo_nombre() {
        return n_segundo_nombre;
    }

    public void setN_segundo_nombre(String n_segundo_nombre) {
        this.n_segundo_nombre = n_segundo_nombre;
    }

    public String getN_primer_apellido() {
        return n_primer_apellido;
    }

    public void setN_primer_apellido(String n_primer_apellido) {
        this.n_primer_apellido = n_primer_apellido;
    }

    public String getN_segundo_apellido() {
        return n_segundo_apellido;
    }

    
    public void setN_segundo_apellido(String n_segundo_apellido) {
        this.n_segundo_apellido = n_segundo_apellido;
    }

    
    public String getN_rol() {
        return n_rol;
    }

    public void setN_rol(String n_rol) {
        this.n_rol = n_rol;
    }

    public String getO_correo() {
        return o_correo;
    }

    public void setO_correo(String o_correo) {
        this.o_correo = o_correo;
    }
    
    
    
    
}
