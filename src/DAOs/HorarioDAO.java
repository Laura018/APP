/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import DBConnection.ServiceLocator;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import logica.Mensajero;

/**
 *
 * @author Julian
 */
public class HorarioDAO {
    Mensajero horamen = new Mensajero();
    
    public void InsertarHorarioMensajero(int i){
        try {
            String sql = "INSERT into " + "\"Horario\" (k_id_horario,f_hora_inicio,f_hora_final,n_dia_trabajado,"
                    + "k_tipo_id_mensajero,k_numero_id_mensajero)\n" +
                    "values (default,?,?,?,?,?)";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement stm = conexion.prepareStatement(sql);
            stm.setTime(1, horamen.horMensajero[i].getF_inicial());
            stm.setTime(2, horamen.horMensajero[i].getF_final());
            stm.setString(3, horamen.horMensajero[i].getDia());
            stm.setString(4, horamen.getK_tipo_id_mensajero());
            stm.setLong(5, horamen.getK_numero_id_mensajero());
            stm.executeUpdate();
            stm.close();
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }finally{
            ServiceLocator.getInstance().liberarConexion();
        } 
        }

    public Mensajero getHoramen() {
        return horamen;
    }

    public void setHoramen(Mensajero horamen) {
        this.horamen = horamen;
    }
    
    
    }
    

