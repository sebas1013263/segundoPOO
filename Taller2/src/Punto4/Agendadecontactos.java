package Punto4;
import java.util.Scanner;
import java.util.TreeMap;

public class Agendadecontactos {
    public static void main(String[] args) {
        TreeMap<String, String> agenda = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("--------AGENDA DE CONTACTOS--------");
            System.out.println("1. Registrar un contacto");
            System.out.println("2. Buscar numero por el nombre");
            System.out.println("3. Mostrar todos los contactos");
            System.out.println("4. Eliminar contactos");
            System.out.println("5. Salir del programa");

            System.out.println("Ingrese una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del contacto: ");
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese el numero de contacto: ");
                    String numero = sc.nextLine();
                    agenda.put(nombre, numero);
                    System.out.println("Agregado exitosamente...................");
                    break;

                case 2:
                    System.out.println("Ingrese el nombre del contacto a buscar: ");
                    String nombre2 = sc.nextLine().trim();
                    if (agenda.containsKey(nombre2)) {
                        System.out.println("El telefono de: " + nombre2 + " Es: " + agenda.get(nombre2));
                    } else {
                        System.out.println("Contacto no encontrado...............");
                    }
                    break;
                case 3:
                    if (agenda.isEmpty()) {
                        System.out.println("No hay contactos agregados...............");
                    } else {
                        System.out.println("------Lista de contactos encontrados------");
                        for (String Nombre : agenda.keySet()) {
                            System.out.println("Nombre: " +Nombre + " Telefono: " + agenda.get(Nombre));
                        }
                    }
                    break;
                case 4:
                    System.out.println("Ingrese el nombre del contacto a eliminar: ");
                    String nombre3 = sc.nextLine().trim();
                    if (agenda.remove(nombre3) != null) {
                        System.out.println("Contacto eliminado");
                    } else {
                        System.out.println("Contacto no encontrado");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo......");
                    break;

                default:
                    System.out.println("Opcion no valida");


            }

        }while (opcion != 5) ;

        sc.close();

    }
}
