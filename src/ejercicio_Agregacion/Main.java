package ejercicio_Agregacion;

public class Main {
    public static void main(String[] args){
        Estudiantes estudiante1 = new Estudiantes("Francisco",22,100);
        Estudiantes estudiante2 = new Estudiantes("Carlos",32,200);
        Estudiantes estudiante3 = new Estudiantes("Pedro",42,400);

        Universidad universidad = new Universidad("Universidad XYZ");

        universidad.agregarEstudiante(estudiante1);
        universidad.agregarEstudiante(estudiante2);
        universidad.agregarEstudiante(estudiante3);


        System.out.printf(universidad.getNombre()+"\n");
        universidad.getEstudiantes();


    }

}
