package ejercicio_Agregacion;

public class Estudiantes {
    private String nombre;
    private int edad;
    private int numeroEstudiante;

    public Estudiantes(String nombre, int edad, int numeroEstudiante) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroEstudiante = numeroEstudiante;
    }

    @Override
    public String toString() {
        return
                "Nombre Estudiante: " + nombre  +
                ", edad del estudiante: " + edad +
                ", Numero del estudiante: " + numeroEstudiante
                ;
    }
}
