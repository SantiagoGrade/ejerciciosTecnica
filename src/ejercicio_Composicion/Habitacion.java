package ejercicio_Composicion;

public class Habitacion {
    private int numeroHabitacion;
    private double sizeHabitacion;

    public Habitacion(int numeroHabitacion, double sezeHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
        this.sizeHabitacion = sezeHabitacion;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }


    public double getSizeHabitacion() {

        return sizeHabitacion;
    }

    @Override
    public String toString() {
        return "numero de habitaciones: " + numeroHabitacion +
                ", Tamaño de habitaciones: " + sizeHabitacion;
    }
}
