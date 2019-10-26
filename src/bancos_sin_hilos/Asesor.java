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
public class Asesor {

    private String nombre;
    

    public Asesor(String nombre) {
        this.nombre = nombre;
    }

    public void atenderCliente(Cliente cliente, long tiempoInicio) {
        int inicioSegundos = (int)tiempoInicio/1000;
        
        System.out.println(inicioSegundos+"s - Asedor:" + this.nombre
                + " inicia atencion al cliente " + cliente.getNombre());

        switch (cliente.getTipoSolicitud()) {

            case CREDITO_HIPOTECARIO:
                simulacionTiempo(15);
                break;
            case COMPRA_CARTERA:
                simulacionTiempo(8);
                break;
            case CRETIDO_LIBRE_INVERSION:
                simulacionTiempo(10);
                break;
            case TARJETA_CREDITO:
                simulacionTiempo(5);
                break;

        }
        
        int finalizaSegundos = (int)System.currentTimeMillis()/1000;
        
         System.out.println(finalizaSegundos+"s - Asedor:" + this.nombre
                + " Finalizo la atención del cliente " + cliente.getNombre());
        

    }
    private void simulacionTiempo(int segundos){
        
        try {
            Thread.sleep(segundos*1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Asesor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
