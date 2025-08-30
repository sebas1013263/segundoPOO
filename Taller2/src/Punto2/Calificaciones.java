package Punto2;

public class Calificaciones {
    private Double calificacion;

    public Calificaciones(Double calificacion) {
        this.calificacion = calificacion;
    }

    public Double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "calificacion: " + calificacion;
    }
}
