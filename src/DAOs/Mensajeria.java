/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import DBConnection.CaException;
import java.sql.SQLException;
import logica.*;

/**
 *
 * @author ADMIN
 */
public class Mensajeria {

    private PersonaDAO personaDAO;
    private ClienteDAO clienteDAO;
    private MensajeroDAO mensajeroDAO;
    private TelefonoDAO telefonoDAO;
    private HorarioDAO horarioDAO;
    private ServicioDAO servicioDAO;
    private CiudadDAO ciudadDAO;
    private ActividadDAO actividadDAO;

    public Mensajeria() {
        this.personaDAO = new PersonaDAO();
        this.clienteDAO = new ClienteDAO();
        this.mensajeroDAO = new MensajeroDAO();
        this.telefonoDAO = new TelefonoDAO();
        this.horarioDAO = new HorarioDAO();
        this.servicioDAO = new ServicioDAO();
        this.ciudadDAO = new CiudadDAO();
        this.actividadDAO = new ActividadDAO();
    }

    //PERSONA
    public void IncluirPersona() throws CaException {
        personaDAO.incluirPersona();
    }

    public Persona getPersona() {
        return personaDAO.getPersona();
    }

    //CLIENTE
    public void IncluirCliente() throws CaException {
        clienteDAO.incluirCliente();
    }

    public Cliente getCliente() {
        return clienteDAO.getCliente();
    }

    //MENSAJERO
    public void IncluirMensajero() throws CaException {
        mensajeroDAO.incluirMensajero();
    }

    public Mensajero getMensajero()  {
        return mensajeroDAO.getMensajero();
    }
    
    //HORARIO
    public void IncluirHorarioMensajero(int i){
        horarioDAO.InsertarHorarioMensajero(i);
    }
    
    public Mensajero getHorarioMensajero(){
        return horarioDAO.getHoramen();
    }
    
    //SERVICIO
    public void RegistrarServicio(String tipoId, long numId, String tipo_id_cli,
            long num_id_cli, long id_ciudad){
        servicioDAO.RegistrarServicio(tipoId,numId,tipo_id_cli,num_id_cli,id_ciudad);
    }
    
    public Servicio getServicio(){
        return servicioDAO.getServ();
    }

    //TELÉFONO
    public void IncluirTelefono() throws CaException {
        telefonoDAO.incluirTelefono();
    }

    public Telefono getTelefono() {
        return telefonoDAO.getTelefono();
    }
    
    //CIUDAD
    public long ObtenerCiudad(String n_ciudad) throws SQLException{
        return ciudadDAO.obtenerCiudad(n_ciudad);
    }
    
    //ACTIVIDAD
    public int ObtenerNumActividades(int cod_servicio){
        return actividadDAO.ObtenerNumeroActividades(cod_servicio);
    }
    
    public Actividad getActividad(){
        return actividadDAO.getAct();
    }

}
