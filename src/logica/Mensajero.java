/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.sql.Date;

/**
 *
 * @author ADMIN
 */
public class Mensajero {
    private String k_tipo_id_mensajero;
    private long k_numero_id_mensajero;
    private Date f_fecha_de_nacimiento;
    private String i_sexo;
    private String i_coriza_seguridad;
    private String n_capacidad_de_transporte;
    private String nacionalidad;
    private String n_tipo_de_transporte;
    private int v_calificacion_prom;

    public String getK_tipo_id_mensajero() {
        return k_tipo_id_mensajero;
    }

    public void setK_tipo_id_mensajero(String k_tipo_id_mensajero) {
        this.k_tipo_id_mensajero = k_tipo_id_mensajero;
    }

    public long getK_numero_id_mensajero() {
        return k_numero_id_mensajero;
    }

    public void setK_numero_id_mensajero(long k_numero_id_mensajero) {
        this.k_numero_id_mensajero = k_numero_id_mensajero;
    }

    public Date getF_fecha_de_nacimiento() {
        return f_fecha_de_nacimiento;
    }

    public void setF_fecha_de_nacimiento(Date f_fecha_de_nacimiento) {
        this.f_fecha_de_nacimiento = f_fecha_de_nacimiento;
    }

    public String getI_sexo() {
        return i_sexo;
    }

    public void setI_sexo(String i_sexo) {
        this.i_sexo = i_sexo;
    }

    public String getI_coriza_seguridad() {
        return i_coriza_seguridad;
    }

    public void setI_coriza_seguridad(String i_coriza_seguridad) {
        this.i_coriza_seguridad = i_coriza_seguridad;
    }

    public String getN_capacidad_de_transporte() {
        return n_capacidad_de_transporte;
    }

    public void setN_capacidad_de_transporte(String n_capacidad_de_transporte) {
        this.n_capacidad_de_transporte = n_capacidad_de_transporte;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getN_tipo_de_transporte() {
        return n_tipo_de_transporte;
    }

    public void setN_tipo_de_transporte(String n_tipo_de_transporte) {
        this.n_tipo_de_transporte = n_tipo_de_transporte;
    }

    public int getV_calificacion_prom() {
        return v_calificacion_prom;
    }

    public void setV_calificacion_prom(int v_calificacion_prom) {
        this.v_calificacion_prom = v_calificacion_prom;
    }

 

    
}
