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
import logica.Servicio;

/**
 *
 * @author Julian
 */
public class ServicioDAO {
    Servicio serv = new Servicio();
    
    public void RegistrarServicio(String tipoId, long numId, String tipoIdcli, long numIdCli, long id_ciudad){
        try {
            System.out.println("entro");
            String sql = "INSERT INTO \"Servicio\" VALUES (default,?,?,?,?,?,?,?,?,?,?,?,?)";
            System.out.println("medio");
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            System.out.println("despues");
            PreparedStatement stm = conexion.prepareStatement(sql);
            stm.setString(1, serv.getN_tipo_de_paquete());
            
            stm.setDate(2, serv.getF_dia_servicio());
            stm.setTime(3, serv.getH_hora_inicio());
            stm.setString(4,serv.getI_estado_servicio() );
            stm.setString(5,serv.getI_ida_vuelta());
            stm.setDouble(6, serv.getV_costo_servicio());
            stm.setString(7, tipoIdcli);
            stm.setLong(8, numIdCli);
            stm.setString(9, tipoId);
            stm.setLong(10, numId);
            stm.setDouble(11,0 );
            stm.setLong(12, id_ciudad);
            stm.executeUpdate();
            stm.close();
            ServiceLocator.getInstance().commit();
            System.out.println("termino xd");
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }finally{
            ServiceLocator.getInstance().liberarConexion();
        } 
        
    }

    public Servicio getServ() {
        return serv;
    }

    public void setServ(Servicio serv) {
        this.serv = serv;
    }
    
    
}
