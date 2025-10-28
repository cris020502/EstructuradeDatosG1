package mx.edu.uttt.Matrices;

import javax.swing.*;

public class Examen2 {




        public static void main(String[] args) {
            iniciar();
        }

        public static void iniciar() {
            int alumnos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de estudiantes:"));
            int examenes = 5;

            double[][] calificaciones = new double[alumnos][examenes];
            double[] promedioAlumnos = new double[alumnos];
            double[] promedioExamenes = new double[examenes];

            llenarMatriz(calificaciones);
            imprimirMatriz(calificaciones);

            calcularPromediosAlumnos(calificaciones, promedioAlumnos);
            calcularPromediosExamenes(calificaciones, promedioExamenes);

            imprimirPromediosAlumnos(promedioAlumnos);
            imprimirPromediosExamenes(promedioExamenes);

            mejoresEnExamen(calificaciones, 2);
            mejoresEnExamen(calificaciones, 0);
            mejoresEnExamen(calificaciones, 4);
            examenConMayorPromedio(promedioExamenes);
        }

        public static void llenarMatriz(double[][] m) {
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length; j++) {
                    m[i][j] = Math.round((Math.random() * 10) * 10.0) / 10.0;
                }
            }
        }

        public static void imprimirMatriz(double[][] m) {
            String salida = "--- CALIFICACIONES ---\n";
            for (int i = 0; i < m.length; i++) {
                salida += "Alumno " + (i + 1) + ": ";
                for (int j = 0; j < m[i].length; j++) {
                    salida += m[i][j] + " | ";
                }
                salida += "\n";
            }
            JOptionPane.showMessageDialog(null, salida);
        }

        public static void calcularPromediosAlumnos(double[][] m, double[] pa) {
            for (int i = 0; i < m.length; i++) {
                double suma = 0;
                for (int j = 0; j < m[i].length; j++) {
                    suma += m[i][j];
                }
                pa[i] = Math.round((suma / m[i].length) * 10.0) / 10.0;
            }
        }

        public static void imprimirPromediosAlumnos(double[] pa) {
            String salida = "--- PROMEDIOS DE CADA ALUMNO ---\n";
            for (int i = 0; i < pa.length; i++) {
                salida += "Alumno " + (i + 1) + ": " + pa[i] + "\n";
            }
            JOptionPane.showMessageDialog(null, salida);
        }

        public static void calcularPromediosExamenes(double[][] m, double[] pe) {
            for (int j = 0; j < m[0].length; j++) {
                double suma = 0;
                for (int i = 0; i < m.length; i++) {
                    suma += m[i][j];
                }
                pe[j] = Math.round((suma / m.length) * 10.0) / 10.0;
            }
        }

        public static void imprimirPromediosExamenes(double[] pe) {
            String salida = "--- PROMEDIOS POR EXAMEN ---\n";
            for (int i = 0; i < pe.length; i++) {
                salida += "Examen " + (i + 1) + ": " + pe[i] + "\n";
            }
            JOptionPane.showMessageDialog(null, salida);
        }

        public static void mejoresEnExamen(double[][] m, int examen) {
            double max = 0;
            for (int i = 0; i < m.length; i++) {
                if (m[i][examen] > max) {
                    max = m[i][examen];
                }
            }

            String salida = "--- MEJORES EN EXAMEN " + (examen + 1) + " ---\n";
            for (int i = 0; i < m.length; i++) {
                if (m[i][examen] == max) {
                    salida += "Alumno " + (i + 1) + " con " + max + "\n";
                }
            }
            JOptionPane.showMessageDialog(null, salida);
        }

        public static void examenConMayorPromedio(double[] pe) {
            double max = pe[0];
            int indice = 0;

            for (int i = 1; i < pe.length; i++) {
                if (pe[i] > max) {
                    max = pe[i];
                    indice = i;
                }
            }

            JOptionPane.showMessageDialog(null,
                    "El examen con el promedio más alto fue el Examen " + (indice + 1) +
                            " con promedio de " + max);
        }
    }


