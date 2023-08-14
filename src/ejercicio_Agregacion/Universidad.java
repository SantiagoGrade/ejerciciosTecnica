package ejercicio_Agregacion;

import java.util.Arrays;

public class Universidad {
    private String nombre = "Universidad XYZ";
    private Estudiantes[] estudiantes;
    private int inicializarVector;
    private int contadorEstudiantes;

    public Universidad(String nombre){
        this.nombre = nombre;
        inicializarVector = 100;
        contadorEstudiantes = 0;
        this.estudiantes = new Estudiantes[inicializarVector];

    }

    public void agregarEstudiante(Estudiantes estudiantes){
        if (contadorEstudiantes>=100){
            System.out.println("No se puede agregar mas de 100 estudiantes");
        }else{
            this.estudiantes[contadorEstudiantes] = estudiantes;
            this.contadorEstudiantes++;
        }
    }
    public int getContadorEstudiantes() {
        return contadorEstudiantes;
    }

    public String getNombre(){
        return nombre;
    }

    public void  getEstudiantes(){
        for(int i = 0; i < contadorEstudiantes; i++){
            System.out.println("- " + estudiantes[i].toString());
        }
    }
}
