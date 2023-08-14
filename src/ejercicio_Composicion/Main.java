package ejercicio_Composicion;

public class Main {
    public static void main(String[] args){
        Habitacion habitacion1 = new Habitacion(1,22);
        Habitacion habitacion2 = new Habitacion(2,10);
        Habitacion habitacion3 = new Habitacion(3,5);


        Casa casa = new Casa();

        casa.agregarHabitacion(habitacion1);
        casa.agregarHabitacion(habitacion2);
        casa.agregarHabitacion(habitacion3);

        casa.mostrarInformacioncasa();

        casa.destruirCasa();

        casa.mostrarInformacioncasa();


    }
}
