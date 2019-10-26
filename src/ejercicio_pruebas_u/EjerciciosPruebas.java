/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_pruebas_u;

/**
 *
 * @author s109e8
 */
public class EjerciciosPruebas {
    
    public static void main(String[] args) {
        System.out.println("Calculadora ");
        double numeroA = 5;
        double numeroB= 3;
        
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.suma(numeroA, numeroB);
        System.out.println(""+resultado);
    }
    
}
