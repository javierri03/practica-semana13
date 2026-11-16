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

    /**
     * Crea instancia de persona por cadena delimitada por comas
     * Formato esperado: "nombre,apellido,edad,email"
     * 
     * @param data Cadena de texto con los datos separados por comas
     * @return Una nueva instancia de Persona
     * @throws IllegalArgumentException si la cadena es nula, vacia, no tiene 4 campos o la edad no es un número válido.
     */
    public static Persona fromString(String data){
        if(data == null || data.trim().isEmpty()){
            throw new IllegalArgumentException("la cadena de entrada no puede ser nula ni estar vacía");
        }

        String[] partes = data.split(",");
        if(partes.length != 4) throw new IllegalArgumentException("Se esperaban 4 campos. Formato invalido");

        try{
            String nombre = partes[0].trim();
            String apellido = partes[1].trim();
            int edad = Integer.parseInt(partes[2].trim());
            String email = partes[3].trim();

            return new Persona(nombre, apellido, edad, email);
        }catch(NumberFormatException e){
            throw new IllegalArgumentException("La edad debe ser un numero entero valido");
        }
    }
}
