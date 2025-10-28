package mx.edu.uttt.Matrices;

import javax.swing.*;

public class ExamenPractica {
    public static void main(String[] args) {
        iniciar();
    }
    public static void iniciar() {
        int materia=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de materias"));
        int alumnos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de alumnos"));

        double[][] m;
        m=new double[materia][alumnos];

        double pa[];
        pa=new double[alumnos];
        double pm[];
        pm=new double[materia];

        llenarmatriz( m);
        calcularPromedioAlumnos(pa,m);
        calcularmaterias(m,pm);
        imprimirmatriz(m);
        JOptionPane.showMessageDialog(null, "--- PROMEDIOS ALUMNOS ---");
        imprimirpa(pa);
        JOptionPane.showMessageDialog(null, "--- PROMEDIOS MATERIAS ---");
        imprimirpm(pm);

    }


    public static void llenarmatriz(double[][] m) {

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j]= Math.round((Math.random()*10) * 10.0) / 10.0;
            }
        }

    }

    public static void calcularPromedioAlumnos(double pa[], double[][]m) {
        double promedio=0.0;
        for (int j = 0; j < m[0].length; j++) {
            for (int i = 0; i < m.length; i++) {
                promedio+=m[i][j];
            }
            pa[j]=Math.round((promedio / m.length) * 10.0) / 10.0;
            promedio=0.0;
        }
    }
    public static void imprimirmatriz(double[][] m) {
        String Salida="";
        for (double[] fila : m) {
            for (double valor:fila) {
                Salida+=valor+" | ";
            }
            Salida+="\n";
        }
        JOptionPane.showMessageDialog(null,Salida);
    }

    public static void imprimirpa(double[] pa){
        String Salida="";
        for (int i = 0; i < pa.length; i++) {
            Salida+="Alumno " + i + ": " + pa[i] + " \n ";
        }
        JOptionPane.showMessageDialog(null,Salida);
    }

    public static void calcularmaterias(double[][] m, double[] pm) {
        double promedio=0.0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                promedio+=m[i][j];
            }
            pm[i]=Math.round((promedio / m[0].length) * 10.0) / 10.0;
            promedio=0.0;
        }
    }
    public static void imprimirpm(double[] pm) {
        String Salida="";
        for (int i = 0; i < pm.length; i++) {
            Salida+="Materia " + i + ": " + pm[i]+" " ;
        }
        JOptionPane.showMessageDialog(null,Salida);
    }
}