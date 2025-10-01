package com.clases;

public class Televisor extends ProductoElectrodomestico {

    private int tamañoPulgadas;
    private String resolucion;
    


    //Constructor

    public Televisor(String nombre, double precio, int cantidadDisponible, int tamañoPulgadas, String resolucion) {
        super(nombre, precio, cantidadDisponible);
        this.tamañoPulgadas = tamañoPulgadas;
        this.resolucion = resolucion;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tamaño (pulgadas): " + tamañoPulgadas);
        System.out.println("Resolución: " + resolucion);
        }
        }
