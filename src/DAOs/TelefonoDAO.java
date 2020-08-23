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
import logica.Cliente;
import logica.Telefono;

/**
 *
 * @author ADMIN
 */
public class TelefonoDAO {
    private Telefono telefono;

    public TelefonoDAO (){
        telefono = new Telefono();

    }

    public void incluirTelefono() throws CaException {
        
        try {
            String sql = "INSERT INTO \"Telefono\" VALUES (?,?,?)";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(sql);
            prepStmt.setLong(1, telefono.getTelefono());
            prepStmt.setLong(2, telefono.getK_numero_id());
            prepStmt.setString(3, telefono.getK_tipo_id());
            prepStmt.executeUpdate();
            prepStmt.close();
            ServiceLocator.getInstance().commit();

        } catch (SQLException e) {
            throw new CaException("TelefonoDAO", "No pudo registar el número de teléfono" + e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }
    }

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
