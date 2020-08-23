/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import DBConnection.CaException;
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

    public Mensajeria() {
        this.personaDAO = new PersonaDAO();
        this.clienteDAO = new ClienteDAO();
        this.mensajeroDAO = new MensajeroDAO();
        this.telefonoDAO = new TelefonoDAO();

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

    //TELÉFONO
    public void IncluirTelefono() throws CaException {
        telefonoDAO.incluirTelefono();
    }

    public Telefono getTelefono() {
        return telefonoDAO.getTelefono();
    }

}
