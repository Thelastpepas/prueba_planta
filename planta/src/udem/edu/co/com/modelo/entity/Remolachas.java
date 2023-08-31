package udem.edu.co.com.modelo.entity;

import udem.edu.co.com.modelo.clases.Planta;

public class Remolachas extends Planta {

    private String nombre;
    private  int edad;
    private  int promediovida;

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Remolachas{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", promediovida=" + promediovida +
                '}';
    }

    public Remolachas(String nombre, int edad, int promediovida) {
        this.nombre = nombre;
        this.edad = edad;
        this.promediovida = promediovida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPromediovida() {
        return promediovida;
    }

    public void setPromediovida(int promediovida) {
        this.promediovida = promediovida;
    }

    @Override
    public void plantar() {

    }
}
