/*
 * Esta clase tiene como objetivo proporcionar los métodos de conexión a la base de datos para Empleado.
*/

package Datos;

import Modelo.Empleado;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author GOMEZ GOMEZ BRYAN ULISES
 * @version: 1.0
 */
public class ControladorEmpleado extends Controlador {
    private static final String TABLE = "Empleados";
    
    /**
     * Método para consultar la lista de empleados de la base de datos
     * @return lista de empleados
     */
    public ArrayList<Empleado> consultarEmpleados(String extraQuery){
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        Statement st;
        try {
            st = super.conexion.createStatement();
            String query = "SELECT * FROM " + TABLE + extraQuery;
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                Empleado e = new Empleado();
                e.setNoEmpleado(rs.getInt("noEmpleado"));
                e.setNombre(rs.getString("nombre"));
                e.setEdad(rs.getInt("edad"));
                e.setSexo(rs.getString("sexo"));
                e.setSalario(rs.getDouble("salario"));
                empleados.add(e);
            };
        } catch (SQLException ex) {
            System.out.println("SQL Error: " + ex.getMessage());
        }
        
        return empleados;
    }

    /**
     * Método para agregar un empleado a la base de datos
     * @param empleado: empleado a agregar
     * @return estado de si se agregó el empleado
     */
    public boolean agregarEmpleado(Empleado empleado) {
        boolean estado = false;
        PreparedStatement ps; 
        String query = "INSERT INTO " + TABLE + " VALUES (?, ?, ?, ?)";
        try {
            ps = super.conexion.prepareStatement(query);
            ps.setInt(1, empleado.getNoEmpleado());
            ps.setString(2, empleado.getNombre());
            ps.setInt(3, empleado.getEdad());
            ps.setString(4, empleado.getSexo());
            ps.setDouble(5, empleado.getSalario());
            ps.execute();
            estado = true;
        } catch (SQLException ex) {
            System.out.println("SQL Error: " + ex.getMessage());
        }
    
        return estado;
    }

    /**
     * Método para eliminar un empleado de la base de datos
     * @param noEmpleado: Número de empleado
     * @return estado de si se borró el empleado
     */
    public boolean eliminarEmpleado(int noEmpleado) {
        boolean estado = false;
        PreparedStatement ps; 
        String query = "DELETE FROM " + TABLE + " WHERE noEmpleado=?";
        try {
            ps = super.conexion.prepareStatement(query);
            ps.setInt(1, noEmpleado);
            ps.execute();
            estado = true;
        } catch (SQLException ex) {
            System.out.println("SQL Error: " + ex.getMessage());
        }
    
        return estado;
    }
}
