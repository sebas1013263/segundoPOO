package Punto2;
import java.util.Scanner;
import java.util.LinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do{
            System.out.println("------MENU----------");
            System.out.println("1. Insertar CAlificacion");
            System.out.println("2. Obtener promedio de calificacion");
            System.out.println("3. Eliminar ultima Calificacion");
            System.out.println("4. Imprimir Calificaciones");
            System.out.println("5. Salir");

            System.out.println("Ingrese una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch(opcion){
                case 1:
                    System.out.println("Inserte la calificacion: ");
                    Double calificacion = sc.nextDouble();
                    metodos.agregarCalificaciones(new Calificaciones(calificacion));

                case 2:
                    System.out.println("Obteniendo el promedio de calificaciones.......");
                    metodos.promedio();
                    break;

                case 3:
                    System.out.println("Eliminando ultima Calificacion... ");
                    metodos.eliminarultimaCalificaciones();
                    break;

                case 4:
                    System.out.println("Imprimiendo Calificaciones.......");
                    metodos.MostrarCalificaciones();
                    break;

                case 5:
                    System.out.println("Saliendo.......");
                    break;

                default:
                    System.out.println("Opcion no valida");
            }


        }while (opcion != 5);

        sc.close();
    }
}
