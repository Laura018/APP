/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import DBConnection.ServiceLocator;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import logica.Actividad;

/**
 *
 * @author Julian
 */
public class ActividadDAO {
    Actividad act = new Actividad();
    int num;
    
    public void RegistrarActividades(int cod_servicio){
        try{
            String sql = "INSERT INTO \"Actividad\" VALUES (default,?,?,?)";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement stm = conexion.prepareStatement(sql);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
        
    }
    
    public int ObtenerNumeroActividades(int cod_servicio){
        try{
            String sql = "SELECT COUNT(a.k_codigo_servicio) FROM \"Actividad\" a WHERE a.k_codigo_servicio = ?;";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(sql);
            prepStmt.setInt(1,cod_servicio);
            ResultSet rs = prepStmt.executeQuery();
        while (rs.next()) {
            num= rs.getInt(1);
        }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
        return num;
    }

    public Actividad getAct() {
        return act;
    }

    public void setAct(Actividad act) {
        this.act = act;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    
    
}
