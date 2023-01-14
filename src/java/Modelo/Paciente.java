/*
 * Esta clase tiene como objetivo ser la plantilla para un paciente.
*/
package Modelo;

/**
 *
 * @author RANGEL PAREDES ANA SOFIA
 * @version: 1.0
 */
public class Paciente {
    private String NSS;
    private String nombre;
    private int edad;
    private String diagnostico;
    
    /**
    * Constructor por defecto de la clase
    */
    public Paciente(){};

    /**
    * Constructor paramétrizado de la clase
    * @param NSS: inicializa el valor del numero de seguridad social
    * @param nombre: inicializa el valor del nombre
    * @param edad: inicializa el valor del edad
    * @param diagnostico: inicializa el valor de diagnostico
    */
    public Paciente(String NSS, String nombre, int edad, String diagnostico) {
        this.NSS = NSS;
        this.nombre = nombre;
        this.edad = edad;
        this.diagnostico = diagnostico;
  
    }

    /**
    * Método de acceso(setter) del atributo NSS
    * @param NSS: establece el valor de NSS
    */
    public void setNSS(String NSS) {
        this.NSS = NSS;
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
    * Método de acceso(setter) del atributo diagnostico
    * @param diagnostico: establece el valor de diagnostico
    */
    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    /**
    * Método de acceso(getter) del atributo NSS
    * @return NSS
    */
    public String getNSS() {
        return NSS;
    }

    /**
    * Método de acceso(getter) del atributo nombre
    * @return nombre
    */
    public String getNombre() {
        return nombre;
    }

    /**
    * Método de acceso(getter) del atributo edad
    * @return edad
    */
    public int getEdad() {
        return edad;
    }

    /**
    * Método de acceso(getter) del atributo diagnostico
    * @return diagnostico
    */
    public String getDiagnostico() {
        return diagnostico;
    }

    
    /**
    * Método toString
    * @return Cadena de carácteres con los valores de cada atributo de la clase.
    */
    @Override
    public String toString() {
        return "Paciente" + "/nNSS: " + NSS + ", Nombre: " + nombre + ", Edad: " + edad + ", Diagnostico: " + diagnostico;
    }
}