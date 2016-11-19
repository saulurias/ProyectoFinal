/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.pou.entidades;

/**
 * Entidad que posee los metodos y atributos del objeto Producto 
 * @author SaulUrias
 */
public class Producto {
    private int id;
    private String nombre;
    private int costo;
    private int valorHambre;
    private int valorSalud;
    private int valorEnergia;
    private int valorFelicidad;
    private int cantidad;
   
    /**
     * Constructor de la entidad Producto
     * @param id
     * @param nombre
     * @param costo
     * @param valorHambre
     * @param valorSalud
     * @param valorEnergia
     * @param valorFelicidad
     * @param cantidad 
     */
    public Producto(int id, String nombre, int costo, int valorHambre, int valorSalud, int valorEnergia, int valorFelicidad, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.costo = costo;
        this.valorHambre = valorHambre;
        this.valorSalud = valorSalud;
        this.valorEnergia = valorEnergia;
        this.valorFelicidad = valorFelicidad;
        this.cantidad = cantidad;
    }

    
    /**
    * Metodo que obtiene el valor del atributo id de la entidad Producto
    * @return 
    */
    public int getId() {
        return id;
    }

    /**
     * Metodo que asigna el atributo id a la entidad Producto
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
    * Metodo que obtiene el valor del atributo nombre de la entidad Producto
    * @return 
    */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que asigna el atributo nombre a la entidad Producto
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    /**
    * Metodo que obtiene el valor del atributo costo de la entidad Producto
    * @return 
    */
    public int getCosto() {
        return costo;
    }

    /**
     * Metodo que asigna el atributo costo a la entidad Producto
     * @param costo 
     */
    public void setCosto(int costo) {
        this.costo = costo;
    }

    /**
    * Metodo que obtiene el valor del atributo valorHambre de la entidad Producto
    * @return 
    */
    public int getValorHambre() {
        return valorHambre;
    }

    /**
     * Metodo que asigna el atributo valorHambre a la entidad Producto
     * @param valorHambre 
     */
    public void setValorHambre(int valorHambre) {
        this.valorHambre = valorHambre;
    }
    
    /**
    * Metodo que obtiene el valor del atributo valorSalud de la entidad Producto
    * @return 
    */
    public int getValorSalud() {
        return valorSalud;
    }

    /**
     * Metodo que asigna el atributo valorSalud a la entidad Producto
     * @param valorSalud 
     */
    public void setValorSalud(int valorSalud) {
        this.valorSalud = valorSalud;
    }

    /**
    * Metodo que obtiene el valor del atributo valorEnergia de la entidad Producto
    * @return 
    */
    public int getValorEnergia() {
        return valorEnergia;
    }

    /**
     * Metodo que asigna el atributo valorEnergia a la entidad Producto
     * @param valorEnergia 
     */
    public void setValorEnergia(int valorEnergia) {
        this.valorEnergia = valorEnergia;
    }

    /**
    * Metodo que obtiene el valor del atributo valorFelicidad de la entidad Producto
    * @return 
    */
    public int getValorFelicidad() {
        return valorFelicidad;
    }

    /**
     * Metodo que asigna el atributo valorFelicidad a la entidad Producto
     * @param valorFelicidad 
     */
    public void setValorFelicidad(int valorFelicidad) {
        this.valorFelicidad = valorFelicidad;
    }

    /**
    * Metodo que obtiene el valor del atributo cantidad de la entidad Producto
    * @return 
    */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Metodo que asigna el atributo cantidad a la entidad Producto
     * @param cantidad 
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
   
}
