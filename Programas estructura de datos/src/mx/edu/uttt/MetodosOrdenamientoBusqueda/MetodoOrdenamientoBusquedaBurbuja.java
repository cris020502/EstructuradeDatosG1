package mx.edu.uttt.MetodosOrdenamientoBusqueda;

import javax.swing.*;

public class MetodoOrdenamientoBusquedaBurbuja {
    public static void iniciar(){
        int alumnos = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de personas"));

        int matriz[][] = new int[alumnos][5];

        llenar(matriz);
        mostrarMatriz(matriz);
    }

    public static void mostrarMatriz(int m[][]){
        String mensaje = "";
        int suma = 0;
        double promedio = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                mensaje += m[i][j] + " | ";
                suma += m[i][j];
            }
            promedio = suma / m[i].length;
            mensaje += "       "+promedio;
            mensaje += "\n";
            promedio = 0;
            suma = 0;
        }
        JOptionPane.showMessageDialog(null,mensaje);
    }

    public static void llenar(int m[][]){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = (int)(Math.random() * 10) + 1;
            }
}
}

}
