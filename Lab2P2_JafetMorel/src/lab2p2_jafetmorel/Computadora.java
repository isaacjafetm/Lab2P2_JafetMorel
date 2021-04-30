/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_jafetmorel;

/**
 *
 * @author 24661
 */
public class Computadora {
    private String modelo;
    private int numeroserie, capdisco, pantalla;
    private boolean tnumerico;
    private String procesador, tgrafica, sistema;
    private int tiempo, capbateria, duracion;

    public Computadora(String modelo, int numeroserie, int capdisco, int pantalla, boolean tnumerico, String procesador, String tgrafica, String sistema, int tiempo, int capbateria, int duracion) {
        this.modelo = modelo;
        this.numeroserie = numeroserie;
        this.capdisco = capdisco;
        this.pantalla = pantalla;
        this.tnumerico = tnumerico;
        this.procesador = procesador;
        this.tgrafica = tgrafica;
        this.sistema = sistema;
        this.tiempo = tiempo;
        this.capbateria = capbateria;
        this.duracion = duracion;
    }

    public int getPantalla() {
        return pantalla;
    }

    public void setPantalla(int pantalla) {
        this.pantalla = pantalla;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumeroserie() {
        return numeroserie;
    }

    public void setNumeroserie(int numeroserie) {
        this.numeroserie = numeroserie;
    }

    public int getCapdisco() {
        return capdisco;
    }

    public void setCapdisco(int capdisco) {
        this.capdisco = capdisco;
    }

    public boolean isTnumerico() {
        return tnumerico;
    }

    public void setTnumerico(boolean tnumerico) {
        this.tnumerico = tnumerico;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getTgrafica() {
        return tgrafica;
    }

    public void setTgrafica(String tgrafica) {
        this.tgrafica = tgrafica;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getCapbateria() {
        return capbateria;
    }

    public void setCapbateria(int capbateria) {
        this.capbateria = capbateria;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Los atributos de la computadora son los siguientes:" + " modelo:" + modelo + ", numero de serie:" + numeroserie + ", capacidad de disco duro:" + capdisco + ", tamaño de pantalla:" + pantalla + ", teclado numérico" + tnumerico + ", tipo de procesador" + procesador + ", tarjeta grafica:" + tgrafica + ", sistema operativo:" + sistema + ", tiempo que tardó en fabricarse: " + tiempo + ", capacidad de bateria=" + capbateria + " horas, duración de batería: " + duracion + " horas.";
    }
    
    
}
