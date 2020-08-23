/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import DBConnection.CaException;
import DBConnection.ServiceLocator;
import logica.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ADMIN
 */
public class ClienteDAO {

    private Cliente cliente;

    public ClienteDAO() {
        cliente = new Cliente();

    }

    public void incluirCliente() throws CaException {
        
        try {
            String sql = "INSERT INTO \"Cliente\" VALUES (?,?,?)";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(sql);
            prepStmt.setString(1, cliente.getK_tipo_id());
            prepStmt.setLong(2, cliente.getK_numero_id());
            prepStmt.setString(3, cliente.getN_direccion());
            prepStmt.executeUpdate();
            prepStmt.close();
            ServiceLocator.getInstance().commit();

        } catch (SQLException e) {
            throw new CaException("ClienteDAO", "No pudo registar al nuevo Cliente" + e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
