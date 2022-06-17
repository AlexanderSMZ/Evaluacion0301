/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Jugador;

/**
 *
 * @author alexa
 */
public interface IJugadorServicio {
    
    public Jugador crear(Jugador jugador);
    public Jugador buscarPorCedula(int cedulaJugador);
    public List<Jugador> listar();
    
}
