/*
 * Esta clase tiene como objetivo ser la plantilla de estadisticas para empleado.
*/
package Estadisticas;

import Modelo.Empleado;
import java.util.ArrayList;

/**
 *
 * @author GOMEZ GOMEZ BRYAN ULISES
 * @version: 1.0
 */
public class EmpleadoEstadisticas {
    private ArrayList<Empleado> empleados;

    /**
    * Constructor por defecto de la clase
    */
    public EmpleadoEstadisticas(){};

     /**
    * Constructor paramétrizado de la clase
    * @param empleados: inicializa el valor de la lista de empleados
    */
    public EmpleadoEstadisticas(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    /**
    * Método de acceso(setter) del atributo empleados
    * @param empleados: establece el valor de empleados
    */
    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    /**
    * Método de acceso(getter) del atributo empleados
    * @return empleados
    */
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    /**
    * Método para obtener el número total de empleados
    * @return Número total de empleados
    */
    public int obtenerNumeroDeEmpleados() {
        return this.empleados.size();
    }

    /**
    * Método para obtener el número de empleados de sexo masculino
    * @return Número de empleados de sexo masculino
    */
    public int obtenerNumeroDeEmpleadosMasculino() {
        int masculino = 0;
        String MASCULINO = "Masculino";
        for(Empleado e: this.empleados){
            if( MASCULINO.equals(e.getSexo())) {
                masculino += 1;
            }
        }
        
        return masculino;
    }

    /**
    * Método para obtener el número de empleados de sexo femenino
    * @return Número de empleados de sexo femenino
    */
    public int obtenerNumeroDeEmpleadosFemenino(){
        return this.obtenerNumeroDeEmpleados() - this.obtenerNumeroDeEmpleadosMasculino();
    }

    /**
    * Método para obtener el empleado con el salario menor
    * @return Empleado con el salario menor
    */
    public Empleado obtenerEmpleadoSalarioMenor(){
        int max = this.empleados.size() - 1;
        return this.empleados.get(max);
    }

    /**
    * Método para obtener el empleado con el salario mayor
    * @return Empleado con el salario mayor
    */
    public Empleado obtenerEmpleadoSalarioMayor(){
        return this.empleados.get(0);
    }

    /**
    * Método para obtener el salario promedio
    * @return Salario promedio
    */
    public double obtenerSalarioPromedio(){
        double total = 0;
        for(Empleado e: this.empleados){
            total += e.getSalario();
        }

        return total / this.obtenerNumeroDeEmpleados();
    }
}
