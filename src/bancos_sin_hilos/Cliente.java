/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancos_sin_hilos;

/**
 *
 * @author s109e8
 */
public class Cliente {
    private String nombre;
    private TipoSolicitud tipoSolicitud;

    public Cliente(String nombre, TipoSolicitud tipoSolicitud) {
        this.nombre = nombre;
        this.tipoSolicitud = tipoSolicitud;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoSolicitud getTipoSolicitud() {
        return tipoSolicitud;
    }
    
    
    
    
}
