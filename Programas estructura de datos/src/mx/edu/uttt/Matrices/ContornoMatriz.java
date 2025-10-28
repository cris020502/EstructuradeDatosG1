package mx.edu.uttt.Matrices;

import javax.swing.*;

public class ContornoMatriz {
    public static void main(String[] args) {
        iniciar();
    }

    public static int obtenerNumero(String mensaje) {
        String input;
        int numero = 0;
        boolean esValido = false;

        do {
            input = JOptionPane.showInputDialog(mensaje);

            if (input == null) {
                System.exit(0);
            }

            try {
                numero = Integer.parseInt(input);

                if (numero > 0) {
                    esValido = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Error: El número debe ser mayor a 0.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Debe ingresar un número válido.");
            }
        } while (!esValido);

        return numero;
    }


    public static void iniciar() {

        int filas = obtenerNumero("Ingrese el numero de filas");
        int columnas = obtenerNumero("Ingrese el numero de columnas");


        double[][] matriz;
        matriz = new double[filas][columnas];
        boolean sentinel = true;
        String opcion = "";
        do {
            opcion = JOptionPane.showInputDialog(menu());

            if (opcion == null) {
                sentinel = false;
                break;
            }

            switch (opcion) {
                case "1":
                    llenarmatriz(matriz);
                    break;
                case "2":
                    imprimirMatriz(matriz);
                    break;
                case "3":
                    cambiarborde(matriz);
                    break;
                case "4":
                    sentinel = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "introduce un opcion valida");
            }

        } while (sentinel);
    }

    public static String menu() {

        return
                "1. llenar matriz \n" +
                        "2. imprimir matriz \n" +
                        "3. cambiarcontorno \n" +
                        "4. Salir";
    }

    public static void llenarmatriz(double[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 11);
            }
        }

    }

    public static void imprimirMatriz(double[][] matriz) {
        String Salida = "";
        for (double[] fila : matriz) {
            for (double valor : fila) {
                Salida += valor + " | ";
            }
            Salida += "\n";
        }
        JOptionPane.showMessageDialog(null, Salida);

    }

    public static void cambiarborde(double[][] matriz) {

        if (matriz == null || matriz.length == 0 || matriz[0].length == 0) {
            return;
        }

        int totalFilas = matriz.length;
        int totalColumnas = matriz[0].length;

        for (int i = 0; i < totalFilas; i++) {
            for (int j = 0; j < totalColumnas; j++) {

                if (i == 0 || i == (totalFilas - 1) || j == 0 || j == (totalColumnas - 1)) {
                    matriz[i][j] = 1;
                }
            }
        }
    }
}