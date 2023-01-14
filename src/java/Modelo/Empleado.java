/*
 * Esta clase tiene como objetivo ser la plantilla para un empleado.
*/
package Modelo;

/**
 *
 * @author GOMEZ GOMEZ BRYAN ULISES
 * @version: 1.0
 */
public class Empleado {
    private int noEmpleado;
    private String nombre;
    private int edad;
    private String sexo;
    private double salario;
    
    /**
    * Constructor por defecto de la clase
    */
    public Empleado(){};

    /**
    * Constructor paramétrizado de la clase
    * @param noEmpleado: inicializa el valor del número de empleado
    * @param nombre: inicializa el valor del nombre
    * @param edad: inicializa el valor del edad
    * @param sexo: inicializa el valor del sexo
    * @param salario: inicializa el valor del salario
    */
    public Empleado(int noEmpleado, String nombre, int edad, String sexo, double salario) {
        this.noEmpleado = noEmpleado;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.salario = salario;
    }

    /**
    * Método de acceso(setter) del atributo noEmpleado
    * @param noEmpleado: establece el valor de noEmpleado
    */
    public void setNoEmpleado(int noEmpleado) {
        this.noEmpleado = noEmpleado;
    }

    /**
    * Método de acceso(setter) del atributo nombre
    * @param nombre: establece el valor de nombre
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
    * Método de acceso(setter) del atributo edad
    * @param edad: establece el valor de edad
    */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
    * Método de acceso(setter) del atributo sexo
    * @param sexo: establece el valor de sexo
    */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
    * Método de acceso(setter) del atributo salario
    * @param salario: establece el valor de salario
    */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
    * Método de acceso(getter) del atributo noEmpleado
    * @return noEmpleado
    */
    public int getNoEmpleado() {
        return noEmpleado;
    }

    /**
    * Método de acceso(getter) del atributo nombre
    * @return nombre
    */
    public String getNombre() {
        return nombre;
    }

    /**
    * Método de acceso(getter) del atributo eaad
    * @return eaad
    */
    public int getEdad() {
        return edad;
    }

    /**
    * Método de acceso(getter) del atributo sexo
    * @return sexo
    */
    public String getSexo() {
        return sexo;
    }

    /**
    * Método de acceso(getter) del atributo salario
    * @return salario
    */
    public double getSalario() {
        return salario;
    }
    
    /**
    * Método toString
    * @return Cadena de carácteres con los valores de cada atributo de la clase.
    */
    @Override
    public String toString() {
        return "Empleado{" + "noEmpleado=" + noEmpleado + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", salario=" + salario + '}';
    }
}
