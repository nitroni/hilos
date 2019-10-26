/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_pruebas_u;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author s109e8
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

    @Test
    public void testSomeMethod() {
    }
    
    @Test
    public void suma(){
        Calculadora miCalculadora = new Calculadora();
        double resultadoObtenido = miCalculadora.suma(5,8);
        double resutadoEspesperado = 13;
        
        assertNotEquals(resutadoEspesperado, resultadoObtenido, 0);
    }
    @Test
    public void resta(){
        Calculadora miCalculadora = new Calculadora();
        double resultadoObtenido = miCalculadora.resta(5,8);
        double resutadoEspesperado = -3;
        
        assertNotEquals(resutadoEspesperado, resultadoObtenido, 0);
    }
    
}
