package com.clases;

import java.util.ArrayList;

public class TiendaElectronica {
    private ArrayList<ProductoElectrodomestico> listaDeProductos;

    public TiendaElectronica(){
        listaDeProductos = new ArrayList<>();
    }
    


    //AGREGAR PRUDUCTO
    public void agregarProducto(ProductoElectrodomestico producto) {
        listaDeProductos.add(producto);
    }


    //MOSTRAR PRODUCTOS
    public void mostrarProductos() {
        for (ProductoElectrodomestico producto : listaDeProductos) {
            producto.mostrarInformacion();
            System.out.println("-----------------------------");
        }
    }

    //BUSCAR PRODUCTO POR NOMBRE
    
    public ProductoElectrodomestico buscaProductoElectrodomestico(String nombre){
        for (ProductoElectrodomestico producto : listaDeProductos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null;
    }

    //REALIZAR VENTA

    public void venderProducto(String nombre){
        ProductoElectrodomestico producto = buscaProductoElectrodomestico(nombre);
        if (producto != null) {
            if (producto.getCantidadDisponible() > 0) {
                producto.setCantidadDisponible(producto.getCantidadDisponible() - 1);
                System.out.println("Venta realizada: " + producto.getNombre());
            } else {
                System.out.println("Producto agotado: " + producto.getNombre());
            }
        } else {
            System.out.println("Producto no encontrado: " + nombre);
        }
    }
}
