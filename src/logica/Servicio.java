/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author Julian
 */
public class Servicio {
    
   private String n_tipo_de_paquete;
   private Time h_hora_inicio;
   private Date f_dia_servicio;
   private double v_calificacion;
   private double v_costo_servicio;
   private String i_estado_servicio;
   private String i_ida_vuelta;
   private long k_id_ciudad;
   

    public String getN_tipo_de_paquete() {
        return n_tipo_de_paquete;
    }

    public void setN_tipo_de_paquete(String n_tipo_de_paquete) {
        this.n_tipo_de_paquete = n_tipo_de_paquete;
    }

    public Time getH_hora_inicio() {
        return h_hora_inicio;
    }

    public void setH_hora_inicio(Time h_hora_inicio) {
        this.h_hora_inicio = h_hora_inicio;
    }


    public double getV_calificacion() {
        return v_calificacion;
    }

    public void setV_calificacion(double v_calificacion) {
        this.v_calificacion = v_calificacion;
    }

    public double getV_costo_servicio() {
        return v_costo_servicio;
    }

    public void setV_costo_servicio(double v_costo_servicio) {
        this.v_costo_servicio = v_costo_servicio;
    }

    public String getI_estado_servicio() {
        return i_estado_servicio;
    }

    public void setI_estado_servicio(String i_estado_servicio) {
        this.i_estado_servicio = i_estado_servicio;
    }

    public String getI_ida_vuelta() {
        return i_ida_vuelta;
    }

    public void setI_ida_vuelta(String i_ida_vuelta) {
        this.i_ida_vuelta = i_ida_vuelta;
    }

    public Date getF_dia_servicio() {
        return f_dia_servicio;
    }

    public void setF_dia_servicio(Date f_dia_servicio) {
        this.f_dia_servicio = f_dia_servicio;
    }

    public long getK_id_ciudad() {
        return k_id_ciudad;
    }

    public void setK_id_ciudad(long k_id_ciudad) {
        this.k_id_ciudad = k_id_ciudad;
    }
    
    
   
   
   
    
}
