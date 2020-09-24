/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Negocio.SistemaVentas;
import java.io.IOException;

/**
 *
 * @author madar
 */
public class Prueba_SistemaVentas_Excel {
    
    public static void main(String[] args) throws IOException {
        SistemaVentas mySistema=new SistemaVentas("src/Datos/vendedores.xls");
        System.out.println("Mi sistema tiene los vendedores: \n"+mySistema.toString());
        
    }
    
}
