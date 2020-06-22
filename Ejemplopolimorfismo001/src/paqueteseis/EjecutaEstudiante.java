package paqueteseis;

import java.util.ArrayList;
import java.util.Scanner;
//import paquetecuatro.Estudiante;

public class EjecutaEstudiante {

    public static void main(String[] args) {

        /*
        Generar un proceso que permita ingresar n número 
        de estudiantes. 
        El usuario decide de manera prevía cuantos objetos
        de tipo EstudiantePresencial y EstudianteDistancia
        quiere ingresar.
        
         */
        Scanner entrada = new Scanner(System.in);
        String nombresEst;
        String apellidosEst;
        String identificacionEst;
        int edadEst;
        double costoCred;
        int numeroCreds;
        double costoAsig;
        int numeroAsigs;
        int nEstPresencial;
        int nEstDistancia;
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        // inicio de solución
        System.out.println("Ingrese numero de estudiantes Presencial a ingresar");
        nEstPresencial = entrada.nextInt();
        System.out.println("Ingrese numero de estudiantes Distancia a ingresar");
        nEstDistancia = entrada.nextInt();

        System.out.println("Ingreso Estudiantes Presencial");
        // ciclo para ingresar daros de Estudiantes Presencial
        for (int i = 0; i < nEstPresencial; i++) {
            System.out.printf("Estudiante Presencial %d\n", i + 1);
            System.out.println("Ingrese los nombres del estudiante");
            entrada.nextLine();
            nombresEst = entrada.nextLine();
            System.out.println("Ingrese los apellidos del estudiante");
            apellidosEst = entrada.nextLine();
            System.out.println("Ingrese la identificación del estudiante");
            identificacionEst = entrada.nextLine();
            System.out.println("Ingrese la edad del estudiante");
            edadEst = entrada.nextInt();
            // Declarar,crear e iniciar objeto tipo EstudiantePresencial
            EstudiantePresencial estudianteP
                    = new EstudiantePresencial(nombresEst, apellidosEst);
            // Solicitar ingreso de valores para variables 
            // Solicitar numeroCreds, costoCred
            // Leer numeroCreds, costoCred
            System.out.println("Ingrese el número de créditos");
            numeroCreds = entrada.nextInt();
            System.out.println("Ingrese el costo de cada créditos");
            costoCred = entrada.nextDouble();
            // se hace uso de los métodos establecer para asignar valores
            // a los datos (atributos) del objeto
            estudianteP.establecerIdentificacionEstudiante(identificacionEst);
            estudianteP.establecerEdadEstudiante(edadEst);
            estudianteP.establecerNumeroCreditos(numeroCreds);
            estudianteP.establecerCostoCredito(costoCred);
            // Se agrega al arreglo estudiantes un objeto de tipo
            // EstudiantePresencial
            estudiantes.add(estudianteP);
        }
        System.out.println("Ingreso Estudiantes Distancia");
        // ciclo para ingresar daros de Estudiantes Distancia
        for (int i = 0; i < nEstDistancia; i++) {
            System.out.printf("Estudiante Distancia %d\n", i + 1);

            System.out.println("Ingrese los nombres del estudiante");
            entrada.nextLine();
            nombresEst = entrada.nextLine();
            System.out.println("Ingrese los apellidos del estudiante");
            apellidosEst = entrada.nextLine();
            System.out.println("Ingrese la identificación del estudiante");
            identificacionEst = entrada.nextLine();
            System.out.println("Ingrese la edad del estudiante");
            edadEst = entrada.nextInt();
            // Declarar,crear e iniciar objeto tipo EstudianteDistancia
            EstudianteDistancia estudianteD
                    = new EstudianteDistancia(nombresEst, apellidosEst);
            // Solicitar ingreso de valores para variables 
            // Solicitar numeroAsigs, costoAsig 
            // Leer numeroAsigs, costoAsig
            System.out.println("Ingrese el número de asignaturas");
            numeroAsigs = entrada.nextInt();
            System.out.println("Ingrese el costo de cada cada asignatura");
            costoAsig = entrada.nextDouble();

            // se hace uso de los métodos establecer para asignar valores
            // a los datos (atributos) del objeto
            estudianteD.establecerIdentificacionEstudiante(identificacionEst);
            estudianteD.establecerEdadEstudiante(edadEst);
            estudianteD.establecerNumeroAsginaturas(numeroAsigs);
            estudianteD.establecerCostoAsignatura(costoAsig);

            // Se agrega al arreglo estudiantes un objeto de tipo
            // EstudianteDistancia
            estudiantes.add(estudianteD);
        }

        // ciclo que permite comprobar el polimorfismo
        // este código no debe ser modificado.
        for (int i = 0; i < estudiantes.size(); i++) {
            // 1.  
            estudiantes.get(i).calcularMatricula();

            System.out.printf("Datos Estudiante\n"
                    + "%s\n",
                    estudiantes.get(i));

        }
    }

}
