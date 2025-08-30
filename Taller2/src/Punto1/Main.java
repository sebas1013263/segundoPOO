package Punto1;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do{
            System.out.println("------MENU----------");
            System.out.println("1. Insertar Persona");
            System.out.println("2. Buscar Persona");
            System.out.println("3. Eliminar Persona");
            System.out.println("4. Imprimir Personas");
            System.out.println("5. Salir");

            System.out.println("Ingrese una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch(opcion){
                case 1:
                    System.out.println("Ingrese nombre: ");
                    String nombre1 = sc.nextLine();
                    metodos.insertar(new Persona(nombre1));
                    break;

                case 2:
                    System.out.println("Ingrese nombre: ");
                    String nombre2 = sc.nextLine();
                    metodos.buscar(nombre2);
                    break;

                case 3:
                    System.out.println("Ingrese nombre: ");
                    String nombre3 = sc.nextLine();
                    metodos.eliminar(nombre3);
                    break;

                case 4:
                    System.out.println("Imprimiendo Personas.......");
                    metodos.mostrar();
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
