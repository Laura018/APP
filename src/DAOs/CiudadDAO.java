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
import logica.Ciudad;

/**
 *
 * @author Julian
 */
public class CiudadDAO {
    Ciudad city =  new Ciudad();
    
    
    public long obtenerCiudad(String n_ciudad) {
        try{
            String sql = "select  k_id_ciudad from \"Ciudad\" where n_nombre = ?";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(sql);
            prepStmt.setString(1,n_ciudad);
            ResultSet rs = prepStmt.executeQuery();
         
            long id_ciudad = rs.getLong(1);
            prepStmt.close();
            
            return id_ciudad;
        }catch(SQLException ex){
            System.out.println(ex);
            return 0;
        }
        
     
       
        
    }
    
}
