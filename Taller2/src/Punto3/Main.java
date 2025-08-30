package Punto3;
import java.util.TreeSet;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do{
            System.out.println("------MENU----------");
            System.out.println("1. Agregar Estudiante");
            System.out.println("2. Verificar si un estudiante asisitio");
            System.out.println("3. Mostrar lista de estudiantes presentyes");
            System.out.println("4. Salir");

            System.out.println("Ingrese una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();


            switch(opcion){
                case 1:
                    System.out.println("Ingrese el nombtre del estudiante que asisitio: ");
                    String nombre = sc.nextLine().trim();
                    metodos.RegistrarEstudiante(new Estudiante(nombre));
                    break;

                case 2:
                    System.out.println("Ingrese el nombre del estudiante a buscar: ");
                    String nombre2 = sc.nextLine().trim();
                    metodos.VerificarEstudiante(nombre2);
                    break;

                case 3:
                    System.out.println("-----LISTA DE ASISTENCIA-----");
                    metodos.MostrarEstudiante();
                    break;

                case 4:
                    System.out.println("saliendo....");
                    break;



                default:
                    System.out.println("Opcion no valida");
            }


        }while (opcion != 4);

        sc.close();
    }
}
