package com;

import com.clases.*;

public class Aplicacion {
    public static void main(String[] args) {

        // TIENDA
        TiendaElectronica tienda = new TiendaElectronica();

        // TELEVISOR
        Televisor tv1 = new Televisor("Samsung QLED", 1200.00, 10, 55, "4K UHD");
        Televisor tv2 = new Televisor("LG OLED evo AI G5", 2500.00, 25, 80, "8K UHD");

        // COMPUTADORA
        Computadora comp1 = new Computadora("MacBook Air 13", 1299.99, 3, "Apple", 32, 123456789);
        Computadora comp2 = new Computadora("Asus TUF Gaming", 1509.99, 5, "Asus", 64, 987654321);

        // PARLANTES
        ProductoElectrodomestico productoGenerico = new ProductoElectrodomestico("Bocina JBL", 99.99, 15);
        ProductoElectrodomestico productoGenerico2 = new ProductoElectrodomestico("Bocina Sony Serie X", 299.99, 3);

        // AGREGAR PRODUCTOS A LA TIENDA
        tienda.agregarProducto(tv1);
        tienda.agregarProducto(tv2);
        tienda.agregarProducto(comp1);
        tienda.agregarProducto(comp2);
        tienda.agregarProducto(productoGenerico);
        tienda.agregarProducto(productoGenerico2);

        // MOSTRAR PRODUCTOS
        System.out.println("----- Productos Electronicos -----");
        tienda.mostrarProductos();

        // VENTAS DE PRODUCTOS
        System.out.println("----- Realizando Ventas -----");
        tienda.venderProducto("Samsung QLED");
        tienda.venderProducto("MacBook Air 13");
        tienda.venderProducto("Bocina JBL");
        tienda.venderProducto("Bocina Sony Serie X");
        tienda.venderProducto("Asus TUF Gaming");
        tienda.venderProducto("LG OLED evo AI G5");

        // INVENTARIO
        System.out.println("----- Inventario Final -----");
        tienda.mostrarProductos();
    }
}
