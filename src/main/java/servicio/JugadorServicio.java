/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Jugador;

/**
 *
 * @author alexa
 */
public class JugadorServicio implements IJugadorServicio{

    private static List<Jugador> jugadorList = new ArrayList<>();
    
    @Override
    public Jugador crear(Jugador jugador) {
        this.jugadorList.add(jugador);
        return jugador;
    }

    @Override
    public Jugador buscarPorCedula(int cedulaJugador) {
        Jugador jugador=null;
        for(var j:this.jugadorList){
            if(cedulaJugador==j.getCedula()){
                jugador=j;
                break;
            }
        }
        return jugador;
    }

    @Override
    public List<Jugador> listar() {
        return this.jugadorList;
    }
    
    
}
