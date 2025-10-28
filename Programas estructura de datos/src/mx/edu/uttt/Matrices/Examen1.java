package mx.edu.uttt.Matrices;

import javax.swing.*;

public class Examen1 {
    public static void main(String[] args) {
        ininiar();
    }

    public static void ininiar(){
        int personasN = 0;
        try {
            personasN = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de personas"));
            if (personasN <= 0) {
                JOptionPane.showMessageDialog(null, "La cantidad debe ser mayor que 0");
                return;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida");
            return;
        }


        int matriz[][] = new int[personasN][3];

        llenar(matriz);
        mostrarMatriz(matriz);
        calcular(matriz);
    }
    public static void calcular(int m[][]){
        int hombres = 0;
        int mujeres = 0;
        int hombresT =0;
        int mujeresT = 0;
        int salarioH = 0;
        int salarioM = 0;
        int total = m.length;

        for (int i = 0; i < m.length; i++) {
            if (m[i][0]==1){
                hombres++;

                if (m[i][1]==1){
                    hombresT++;
                }

                salarioH += m[i][2];
            }
            if (m[i][0]==2){
                mujeres++;

                if (m[i][1]==1){
                    mujeresT++;
                }

                salarioM += m[i][2];
            }
        }

        double porcentajeH = (hombres * 100) / total;
        double porcentajeM = (mujeres * 100) / total;

        double porcentajeHT = (hombresT * 100) / (hombresT+mujeresT);
        double porcentajeMT = (mujeresT * 100) / (hombresT+mujeresT);

        double sueldoPH= salarioH / hombresT;
        double sueldoPM= salarioM / mujeresT;

        String mensajeH =
                "Porcentaje de hombres: " + porcentajeH + "% \n"+
                        "Porcentaje de mujeres: " + porcentajeM + "% \n"+
                        "Porcentaje de hombres que trabajan: " + porcentajeHT+ "% \n"+
                        "Porcentaje de mujeres que trabajan: " + porcentajeMT+ "% \n"+
                        "Sueldo promedio de los hombres que trabajan: " + sueldoPH+
                        "Sueldo promedio de las mujeres que trabajan: " + sueldoPM;

        JOptionPane.showMessageDialog(null, mensajeH);
    }


    public static void mostrarMatriz(int m[][]){
        String mensaje = "";

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                mensaje += m[i][j] + " | ";
            }
            mensaje += "\n";
        }
        JOptionPane.showMessageDialog(null,mensaje);
    }

    public static void llenar(int m[][]){
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                if (j==0){
                    m[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el gerero H=1, M=2"));
                } else if (j==1) {
                    m[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Esta trabajando Si=1, No=2"));
                } else if (j==2) {
                    m[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Cual es su sueldo de entre 600 a 2000"));
                }
            }
        }
    }
}