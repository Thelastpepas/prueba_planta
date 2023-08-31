package udem.edu.co.com.modelo.entity;

import udem.edu.co.com.modelo.clases.Planta;

public class Cebolla extends  Planta{
    private String nombre;
    private  int edad;
    private  String tipo;
    private  int promediovida;

    public String getNombre() {
        return nombre;
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

    @Override
    public String toString() {
        return "Cebolla{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", tipo='" + tipo + '\'' +
                ", promediovida=" + promediovida +
                '}';
    }

    public Cebolla(String nombre, int edad, String tipo, int promediovida) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
        this.promediovida = promediovida;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
