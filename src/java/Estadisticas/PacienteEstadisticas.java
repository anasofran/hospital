/*
 * Esta clase tiene como objetivo ser la plantilla de estadisticas para empleado.
*/
package Estadisticas;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Datos.Controlador;
import Datos.ControladorPaciente;
import Modelo.Paciente;

/**
 *
 * @author RANGEL PAREDES ANA SOFIA 
 * @version: 1.0
 */
public class PacienteEstadisticas {
    private ArrayList<Paciente> pacientes;
    private ControladorPaciente controladorPaciente;

    public PacienteEstadisticas(Controlador controlador) {
        controladorPaciente = new ControladorPaciente(controlador);
    }

    /**
    * Constructor por defecto de la clase
    */
    public PacienteEstadisticas(){};

     /**
    * Constructor paramétrizado de la clase
    * @param pacientes: inicializa el valor de la lista de pacientes
    */
    public PacienteEstadisticas(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    /**
    * Método de acceso(setter) del atributo pacientes
    * @param empleados: establece el valor de pacientes
    */
    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    /**
    * Método de acceso(getter) del atributo pacientes
    * @return pacientes
    */
    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    /**
    * Método para obtener el número total de pacientes
    * @return Número total de pacientes
    */
    public int obtenerNumeroDePacientes() {
        return this.pacientes.size();
    }


    /**
    * Método para obtener la edad promedio
    * @return Edad promedio
    */
    public double obtenerEdadPromedio(){
        double total = 0;
        for(Paciente paci: this.pacientes){
            total += paci.getEdad();
        }

        return total / this.obtenerNumeroDePacientes();
    }

 /**
    * Método para obtener el paciente con mayor tiempo de afiliacion
    * @return Paciente con mayor tiempo de afiliacion
    */

    public Paciente obtenerMAyorAfiliado() throws SQLException {
        int mayorAnio = Integer.MIN_VALUE;
        Paciente mayorAfiliado = null;
        ResultSet pacientes = controladorPaciente.getAllPacientes();
        while (pacientes.next()) {
            String nss = pacientes.getString("NSS");
            String nombre = pacientes.getString("NOMBRE");
            int edad = pacientes.getInt("EDAD");
            String diagnostico = pacientes.getString("DIAGNOSTICO");
            String anioString = nss.substring(2,4);
            int anio = Integer.parseInt(anioString);
            if (anio > mayorAnio) {
                mayorAnio = anio;
                mayorAfiliado = new Paciente(nss, nombre, edad, diagnostico);
            }
        }
        return mayorAfiliado;
    }


    /**
    * Método para obtener el paciente con menor tiempo de afiliacion
    * @return Paciente con menor tiempo de afiliacion
    */
    public Paciente obtenerMenorAfiliado() throws SQLException {
        int menorAnio = Integer.MAX_VALUE;
        Paciente menorAfiliado = null;
        ResultSet pacientes = controladorPaciente.getAllPacientes();
        while (pacientes.next()) {
            String nss = pacientes.getString("NSS");
            String nombre = pacientes.getString("NOMBRE");
            int edad = pacientes.getInt("EDAD");
            String diagnostico = pacientes.getString("DIAGNOSTICO");
            String anioString = nss.substring(2,4);
            int anio = Integer.parseInt(anioString);
            if (anio < menorAnio) {
                menorAnio = anio;
                menorAfiliado = new Paciente(nss, nombre, edad, diagnostico);
            }
        }
        return menorAfiliado;
    }
         
    /**
    * Método para obtener los pacientes con diagnostico iniciando en vocal
    * @return Pacientes con diagnostico que inicia en vocal
    */
    
    public ArrayList<Paciente> diagnosticoVocal() throws SQLException {
        ArrayList<Paciente> pacientesVocales = new ArrayList<>();
        ResultSet pacientes = controladorPaciente.getAllPacientes();
        while (pacientes.next()) {
            String nss = pacientes.getString("NSS");
            String nombre = pacientes.getString("NOMBRE");
            int edad = pacientes.getInt("EDAD");
            String diagnostico = pacientes.getString("DIAGNOSTICO");
            char primerLetraDiagnostico = diagnostico.toLowerCase().charAt(0);
            if (primerLetraDiagnostico == 'a' || primerLetraDiagnostico == 'e' || primerLetraDiagnostico == 'i' || primerLetraDiagnostico == 'o' || primerLetraDiagnostico == 'u') {
                pacientesVocales.add(new Paciente(nss, nombre, edad, diagnostico));
            }
        }
        return pacientesVocales;
    }

    }


