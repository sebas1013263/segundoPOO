package Punto2;
import Punto1.Persona;

import java.util.Iterator;
import java.util.LinkedList;

public class Metodos {

    private LinkedList<Calificaciones> calificaciones;

    public Metodos() {
        calificaciones = new LinkedList<>();
    }

    public void agregarCalificaciones(Calificaciones calificacion){
        calificaciones.add(calificacion);
    }

    public void MostrarCalificaciones(){
        if(calificaciones.isEmpty()){
            System.out.println("No hay calificaciones");
        }else {
            Iterator<Calificaciones> it = calificaciones.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
        }
    }

    public void promedio(){
        if(calificaciones.isEmpty()){
            System.out.println("No hay calificaciones");
        }else {
            double suma=0;
            for(Calificaciones calificacion: calificaciones){
                suma += calificacion.getCalificacion();
            }
            double promedio = suma/calificaciones.size();
            System.out.println("Promedio: "+promedio);
        }

    }

    public void eliminarultimaCalificaciones(){
        if(calificaciones.isEmpty()){
            System.out.println("No hay calificaciones");
        }else {
            calificaciones.removeLast();
            System.out.println("Se elimino la ultima calificacion");
        }
    }
}
