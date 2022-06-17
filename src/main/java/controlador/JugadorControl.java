/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Jugador;
import servicio.JugadorServicio;

/**
 *
 * @author alexa
 */
public class JugadorControl {
    private final JugadorServicio jugadorservicio = new JugadorServicio();
    
    public Jugador crear(String[]args){
        var jugador = new Jugador(args[0],Integer.valueOf(args[1]),args[2],args[3]);
        this.jugadorservicio.crear(jugador);
        return jugador;
    }
    
    public List<Jugador>listar(){
        return this.jugadorservicio.listar();
    }
    
}
