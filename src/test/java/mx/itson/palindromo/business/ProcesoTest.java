/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package mx.itson.palindromo.business;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Kevin
 */
public class ProcesoTest {
    
    public ProcesoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of invertirCadena method, of class Proceso.
     */
    @Test
    public void testInvertirCadena() {
        System.out.println("invertirCadena");
        String cadena = "rotor";
        String expResult = "rotor";
        String result = Proceso.invertirCadena(cadena);
        assertEquals(expResult, result);
    }

    /**
     * Test of quitarAcentos method, of class Proceso.
     */
    @Test
    public void testQuitarAcentos() {
        System.out.println("quitarAcentos");
        String cadena = "34-.Ró_34Tor_";
        String expResult = "34-.Ro_34Tor_";
        String result = Proceso.quitarAcentos(cadena);
        assertEquals(expResult, result);
    }

    /**
     * Test of limpiarCadena method, of class Proceso.
     */
    @Test
    public void testLimpiarCadena() {
        System.out.println("limpiarCadena");
        String cadena = "34-.Ró_34Tor_";
        String expResult = "rotor";
        String result = Proceso.limpiarCadena(cadena);
        assertEquals(expResult, result);
    }

    /**
     * Test of esPalindromo method, of class Proceso.
     */
    @Test
    public void testEsPalindromo() {
        System.out.println("esPalindromo");
        String cadena = "34-.Ró_34Tor_";
        boolean expResult = true;
        boolean result = Proceso.esPalindromo(cadena);
        assertEquals(expResult, result);
    }
    
}
