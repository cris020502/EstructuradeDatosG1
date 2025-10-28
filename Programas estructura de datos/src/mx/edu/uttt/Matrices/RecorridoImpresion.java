package mx.edu.uttt.Matrices;

import javax.swing.*;

public class RecorridoImpresion {
    public static void main(String[] args) {
        iniciar();
    }
    public static void iniciar(){
    int [][] matrix=new int[solicitarFilas()][solicitarColumnas()];
    llenar(matrix);
    imprimir(matrix);
    imprimir2(matrix);
    imprimir3(matrix);
    imprimir4(matrix);

    }


    public static int solicitarFilas(){
        boolean sentinel=true;
        int numFilas=0;
        do {
            try {
                numFilas = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de filas"));
                if (numFilas > 0) {
                    sentinel = false;
                } else{
                    JOptionPane.showMessageDialog(null,"El valor debe ser mayor que 0");
                }
            }catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "El numero de filas no puede ser negativo");
            }

        }while(sentinel);
        return numFilas;
    }

    public static int solicitarColumnas(){
        boolean sentinel=true;
        int numColumnas=0;
        do {
            try {
                numColumnas = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de filas"));
                if (numColumnas > 0) {
                    sentinel = false;
                } else{
                    JOptionPane.showMessageDialog(null,"El valor debe ser mayor que 0");
                }
            }catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "El numero de filas no puede ser negativo");
            }

        }while(sentinel);
        return numColumnas;
    }
    public static int solicitarValor(){
        int valor=0;
        boolean sentinel=true;

        do {
            try {
                valor = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor"));
                sentinel = false;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "El valor debe ser un numero");
            }

        }while(sentinel);
        return valor;
    }

    public static void llenar(int [][] ma){
        for(int i=0;i<ma.length;i++){
            for(int j=0;j<ma[i].length;j++){
                ma[i][j]=solicitarValor();
            }
        }


    }
    public static void imprimir(int [][] matrix){
        int i=0;
        int j=0;
        String salida="";
        while(i<matrix.length){
        j=0;
            while(j<matrix[i].length){
                salida+=matrix[i][j]+ "  ";
                j++;
            }
            salida+="\n";
            i++;
        }
       JOptionPane.showMessageDialog(null, salida);
    }
public static void  imprimir2(int [][] matrix){
        int i=0 ,j=0;
        String salida="";
        do{

            do {
                salida+=matrix[i][j]+ "  ";
                j++;
            }while (j<matrix[i].length);
            j=0;
            salida+="\n";
            i++;
        }while(i<matrix.length );
}
public static void imprimir3(int [][] matrix){
        int j=0;
        String salida="";
        for(int i=0;i<matrix.length;i++){
            while(j<matrix[i].length){
               salida+= matrix[i][j] ;
               j++;
            }
            salida+="\n";
            j=0;
        }
    JOptionPane.showMessageDialog(null, salida);

}
public static void imprimir4(int [][] kiss){
        //en una matriz cada fila es un vector o un arreglo unidimensional
    String salida="";
        for (int []fila : kiss) {
            for(int valor : fila){
                salida+=valor+" ";
            }
        }
    JOptionPane.showMessageDialog(null, salida);
}
}
