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
public class Modulo extends Thread{
    
    
    private Asesor asesor;
    private Cliente[] clientes;
    private long inicio; 

    public Modulo(Asesor asesor, Cliente[] clientes, long inicio) {
        this.asesor = asesor;
        this.clientes = clientes;
        this.inicio = inicio;
    }
    
    
    
    private void asignarModulo(Asesor asesor, Cliente[] clientes, long tiempoInicio){
        
        this.asesor = new Asesor(asesor.getNombre());
        //this.clientes = clientes:
        this.inicio = tiempoInicio;
        
    }
    
    private void iniciarAtencionModulo(Modulo modulo, long tiempoInicio){
        
        
        /*long tiempoInicioAtencion = inicio;
        for(int = 0; )*/
        
        for (int i = 0; i < modulo.clientes.length; i++) { 
				//this.run(modulo.clientes[i]); 
				//System.out.println("Procesado el producto " + (i + 1) +  

        }
        
    }

    @Override
    public void run() {
        super.run(); //To change body of generated methods, choose Tools | Templates.
        //iniciarAtencionModulo();
    }
    
    
    
}
