package mx.edu.uttt.tarea;


import javax.swing.*;

public class SumaVectores {
    // Atributos
    private int[] A; // Primer vector
    private int[] B; // Segundo vector
    private int[] C; // Vector donde se guarda la suma

    // Constructor que inicializa los vectores con el mismo tamaño
    public SumaVectores(int n) {
        A = new int[n];
        B = new int[n];
        C = new int[n];
    }

    // Método para llenar un vector con datos introducidos por el usuario
    private void llenarVector(int[] vector, String nombre) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor " + (i + 1) + " del vector " + nombre + ":"));
        }
    }

    // Método que llena los vectores A y B
    public void llenarDatos() {
        llenarVector(A, "A");
        llenarVector(B, "B");
    }

    // Método que realiza la suma de A y B y guarda en C
    public void sumarVectores() {
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] + B[i]; // suma de elementos correspondientes
        }
    }

    // Método para imprimir el vector resultado C
    public String imprimirResultado() {
        StringBuilder sb = new StringBuilder("Vector C (resultado de la suma):\n");
        for (int i = 0; i < C.length; i++) {
            sb.append("C[").append(i).append("] = ").append(C[i]).append("\n");
        }
        return sb.toString();
    }

    // Método principal de prueba
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("¿De qué tamaño serán los vectores?"));
        SumaVectores sv = new SumaVectores(n);

        sv.llenarDatos();
        sv.sumarVectores();
        JOptionPane.showMessageDialog(null, sv.imprimirResultado());
    }
}
