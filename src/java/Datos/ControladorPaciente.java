/*
 * Esta clase tiene como objetivo proporcionar los métodos de conexión a la base de datos para Paciente.
*/

package Datos;

import Modelo.Paciente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author RANGEL PAREDES ANA SOFIA
 * @version: 1.0
 */
public class ControladorPaciente extends Controlador {
    private static final String TABLE = "pacientes";
    
    public ControladorPaciente(Controlador controlador) {
    }

    /**
     * Método para consultar la lista de pacientes de la base de datos
     * @return lista de pacientes
     */
    public ArrayList<Paciente> consultarPacientes(String extraQuery){
        ArrayList<Paciente> pacientes = new ArrayList<>();
        
        Statement st;
        try {
            st = super.conexion.createStatement();
            String query = "SELECT * FROM " + TABLE + extraQuery;
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                Paciente paci = new Paciente();
                paci.setNSS(rs.getString("NSS"));
                paci.setNombre(rs.getString("NOMBRE"));
                paci.setEdad(rs.getInt("EDAD"));
                paci.setDiagnostico(rs.getString("DIAGNOSTICO"));
                pacientes.add(paci);
            };
        } catch (SQLException ex) {
            System.out.println("SQL Error: " + ex.getMessage());
        }
        
        return pacientes;
    }

    /**
     * Método para agregar un paciente a la base de datos
     * @param paciente: paciente a agregar
     * @return estado de si se agregó el paciente
     */
    public boolean agregarPaciente(Paciente paciente) {
        boolean estado = false;
        PreparedStatement ps; 
        String query = "INSERT INTO " + TABLE + " VALUES (?, ?, ?, ?)";
        try {
            ps = super.conexion.prepareStatement(query);
            ps.setString(1, paciente.getNSS());
            ps.setString(2, paciente.getNombre());
            ps.setInt(3, paciente.getEdad());
            ps.setString(4, paciente.getDiagnostico());
            ps.execute();
            estado = true;
        } catch (SQLException ex) {
            System.out.println("SQL Error: " + ex.getMessage());
        }
    
        return estado;
    }

    /**
     * Método para eliminar un paciente de la base de datos
     * @param NSS: Número de seguridad social
     * @return estado de si se borró el paciente
     */
    public boolean eliminarPaciente(String NSS) {
        boolean estado = false;
        PreparedStatement ps; 
        String query = "DELETE FROM " + TABLE + " WHERE NSS=?";
        try {
            ps = super.conexion.prepareStatement(query);
            ps.setString(1, NSS);
            ps.execute();
            estado = true;
        } catch (SQLException ex) {
            System.out.println("SQL Error: " + ex.getMessage());
        }
    
        return estado;
    }

    public ResultSet getAllPacientes() {
        return null;
    }




}
