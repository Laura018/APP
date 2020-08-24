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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Persona;

/**
 *
 * @author ADMIN
 */
public class InicioSesionDAO {

    private Persona persona;

    public InicioSesionDAO() {
        persona = new Persona();
    }

    public boolean LoginUsuario(String tipo_id, long numId) throws CaException {

        String sql = "SELECT * FROM \"Persona\" WHERE k_tipo_id = ? AND k_numero_id = ?;";
        Connection conexion = ServiceLocator.getInstance().tomarConexion();
        try {
            PreparedStatement prepStmt = conexion.prepareStatement(sql);
            prepStmt.setString(1, tipo_id);
            prepStmt.setLong(2, numId);
            ResultSet rs = prepStmt.executeQuery();
            while (rs.next()) {
                if (rs.getString(1).equals(tipo_id) && rs.getLong(2) == numId) {
                    
                    return true;
                } else {
                    return false;
                }
            }prepStmt.close();
            return false;
            
        } catch (SQLException ex) {
            Logger.getLogger(InicioSesionDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }finally{
            ServiceLocator.getInstance().liberarConexion();
        }

    }

    public boolean TipoUsuario(String tipo_id, long numId) throws Exception {
        
        String sql = "SELECT * FROM \"Persona\" WHERE k_tipo_id = ? AND k_numero_id = ?";

        Connection conexion = ServiceLocator.getInstance().tomarConexion();
        PreparedStatement prepStmt = conexion.prepareStatement(sql);
        prepStmt.setString(1, tipo_id);
        prepStmt.setLong(2, numId);
        ResultSet rs = prepStmt.executeQuery();
        prepStmt.close();
        ServiceLocator.getInstance().liberarConexion();
        while (rs.next()) {
            if (rs.getString(1).equals(tipo_id) && rs.getLong(2) == numId && rs.getString(7).equals("Cliente")) {
                return true;
            } else if (rs.getString(1).equals(tipo_id) && rs.getLong(2) == numId && rs.getString(7).equals("Mensajero")) {
                return false;
            }
        }
        return false;

    }
}
