/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author alexa
 */
public class Jugador {
    
    private String nombre;
    private int cedula;
    private String disciplina;
    private String posicion;

    public Jugador(String nombre, int cedula, String disciplina, String posicion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.disciplina = disciplina;
        this.posicion = posicion;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", cedula=" + cedula 
                + ", disciplina=" + disciplina + ", posicion=" + posicion + '}';
    }

}
