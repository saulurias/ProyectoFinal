/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.libreriaPou.entidades;

/**
 * Entidad que posee los metodos y atributos de la entidad Pou
 * @author SaulUrias
 */
public class Pou {
    private int dinero;
    private int valorHambre;
    private int valorSalud;
    private int valorEnergia;
    private int valorFelicidad;

    /**
     * Constructor de la entidad Pou
     * @param dinero
     * @param valorHambre
     * @param valorSalud
     * @param valorEnergia
     * @param valorFelicidad 
     */
    public Pou(int dinero, int valorHambre, int valorSalud, int valorEnergia, int valorFelicidad) {
        this.dinero = dinero;
        this.valorHambre = valorHambre;
        this.valorSalud = valorSalud;
        this.valorEnergia = valorEnergia;
        this.valorFelicidad = valorFelicidad;
    }

    /**
     * Metodo que obtiene el atributo dinero de la entidad Pou
     * @return 
     */
    public int getDinero() {
        return dinero;
    }

    /**
     * Metodo que asigna el atributo dinero a la entidad Pou
     * @param dinero 
     */
    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    
    /**
     * Metodo que obtiene el atributo valorHambre de la entidad Pou
     * @return 
     */
    public int getValorHambre() {
        return valorHambre;
    }

    /**
     * Metodo que asigna el atributo valorHambre a la entidad Pou
     * @param valorHambre 
     */
    public void setValorHambre(int valorHambre) {
        this.valorHambre = valorHambre;
    }

    /**
     * Metodo que obtiene el atributo valorSalud de la entidad Pou
     * @return 
     */
    public int getValorSalud() {
        return valorSalud;
    }

    /**
     * Metodo que asigna el atributo valorSalud a la entidad Pou
     * @param valorSalud 
     */
    public void setValorSalud(int valorSalud) {
        this.valorSalud = valorSalud;
    }

    /**
     * Metodo que obtiene el atributo valorEnergia de la entidad Pou
     * @return 
     */
    public int getValorEnergia() {
        return valorEnergia;
    }
    
    /**
     * Metodo que asigna el atributo valorEnergia a la entidad Pou
     * @param valorEnergia 
     */
    public void setValorEnergia(int valorEnergia) {
        this.valorEnergia = valorEnergia;
    }

    /**
     * Metodo que obtiene el atributo valorFelicidad de la entidad Pou
     * @return 
     */
    public int getValorFelicidad() {
        return valorFelicidad;
    }

    /**
     * Metodo que asigna el atributo valorFelicidad a la entidad Pou
     * @param valorFelicidad 
     */
    public void setValorFelicidad(int valorFelicidad) {
        this.valorFelicidad = valorFelicidad;
    }
}
