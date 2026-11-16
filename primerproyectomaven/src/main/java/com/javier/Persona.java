package com.javier;

/**
 * Clase que representa a persona con datos basicos de contacto
 * 
 * @author Javier Rodriguez Iglesias
 */

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String email;

    /**
     * Constructor para crear una nueva instancia de Persona.
     * 
     * @param nombre Nombre de la persona.
     * @param apellido Apellido de la persona.
     * @param edad Edad en años.
     * @param email Direccion del correo electrónico.
     */

    public Persona(String nombre, String apellido, int edad, String email){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.email = email;
    }

    /**
     * Obtiene nombre
     * 
     * @return nombre actual.
     */

    public String getNombre() { return nombre; }

    /**
     * Obtiene el apellido de la persona.
     * 
     * @return El apellido actual.
     */

    public String getApellido() { return apellido; }

    /**
     * Obtiene la edad de la persona.
     * 
     * @return La edad en años.
     */

    public int getEdad() { return edad; }

    /**
     * Obtiene el correo electrónico de la persona.
     * 
     * @return El email de contacto.
     */
    
    public String getEmail() { return email; }
}
