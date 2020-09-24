/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Util.LeerMatriz_Excel;
import java.io.IOException;

/**
 *
 * @author madar
 */
public class PruebaLeerExcelVendedor {
    public static void main(String[] args) throws IOException {
        LeerMatriz_Excel myExcel=new LeerMatriz_Excel("src/Datos/vendedores.xls",0);
        String datos[][]=myExcel.getMatriz();
        for(String filas[]:datos)
        {
                for(String datoColumna:filas)
                    System.out.print(datoColumna+"\t");
        System.out.println("\n");
        }
    }
    
}
