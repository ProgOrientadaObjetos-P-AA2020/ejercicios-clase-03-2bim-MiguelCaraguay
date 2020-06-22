/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetesiete;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        /*
        clase uno abstracta llamada Figura; con atributos:
        características y área; la clase debe tener un método
        abstracto calcular_area.
        - clase llamada Triángulo (hereda de Figura); con
        atributos: base y altura.
        - clase llamada Rombo (hereda de Figura) con atributo: diagonal_menor y 
        diagonal mayor.
        - clase llamada Cuadrado (hereda Figura) con: atributos: lado.
        - clase Ejecutor, que permite generar:
            4 objetos de tipo Cuadrado
            3 objetos de tipo Rombo
            5 objeto de Triángulo 
            Comprobar el concepto del polimorfismo.
         */

        // inicio de la solución
        Scanner entrada = new Scanner(System.in);
        double lado;
        double base;
        double altura;
        double diagonal_mayor;
        double diagonal_menor;
        ArrayList<Figura> figuras = new ArrayList<>();
        // Ingreso de cuadrados
        for (int i = 0; i < 4; i++) {
            System.out.printf("Ingrese lado del cuadrado (%d)\n", i + 1);
            lado = entrada.nextDouble();
            Cuadrado c = new Cuadrado(lado);
            figuras.add(c);
        }
        // Ingreso de Rombos
        for (int i = 0; i < 3; i++) {
            System.out.printf("Ingrese diagonal mayor del rombo (%d)\n", i + 1);
            diagonal_mayor = entrada.nextDouble();
            System.out.printf("Ingrese diagonal menor del rombo (%d)\n", i + 1);
            diagonal_menor = entrada.nextDouble();
            Rombo r = new Rombo(diagonal_mayor, diagonal_menor);

            figuras.add(r);
        }
        // ingreso de triangulos
        for (int i = 0; i < 5; i++) {
            System.out.printf("Ingrese base del triangulo (%d)\n", i + 1);
            base = entrada.nextDouble();
            System.out.printf("Ingrese altura del triangulo (%d)\n", i + 1);
            altura = entrada.nextDouble();
            Triangulo t = new Triangulo(base, altura);
            figuras.add(t);
        }

        // proceso para comprobar el polimorfismo
        for (int i = 0; i < figuras.size(); i++) {
            // 1.  
            figuras.get(i).calcular_area();

            System.out.printf("Datos de Figura\n"
                    + "%s\n",
                    figuras.get(i));
        }
    }
}
