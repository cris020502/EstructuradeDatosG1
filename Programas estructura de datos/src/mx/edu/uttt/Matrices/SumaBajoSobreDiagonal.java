package mx.edu.uttt.Matrices;

import javax.swing.*;

public class SumaBajoSobreDiagonal {





        public static void main(String[] args) {
            iniciar();
        }

        public static void iniciar() {
            int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la matriz cuadrada:"));
            double[][] matriz = new double[n][n];
            llenarMatriz(matriz);
            imprimirMatriz(matriz);
            double sumaSuperior = sumarSuperior(matriz);
            double sumaInferior = sumarInferior(matriz);
            JOptionPane.showMessageDialog(null,
                    "Suma superior (encima de la diagonal): " + sumaSuperior + "\n" +
                            "Suma inferior (debajo de la diagonal): " + sumaInferior);
        }

        public static void llenarMatriz(double[][] m) {
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length; j++) {
                    m[i][j] = Math.round((Math.random() * 10) * 10.0) / 10.0;
                }
            }
        }

        public static void imprimirMatriz(double[][] m) {
            String salida = "--- MATRIZ ---\n";
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length; j++) {
                    salida += m[i][j] + " | ";
                }
                salida += "\n";
            }
            JOptionPane.showMessageDialog(null, salida);
        }

        public static double sumarSuperior(double[][] m) {
            double suma = 0;
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length; j++) {
                    if (j > i) {
                        suma += m[i][j];
                    }
                }
            }
            return Math.round(suma * 10.0) / 10.0;
        }

        public static double sumarInferior(double[][] m) {
            double suma = 0;
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length; j++) {
                    if (j < i) {
                        suma += m[i][j];
                    }
                }
            }
            return Math.round(suma * 10.0) / 10.0;
        }
    }

