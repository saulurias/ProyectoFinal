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
public class Pou {
    private int dinero;
    private int valorHambre;
    private int valorSalud;
    private int valorEnergia;
    private int valorFelicidad;

    public Pou(int dinero, int valorHambre, int valorSalud, int valorEnergia, int valorFelicidad) {
        this.dinero = dinero;
        this.valorHambre = valorHambre;
        this.valorSalud = valorSalud;
        this.valorEnergia = valorEnergia;
        this.valorFelicidad = valorFelicidad;
    }

    public Pou() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
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
}
