package Punto1;
import java.util.ArrayList;

public class Metodos {
  private ArrayList<Persona> personas;

  public Metodos() {
      personas = new ArrayList<>();
  }

  public void insertar(Persona persona){
      personas.add(persona);
      System.out.println("Agregada exitosamente");
  }

  public void eliminar(String nombre){
      boolean eliminado = false;
      for (int i = 0; i<personas.size(); i++){
        if(personas.get(i).getNombre().equalsIgnoreCase(nombre)){
          personas.remove(i);
          eliminado = true;
          System.out.println("Eliminado exitosamente");
          break;
        }

      }
      if (!eliminado){
          System.out.println("No existe esa persona con ese nombre");
      }
  }

  public void buscar(String nombre){
      boolean encontrado = false;
      for (int i = 0; i<personas.size(); i++){
          if(personas.get(i).getNombre().equalsIgnoreCase(nombre)){
              System.out.println("Persona encontrada....");
              encontrado = true;
              break;
          }
      }
      if (!encontrado){
          System.out.println("No existe esa persona con ese nombre");
      }
  }

  public void mostrar(){
      if(personas.isEmpty()){
          System.out.println("La lista esta vacia");
      } else {
          System.out.println("Lista de Personas:");
          for (Persona persona : personas) {
              System.out.println(persona);
          }
      }
  }



}
