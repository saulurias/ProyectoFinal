/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.pou.entidades;

/**
 *
 * @author SaulUrias
 */
public class Producto {
private String nombre;
    private int costo;
    private int valorHambre;
    private int valorSalud;
    private int valorEnergia;
    private int valorFelicidad;
    private int cantidad;
    
    public Producto(String nombre, int costo, int valorHambre, int valorSalud, int valorEnergia, int valorFelicidad, int cantidad) {
        this.nombre = nombre;
        this.costo = costo;
        this.valorHambre = valorHambre;
        this.valorSalud = valorSalud;
        this.valorEnergia = valorEnergia;
        this.valorFelicidad = valorFelicidad;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getValorHambre() {
        return valorHambre;
    }

    public void setValorHambre(int valorHambre) {
        this.valorHambre = valorHambre;
    }

    public int getValorSalud() {
        return valorSalud;
    }

    public void setValorSalud(int valorSalud) {
        this.valorSalud = valorSalud;
    }

    public int getValorEnergia() {
        return valorEnergia;
    }

    public void setValorEnergia(int valorEnergia) {
        this.valorEnergia = valorEnergia;
    }

    public int getValorFelicidad() {
        return valorFelicidad;
    }

    public void setValorFelicidad(int valorFelicidad) {
        this.valorFelicidad = valorFelicidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    

 

    
    
}
