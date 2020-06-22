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
public class Rombo extends Figura {

    private double diagonalMayor;
    private double diagonalMenor;

    public Rombo(double dMa, double dMe) {
        establecerDiagonalMayor(dMa);
        establecerDiagonalMenor(dMe);
    }

    public void establecerDiagonalMayor(double d) {
        diagonalMayor = d;
    }

    public void establecerDiagonalMenor(double d) {
        diagonalMenor = d;
    }

    @Override
    public void calcular_area() {
        area = (diagonalMayor * diagonalMenor) / 2;
    }

    public double obtenerDiagonalMayor() {
        return diagonalMayor;
    }

    public double obtenerDiagonalMenor() {
        return diagonalMenor;
    }

    public String toString() {
        String cadena = String.format("Rombo\nCaracteristicas:\n"
                + "Diagonal Mayor: %.2f\nDiagonalMenor: %.2f\n"
                + "Area %.2f\n", obtenerDiagonalMayor(), obtenerDiagonalMenor(),
                obtenerArea());
        return cadena;
    }
}
