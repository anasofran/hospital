/*
 * Esta clase tiene como objetivo proporcionar los métodos de conexión a la base de datos para Empleado.
*/

package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author GOMEZ GOMEZ BRYAN ULISES
 * @version: 1.0
 */
public class Controlador {
    private static final String USER = "root"; 
    private static final String PASSWORD = "root";
    private static final String BD = "ProyectoE15";
    private static final String URL = "jdbc:mysql://localhost:3306/";
    
    public Connection conexion;
   
    /**
    * Método para iniciar la conexión
    * @return estado: Estado de la conexión (Falsa o Verdadera).
    */
    public boolean conectar(){
        boolean estado = false;
        
        try {
                Class.forName("com.mysql.cj.jdbc.Driver"); 
                conexion = DriverManager.getConnection(URL + BD, USER, PASSWORD);
                if(conexion != null){
                    estado = true;
                    System.out.println("Conexión exitosa!");
                }
            } catch (ClassNotFoundException ex) {
                System.out.println("Error: " + ex.getMessage());
            } catch (SQLException ex) {
                System.out.println("SQL Error: " + ex.getMessage());
            }
        
        return estado;
    }
   
    /**
    * Método para finalizar la conexión
    */
    public void desconectar(){
        try{
            conexion.close();
            System.out.println("Desconectado");
        } catch (SQLException ex) {
                System.out.println("SQL Error: " + ex.getMessage());
        }
    }
}
