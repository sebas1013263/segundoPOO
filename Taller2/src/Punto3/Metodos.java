package Punto3;
import java.util.HashSet;
import java.util.TreeSet;

public class Metodos {

    private HashSet<Estudiante> asistencia = new HashSet<>();



    public void RegistrarEstudiante(Estudiante estudiante){
        boolean r = asistencia.add(estudiante);
        if (r) {
            System.out.println("✅ Asistencia registrada para: " + estudiante.getNombre());
        } else {
            System.out.println("⚠️ El estudiante " + estudiante.getNombre() + " ya estaba registrado.");
        }
    }

    public void MostrarEstudiante(){

        if(asistencia.isEmpty()){
            System.out.println("No hay estudiantes registrados");

        }else{
            System.out.println("Lista de Estudiantes: ");
            for(Estudiante est : asistencia){
                System.out.println(est);
            }
        }
    }

    public void VerificarEstudiante(String nombre) {
        for (Estudiante est : asistencia) {
            if (est.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println( "El estudiante: " + nombre + " asistió.");
                return;
            }
        }
        System.out.println("El estudiante: " + nombre + " no está registrado.");
    }


}
