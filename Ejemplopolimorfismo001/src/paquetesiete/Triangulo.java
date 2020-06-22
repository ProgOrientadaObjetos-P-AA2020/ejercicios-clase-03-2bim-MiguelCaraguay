/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetesiete;

/**
 *
 * @author reroes
 */
public class Triangulo extends Figura {

    private double base;
    private double altura;

    public Triangulo(double b, double a) {
        establecerBase(b);
        establecerAltura(a);
    }

    public void establecerBase(double b) {
        base = b;
    }

    public void establecerAltura(double b) {
        altura = b;
    }

    @Override
    public void calcular_area() {
        area = (base * altura) / 2;
    }

    public double obtenerBase() {
        return base;
    }

    public double obtenerAltura() {
        return altura;
    }

    public String toString() {
        String cadena = String.format("Triangulo\nCaracteristicas:\n"
                + "Base: %.2f\nAltura: %.2f\n"
                + "Area %.2f\n", obtenerBase(), obtenerAltura(),
                obtenerArea());
        return cadena;
    }
}
