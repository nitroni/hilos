/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco_con_hilos;

/**
 *
 * @author s109e8
 */
public class EjercicioConHilos {
    
     public static void main(String[] args) {
     
         long inicio = System.currentTimeMillis();
            Asesor asesorJuam = new Asesor("Juan");
            Asesor asesorMaria = new Asesor("Maria");
            
            Cliente cliente1 = new Cliente("Carlos 01", TipoSolicitud.TARJETA_CREDITO);
            Cliente cliente2 = new Cliente("Sandra 02", TipoSolicitud.CREDITO_HIPOTECARIO);
            Cliente cliente3 = new Cliente("Felipe 03", TipoSolicitud.CRETIDO_LIBRE_INVERSION);
            Cliente cliente4 = new Cliente("Lina 04", TipoSolicitud.COMPRA_CARTERA);
            
            //Thread.sleep(2000);
           Modulo n1 = new Modulo(asesorJuam, new Cliente[]{cliente1,cliente2}, inicio);
           Modulo n2 = new Modulo(asesorJuam, new Cliente[]{cliente2,cliente3}, inicio);
     }
    
}
