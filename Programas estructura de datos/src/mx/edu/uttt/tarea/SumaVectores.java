package mx.edu.uttt.tarea;

import javax.swing.*;

public class SumaVectores {

    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar() {

        int n = Integer.parseInt(JOptionPane.showInputDialog("¿De qué tamaño serán los vectores?"));


        int[] A = new int[n];
        int[] B = new int[n];
        int[] C = new int[n];


        llenarDatos(A, B);
        sumarVectores(A, B, C);
        imprimirResultado(C);
    }


    private static void llenarVector(int[] vector, String nombre) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor " + (i + 1) + " del vector " + nombre + ":"));
        }
    }

    public static void llenarDatos(int[] A, int[] B) {
        llenarVector(A, "A");
        llenarVector(B, "B");
    }

    public static void sumarVectores(int[] A, int[] B, int[] C) {
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] + B[i];
        }
    }


    public static void imprimirResultado(int[] C) {

        String salida = "Vector C (resultado de la suma):\n";

        for (int i = 0; i < C.length; i++) {

            salida += "C[" + i + "] = " + C[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, salida);
    }
}