/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Vendedor;

/**
 *
 * @author madar
 */
public class PruebaSistemaVendedor {
    
    
    public static void main(String[] args) {
        /**
         * Es una prueba muy básica de sólo el vendedor
         */
        
        String nombre="María Pérez";
        long cedula=4589744;
        String ventas="2558,45000,32000,1000000,12000";
        
        //Por esta vez para probar la clase vendedor:
        Vendedor nuevoVendedor=new Vendedor(cedula, nombre, ventas);
        
        System.out.println(nuevoVendedor.toString());
        
    }
}
