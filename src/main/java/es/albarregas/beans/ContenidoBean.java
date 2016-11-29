/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.beans;

/**
 *
 * @author Antonio
 */
public class ContenidoBean {
    private boolean daños;
    // ESTA CANTIDAD ES DOUBLE
    private int valor;
    private int franquicia;
    private double prima;

    public double getPrima() {
        return prima;
    }

    public void setPrima(double prima) {
        this.prima = prima;
    }

    public boolean isDaños() {
        return daños;
    }

    public void setDaños(boolean daños) {
        this.daños = daños;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getFranquicia() {
        return franquicia;
    }

    public void setFranquicia(int franquicia) {
        this.franquicia = franquicia;
    }

}
