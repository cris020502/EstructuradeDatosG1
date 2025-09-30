package mx.edu.uttt.arreglos;
import mx.edu.uttt.poo.Alumno;
import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.util.Vector;

public class DeclaracionVectores {
    public static void main(String[] args) {
        //declaracion de vectores
        int v1[];
        double v2[], v3[];
        boolean v4[];
        char v5[];
        String v6[];
        //Alumno v7[];
        //crear el vector en memoria
        v1 = new int[4];
        v2 = new double[3];
        v3 = new double[3];
        v4 = new boolean[4];
        v5 = new char[5];
        v6 = new String[4];
        Alumno[] v7 = new Alumno[3];

        //declaracion de un vector con valores iniciale

        double[] v8 = {3.2, 8.5, 8.9, 7.};
        estamano(v1);


        int tamaño = v6.length;
        System.out.println(tamaño);

        //imprimir el valor de un arreglo
        try {
            System.out.println(v3[2]);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


        for (int i = 0; i < v6.length - 1; i++) {
            System.out.print("|" + v6[i] + "|");
        }

        System.out.println();

        int i = 0;
        do {
            System.out.println("|" + v6[i] + "|");
            i++;
        } while (i < v6.length);

        i = 0;
        while (i < v6.length - 1) {
            System.out.println("|" + v6[i] + "|");
            i++;
        }

        for (String valor : v6) {
            System.out.println("|" + valor + "|");
        }


    }//fin main

    public static int estamano(int[] vector) {
        return vector.length;
    }
}
 //  public static void imprimirVector(int [] vector) {
//       for (int i = 0; i < v6.length - 1; i++) {
//           System.out.print("|" + v6[i] + "|");
//       }
//
//       System.out.println();
//
//       int i = 0;
//       do {
//           System.out.println("|" + v6[i] + "|");
//           i++;
//       }while (i < v6.length);
//
//       i=0;
//       while(i < v6.length - 1) {
//           System.out.println("|" + v6[i] + "|");
//           i++;
//       }
//
//       for (String valor: v6) {
//           System.out.println("|" + valor + "|");
//       }
//   }


