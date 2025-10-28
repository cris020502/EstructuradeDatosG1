package mx.edu.uttt.Matrices;

import javax.swing.*;

public class ExamenPractica2 {

    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar() {

        String palabra = JOptionPane.showInputDialog("Ingresa una palabra de 5 letras");


        if (palabra == null || palabra.length() != 5) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Debe ser una palabra de 5 letras.");
            return;
        }


        char[] palabras = palabra.toUpperCase().toCharArray();


        char[][] Palabras = {
                {'C', 'A', 'S', 'A', 'S'},
                {'M', 'U', 'N', 'D', 'O'},
                {'N', 'U', 'B', 'E', 'S'},
                {'L', 'I', 'B', 'R', 'E'},
                {'P', 'E', 'L', 'O', 'N'}
        };

        imprimir(Palabras);
        buscarpalabra(Palabras, palabras);
    }

    public static void imprimir(char[][] Palabras) {
        String Salida="";
        for (char[] fila : Palabras) {
            for (char valor:fila) {
                Salida+=valor+" | ";
            }
            Salida+="\n";
        }
        JOptionPane.showMessageDialog(null,Salida);
    }



    public static void buscarpalabra(char[][] matriz, char[] palabraBuscada) {

        boolean palabraEncontrada = false;


        for (int i = 0; i < matriz.length; i++) {

            int coincidencia = 0;

            for (int j = 0; j < palabraBuscada.length; j++) {


                if (matriz[i][j] == palabraBuscada[j]) {
                    coincidencia++;
                }
            }


            if (coincidencia == palabraBuscada.length) {
                palabraEncontrada = true;
                break;
            }
        }


        if (palabraEncontrada) {
            JOptionPane.showMessageDialog(null, "Tu palabra SÍ se encuentra en la matriz.");
        } else {
            JOptionPane.showMessageDialog(null, "Tu palabra NO se encuentra en la matriz.");
        }
    }
}