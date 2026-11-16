package com.javier;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonaTest {

    @Test
    void fromString_ShouldReturnPersona_WhenInputIsValid() {
        // Arrange
        String input = "Juan, Garcia,25,juan@email.com";

        // Act
        Persona persona = Persona.fromString(input);

        // Assert
        assertNotNull(persona);
        assertEquals("Juan", persona.getNombre());
        assertEquals("Garcia", persona.getApellido());
        assertEquals(25, persona.getEdad());
        assertEquals("juan@email.com", persona.getEmail());
    }

    @Test
    void fromString_ShouldThrowException_WhenInputIsNull() {
        String input = null;
        assertThrows(IllegalArgumentException.class, () -> Persona.fromString(input));
    }

    @Test
    void fromString_ShouldThrowException_WhenInputIsEmpty() {
        assertThrows(IllegalArgumentException.class, () -> Persona.fromString("   "));
    }

    @Test
    void fromString_ShouldThrowException_WhenFormatIsInvalid() {
        assertThrows(IllegalArgumentException.class, () -> Persona.fromString("Juan,Garcia,25"));
    }

    @Test
    void fromString_ShouldThrowException_WhenAgeIsNotANumber() {
        assertThrows(IllegalArgumentException.class, () -> Persona.fromString("Juan,Garcia,veinte,juan@email.com"));
    }
}

