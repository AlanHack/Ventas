/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 * Clase para el manejo de los datos de un vendedor
 * @author Marco Adarme
 */
public class Vendedor implements Comparable{
    
    private long cedula;
    private String nombre;
    private float ventas[];

    
    /**
     * Constructor vacío para la clase Vendedor
     */
    public Vendedor() {
    }
    
    
    /**
     *  Constructor para crear un vendedor con cedula y nombre
     * @param cedula un dato de tipo long que repreenta la cédula de ciudadanía.
     * @param nombre  un dato de tipo String que almacena los nombres completos del vendedor
     */

    public Vendedor(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }
    
    /**
     *  Crea a un vendedor con sus ventas
     * @param cedula un dato de tipo long que repreenta la cédula de ciudadanía.
     * @param nombre  un dato de tipo String que almacena los nombres completos del vendedor
     * @param listadoVentas es un String que separa las ventas por ","
     */
    public Vendedor(long cedula, String nombre, String listadoVentas) {
        this.cedula = cedula;
        this.nombre = nombre;
        cargarVentas(listadoVentas);
        
    }
    
    

    private void cargarVentas(String listadoVentas)
    {
    String ventasBrutas[]=listadoVentas.split(",");
    // Por ejemplo: Ventas = {96666, 567,3000,2000,123000}
    
    //Pasar el vector que contiene los datos de las ventasBrutas , pasarlo al atributo
    //Debo crear el vector de ventas 
    // T ident[]= new T[tamaño]
    // this.ventas=new float[?????];
    int tamVentas=ventasBrutas.length;
    //Suponemos que tam>0 --> esto se validará usando Excepciones
    //Crear:
    this.ventas=new float[tamVentas];
    
    // ventasBruta pasarlo a ventas pero en float
    
    //recorrer el vector ventasBrutas:
    for(int i=0;i<tamVentas;i++)
        this.ventas[i]=Float.parseFloat(ventasBrutas[i]);
    
    
    
    }
    
    /**
     * Obtiene el valor de la cédula
     * @return un entero con el valor de la cédula
     */
    public long getCedula() {
        return cedula;
    }

    /**
     *  Actualiza el valor de la cédula
     * @param cedula un dato de tipo long que representa la cédula nueva
     */
    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float[] getVentas() {
        return ventas;
    }

    public void setVentas(float[] ventas) {
        this.ventas = ventas;
    }

    @Override
    public String toString() {
        String msg="Vendedor-->" + "cedula=" + cedula + ", nombre=" + nombre + ", Sus ventas son:";
        //obtener los datos de las ventas:
        
        //Foreach
        for(float valorNotas:this.ventas)
            msg+=valorNotas+"\t";
            
        
        return msg;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + (int) (this.cedula ^ (this.cedula >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vendedor other = (Vendedor) obj;
        if (this.cedula != other.cedula) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
    
    
    
}
