package ejercicio_Composicion;

public class Casa {
    private Habitacion[] habitacion;
    private int contadorHabitaciones;
    int CAPACIDAD_MAXIMA = 100;

    public Casa(){
        this.contadorHabitaciones = 0;
        this.habitacion = new Habitacion[CAPACIDAD_MAXIMA];
    }

    public void agregarHabitacion(Habitacion habitacion){
        if (contadorHabitaciones>=100){
            System.out.println("No se puede agregar mas de 100 habitaciones");
        }else{
            this.habitacion[contadorHabitaciones] = habitacion;
            this.contadorHabitaciones++;
        }
    }

    public void destruirCasa(){
        for(int i = 0; i < contadorHabitaciones; i++){
            habitacion[i] = null;
        }
        contadorHabitaciones = 0;
    }

    public void mostrarInformacioncasa(){
        if(contadorHabitaciones == 0 ){
            System.out.println("La casa no tiene habitaciones");
        }else{
            for(int i = 0; i < contadorHabitaciones; i++){
                System.out.println("- " + habitacion[i].toString());
            }
        }
    }
}
