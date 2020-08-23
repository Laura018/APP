/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import logica.Persona;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import DBConnection.CaException;
import DBConnection.ServiceLocator;

/**
 *
 * @author ADMIN
 */
public class PersonaDAO {

    private Persona persona;

   public PersonaDAO() {
        persona = new Persona();
    }

    public void incluirPersona() throws CaException {
        try {
            String sql = "INSERT INTO \"Persona\" VALUES (?,?,?,?,?,?,?,?);";
            
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(sql);
            prepStmt.setString(1, persona.getK_tipo_id());
            prepStmt.setLong(2, persona.getK_numero_id());
            prepStmt.setString(3, persona.getN_primer_nombre());
            prepStmt.setString(4, persona.getN_segundo_nombre());
            prepStmt.setString(5, persona.getN_primer_apellido());
            prepStmt.setString(6, persona.getN_segundo_apellido());
            prepStmt.setString(7, persona.getN_rol());
            prepStmt.setString(8, persona.getO_correo());
            prepStmt.executeUpdate();
            prepStmt.close();
            ServiceLocator.getInstance().commit();

        } catch (SQLException e) {
            throw new CaException("PersonaDAO", "No pudo registar a la nueva persona" + e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Persona getPersona() {
        return persona;
    }
    
    
}
