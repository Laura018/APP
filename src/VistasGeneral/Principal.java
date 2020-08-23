/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasGeneral;

import java.time.LocalTime;


/**
 *
 * @author ADMIN
 */
public class Principal {
    public static void main (String[] args){
        InicioSesion objeto = new InicioSesion();
        objeto.setVisible(true);
        LocalTime ahora = LocalTime.now();
        System.out.print(ahora);
        
    }
}
