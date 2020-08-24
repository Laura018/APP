/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnection;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Julian
 */
public class ServiceLocator {

    private Connection conexion;
    private static ServiceLocator obj = null;
    private boolean conexionLibre = true;
    
    ServiceLocator() {
        try {
            String url = "jdbc:postgresql://localhost:5432/Mensajeria";
            String user = "postgres";
            String password = "1000502719";
            conexion = DriverManager.getConnection(url, user, password);
            JOptionPane.showMessageDialog(null, "Connected with Success");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Something went wrong" + e);
        }
    }

    public static ServiceLocator getInstance() {
        try {
            if (obj == null) {
                obj = new ServiceLocator();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return obj;
    }
    
    public synchronized void liberarConexion() {
		while (conexionLibre) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		conexionLibre = true;
		notify();
	}

    
    
    public synchronized Connection tomarConexion() {
		while (!conexionLibre) {
			try {
			  wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		conexionLibre = false;
		notify();
		return conexion;
	}
    
    public void close() {
        try {
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void commit() {
		try {
			conexion.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
