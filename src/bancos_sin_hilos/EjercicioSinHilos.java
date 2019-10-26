/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancos_sin_hilos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author s109e8
 */
public class EjercicioSinHilos {
    
  
    public static void main(String[] args) {
        
        
        try {
            System.out.println("Inicio del ejercicio");
            
            
            long tiempoInicio = System.currentTimeMillis();
            
            Asesor asesorJuam = new Asesor("Juan");
            Asesor asesorMaria = new Asesor("Maria");
            
            Cliente cliente1 = new Cliente("Carlos 01", TipoSolicitud.TARJETA_CREDITO);
            Cliente cliente2 = new Cliente("Sandra 02", TipoSolicitud.CREDITO_HIPOTECARIO);
            Cliente cliente3 = new Cliente("Felipe 03", TipoSolicitud.CRETIDO_LIBRE_INVERSION);
            Cliente cliente4 = new Cliente("Lina 04", TipoSolicitud.COMPRA_CARTERA);
            
            //Thread.sleep(2000);
            
            asesorJuam.atenderCliente(cliente1, tiempoInicio);
            tiempoInicio = System.currentTimeMillis();
            asesorJuam.atenderCliente(cliente2, tiempoInicio);
            tiempoInicio = System.currentTimeMillis();
            asesorMaria.atenderCliente(cliente3, tiempoInicio);  
            tiempoInicio = System.currentTimeMillis();
            asesorMaria.atenderCliente(cliente4, tiempoInicio); 
            
            System.out.println("Fin del ejercicio");
        } catch (Exception ex) {
            Logger.getLogger(EjercicioSinHilos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
}
