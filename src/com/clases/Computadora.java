package com.clases;

public class Computadora extends ProductoElectrodomestico {
    private String marca;
    private int memoriaRam;
    private double numerodeSerie;

    // Constructor
    public Computadora(String nombre, double precio, int cantidadDisponible, String marca, 
    int memoriaRam, double numerodeSerie) {

        super(nombre, precio, cantidadDisponible);
        this.marca = marca;
        this.memoriaRam = memoriaRam;
        this.numerodeSerie = numerodeSerie;
    }

@Override
    public void mostrarInformacion() {
        System.out.println("Computadora Portátil: " + getNombre() +
                            ", Marca: " + marca +
                            ", RAM: " + memoriaRam + "GB" +
                            ", Serie: " + numerodeSerie +
                            ", Precio: $" + getPrecio() +
                            ", Cantidad: " + getCantidadDisponible());
    }
}