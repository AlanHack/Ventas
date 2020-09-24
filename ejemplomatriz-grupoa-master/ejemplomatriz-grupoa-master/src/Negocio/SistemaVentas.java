/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Modelo.Vendedor;
import Util.LeerMatriz_Excel;
import java.io.IOException;

/**
 * Clase del sistema de ventas
 * @author madarme
 */
public class SistemaVentas {
    
    private Vendedor equipoVentas[];

    public SistemaVentas() {
     
    }

    public SistemaVentas(int numVendedores) {
        
        this.equipoVentas=new Vendedor[numVendedores];
     
    }
    
    /**
     *  Constructor que carga los vendedores a partir de un excel
     * @param rutaArchivo un string con la ruta y el nombre del archivo Ejemplo: src/Datos/vendedores.xls
     * @throws IOException Genera excepción cuando el archivo no existe
     */
    
    public SistemaVentas(String rutaArchivo) throws IOException
    {
        LeerMatriz_Excel myExcel=new LeerMatriz_Excel(rutaArchivo,0);
        String datos[][]=myExcel.getMatriz();
        
        // Normalizar --> Pasar de la matriz de String al modelo del negocio (equipoVentas con cada uno de sus vendedores
        this.equipoVentas=new Vendedor[datos.length-1];
        crearVendedores(datos);
    
    }
    
    
    private void crearVendedores(String datos[][])
    {
    
     for(int fila=1;fila<datos.length;fila++)
     {
         //Crear un Vendedor
         Vendedor nuevo=new Vendedor();
         //Vector de ventas: Creando el espacio
         float ventas[]=new float[datos[fila].length-2];
         
         int indice_venta=0;
         
         for(int columna=0;columna<datos[fila].length;columna++)
         {
         
             if(columna==0)
                 nuevo.setCedula(Long.parseLong(datos[fila][columna]));
             else
             {
                 if(columna==1)
                     nuevo.setNombre(datos[fila][columna]);
                 else //Default
                 {
                     ventas[indice_venta]=Float.parseFloat(datos[fila][columna]);
                     indice_venta++;
                 }
             }
             
         }
         //Asignar el vector de ventas al vendedor:
         nuevo.setVentas(ventas);
         //Asingar el nuevo vendedor al equipo de vendedores:
         this.equipoVentas[fila-1]=nuevo;
      }
    
    }
    
    public Vendedor[] getEquipoVentas() {
        return equipoVentas;
    }

    public void setEquipoVentas(Vendedor[] equipoVentas) {
        this.equipoVentas = equipoVentas;
    }

    @Override
    public String toString() {
        
        String msg="";
            for(Vendedor myVendedor:this.equipoVentas)
                     msg+=myVendedor.toString()+"\n";
        
        return msg;
        
    }
    
    /**
     * Una colección de vendedores que obtuvieron ventas mayores al promedio total de ventas
     * @return  una colección de vendedores
     */
    public Vendedor[] getVendedores_MasVentas()
    {
        return null;
    }
    
    /**
     * Obtiene el nombre de la venta que obtuvo la menor ganancia
     * venta1, ... venta6
     * @return 
     */
    public String getVenta_Menor()
    {
        return "";
    }
    
   /**
    * Obtiene el vendedor que obtuvo la menor venta acumulada
    * @return un objeto de tipo vendedor
    */
    public Vendedor getMenosVentas()
    {
        return null;
    }
    
}
