package mx.edu.uttt.tarea;



import javax.swing.*;

public class PromedioVector {

    private double[] valores;


    public PromedioVector(int n) {
        valores = new double[n];
    }


    public void llenarValores() {
        for (int i = 0; i < valores.length; i++) {
            valores[i] = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor " + (i + 1) + ":"));
        }
    }


    public double calcularPromedio() {
        double suma = 0;
        for (double v : valores) {
            suma += v;
        }
        return suma / valores.length;
    }


    public int contarMayores(double promedio) {
        int contador = 0;
        for (double v : valores) {
            if (v > promedio) {
                contador++;
            }
        }
        return contador;
    }


    public String listarMayores(double promedio) {
        StringBuilder sb = new StringBuilder("Valores mayores que el promedio:\n");
        for (double v : valores) {
            if (v > promedio) {
                sb.append(v).append("\n");
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos valores quieres ingresar?"));
        PromedioVector pv = new PromedioVector(n);

        pv.llenarValores();
        double promedio = pv.calcularPromedio();
        int mayores = pv.contarMayores(promedio);
        String lista = pv.listarMayores(promedio);


        JOptionPane.showMessageDialog(null,
                "Promedio: " + promedio +
                        "\nNúmero de valores mayores: " + mayores +
                        "\n" + lista);
    }
}
