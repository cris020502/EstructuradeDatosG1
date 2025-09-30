package mx.edu.uttt.arreglos;

import javax.swing.*;
import mx.edu.uttt.poo.Alumno;
public class AlumnoVector {
    public static void main(String[] args) {


        iniciar();
    }
    public static void iniciar() {
        int tamanio=0;
        tamanio = solicitarTamano();


        Alumno [] alumnos =new  Alumno[tamanio];

        menu(alumnos);
    }

    public static void menu(Alumno [] alumnos) {
        boolean sentinel = true;
        String menu="---------- Menu ----------------\n"+
                "1. Llenar Vector \n"+
                "2. Imprimir vector \n"+
                "3. Salir \n"+
                "Elige una opcion",opcion="";



        do {
            opcion=JOptionPane.showInputDialog(menu);
                switch (opcion) {
                    case "1":
                        llenarAlumnos(alumnos);
                        break;
                        case "2":
                            imprimir(alumnos);
                            break;
                        case "3":
                            sentinel = false;
                            break;
                            default: JOptionPane.showMessageDialog(null,"Opcion no valida","Error",JOptionPane.ERROR_MESSAGE);
                }
        }while (sentinel);


    }

    public static void llenarAlumnos(Alumno [] alumnos){
    for(int i=0;i<alumnos.length;i++){
        Alumno a1=new Alumno();
        a1.setNombre(JOptionPane.showInputDialog("Ingresa el nombre"));
        a1.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el edad")));

        a1.setColorPiel(JOptionPane.showInputDialog("Ingresa el color piel"));
        a1.setSexo(JOptionPane.showInputDialog("Ingresa tu sexo").charAt(0));

        alumnos[i]=a1;
    }
    }
    public static void imprimir(Alumno [] alumnos){

        if(alumnos[0] != null ){
            String salida="Datos de los Alumnos: \n";
            for (Alumno alumno : alumnos) {
                salida += "nombre: \n" + alumno.getNombre() + "\n";
                salida += "edad: \n" + alumno.getEdad() + "\n";
                salida += "sexo: \n" + alumno.getSexo() + "\n";
                salida += "\n";
                salida += "color piel: \n" + alumno.getColorPiel() + "\n";


            }
            System.out.println(salida);
            return;
        }
        System.out.println("" + "Datos de los Alumnos: \n");
    }
    public static void imprimir2(Alumno [] alumnos){
        String salida="Datos de los Alumnos: \n";
        for(Alumno alumno:alumnos){
          salida+=alumno+"\n";


        }
        System.out.println(salida);

    }
    public static int solicitarTamano (){
        return Integer.parseInt(JOptionPane.showInputDialog("introduce el numer de alumnos"));
    }
}
