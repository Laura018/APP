/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import DBConnection.CaException;
import DBConnection.ServiceLocator;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import logica.Mensajero;

/**
 *
 * @author ADMIN
 */
public class MensajeroDAO {
    private Mensajero mensajero;
    
    public MensajeroDAO(){
        mensajero = new Mensajero();
    }
    
    public void incluirMensajero() throws CaException {
        
        try {
            String sql = "INSERT INTO \"Mensajero\" VALUES (?,?,?,?,?,?,?,?,?)";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(sql);
            prepStmt.setString(1, mensajero.getK_tipo_id_mensajero());
            prepStmt.setLong(2, mensajero.getK_numero_id_mensajero());
            prepStmt.setDate(3, mensajero.getF_fecha_de_nacimiento());
            prepStmt.setString(4, mensajero.getI_sexo());
            prepStmt.setString(5, mensajero.getI_coriza_seguridad());
            prepStmt.setString(6, mensajero.getNacionalidad());
            prepStmt.setString(7, mensajero.getN_tipo_de_transporte());
            prepStmt.setString(8, mensajero.getN_capacidad_de_transporte());
            prepStmt.setInt(9, mensajero.getV_calificacion_prom());
            
            prepStmt.executeUpdate();
            prepStmt.close();
            ServiceLocator.getInstance().commit();

        } catch (SQLException e) {
            throw new CaException("MensajeroDAO", "No pudo registar al nuevo Cliente" + e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }
    }
    
    public void setMensajero(Mensajero mensajero){
        this.mensajero = mensajero;
    }
    
    public Mensajero getMensajero(){
        return mensajero;
    }
    
}
