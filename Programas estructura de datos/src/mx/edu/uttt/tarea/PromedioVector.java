package mx.edu.uttt.tarea;



import javax.swing.*;

public class PromedioVector {
    // Atributos de la clase
    private double[] valores; // vector donde guardaremos los n valores

    // Constructor que recibe el tamaño del vector
    public PromedioVector(int n) {
        valores = new double[n];
    }

    // Método para llenar el vector con valores introducidos por el usuario
    public void llenarValores() {
        for (int i = 0; i < valores.length; i++) {
            valores[i] = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor " + (i + 1) + ":"));
        }
    }

    // Método para calcular el promedio
    public double calcularPromedio() {
        double suma = 0;
        for (double v : valores) {
            suma += v;
        }
        return suma / valores.length; // promedio = suma de valores / número de valores
    }

    // Método que devuelve cuántos valores son mayores que el promedio
    public int contarMayores(double promedio) {
        int contador = 0;
        for (double v : valores) {
            if (v > promedio) {
                contador++;
            }
        }
        return contador;
    }

    // Método que devuelve un String con los valores mayores al promedio
    public String listarMayores(double promedio) {
        StringBuilder sb = new StringBuilder("Valores mayores que el promedio:\n");
        for (double v : valores) {
            if (v > promedio) {
                sb.append(v).append("\n");
            }
        }
        return sb.toString();
    }

    // Método principal de prueba
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos valores quieres ingresar?"));
        PromedioVector pv = new PromedioVector(n);

        pv.llenarValores();
        double promedio = pv.calcularPromedio();
        int mayores = pv.contarMayores(promedio);
        String lista = pv.listarMayores(promedio);

        // Mostramos resultados
        JOptionPane.showMessageDialog(null,
                "Promedio: " + promedio +
                        "\nNúmero de valores mayores: " + mayores +
                        "\n" + lista);
    }
}
