/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.sql.Time;

/**
 *
 * @author Julian
 */
public class Horario {
    
    String dia;
    Time f_inicial;
    Time f_final;
    public static String[] dias = {"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};
   

    public Horario(String dia, Time f_inicial, Time f_final) {
        this.dia = dia;
        this.f_inicial = f_inicial;
        this.f_final = f_final;
    }
    
    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Time getF_inicial() {
        return f_inicial;
    }

    public void setF_inicial(Time f_inicial) {
        this.f_inicial = f_inicial;
    }

    public Time getF_final() {
        return f_final;
    }

    public void setF_final(Time f_final) {
        this.f_final = f_final;
    }
    
}
