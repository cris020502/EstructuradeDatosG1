package mx.edu.uttt.Matrices;

import javax.swing.*;

public class OperacionesMatrices {

    public static void main(String[] args) {
        iniciar();
    }
    private double[][] m;
    public OperacionesMatrices(int numFilas,int numColumnas) {
        if (validarTamanio(numFilas) && validarTamanio(numColumnas)) {
            m = new double[numFilas][numColumnas];
        }else {
            m = new double[2][2];
        }
    }
    private boolean validarTamanio(int tamanio) {
        return tamanio>0;
    }

    public double[][] getM() {
        return this.m;
    }

    public boolean validarMatrices() {
        return this.m.length==this.m[0].length;
    }

    public double sumarDiagonal() throws Exception{
        if (!(validarMatrices()))
            throw new Exception ("La matriz no es cuardrada");
        double suma=0;
        for(int i=0;i<m.length;i++){
            suma+=m[i][i];
        }
        return suma;
    }
    public double sumarDiagonal2() throws Exception{
        double suma=0;
        for (int i=0;i<m.length;i++){
            suma+=m[i][i];
        }
        return suma;
    }

    public void setM(double[][] m) {
        if(!(m.length == this.m.length && m[0].length == this.m[0].length))
            return;
        for (int i = 0; i < this.m.length; i++) {
            for (int j = 0; j < this.m[i].length; j++) {
                this.m[i][j] = m[i][j];
            }
        }
    }

    public void imprimirMatriz() {
        String Salida="";
        for (double[] fila : this.m) {
            for (double valor:fila) {
                Salida+=valor+" | ";
            }
            Salida+="\n";
        }
        JOptionPane.showMessageDialog(null,Salida);
    }


    public static void iniciar() {
        int opcion;
        do {
            String menu = """
        --- OPERACIONES CON MATRICES ---
        1. Sumar matrices
        2. Restar matrices
        3. Multiplicar matrices
        4. Transpuesta de una matriz
        5. Salir
        Selecciona una opción:
        """;
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            } catch (NumberFormatException e) {
                opcion = 0;
            }

            switch (opcion) {
                case 1 -> { // Suma
                    int fila = obtenerTamanio();
                    int columna = obtenerTamanio();
                    OperacionesMatrices m1 = new OperacionesMatrices(fila, columna);
                    OperacionesMatrices m2 = new OperacionesMatrices(fila, columna);
                    double[][] matriz1 = new double[fila][columna];
                    double[][] matriz2 = new double[fila][columna];
                    JOptionPane.showMessageDialog(null, "Llenar Matriz 1");
                    llenarMatriz(matriz1);
                    JOptionPane.showMessageDialog(null, "Llenar Matriz 2");
                    llenarMatriz(matriz2);
                    m1.setM(matriz1);
                    m2.setM(matriz2);
                    try {
                        OperacionesMatrices resultado = m1.sumar(m2);
                        JOptionPane.showMessageDialog(null, "Resultado de la suma:");
                        resultado.imprimirMatriz();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                }
                case 2 -> { // Resta
                    int fila = obtenerTamanio();
                    int columna = obtenerTamanio();
                    OperacionesMatrices m1 = new OperacionesMatrices(fila, columna);
                    OperacionesMatrices m2 = new OperacionesMatrices(fila, columna);
                    double[][] matriz1 = new double[fila][columna];
                    double[][] matriz2 = new double[fila][columna];
                    JOptionPane.showMessageDialog(null, "Llenar Matriz 1");
                    llenarMatriz(matriz1);
                    JOptionPane.showMessageDialog(null, "Llenar Matriz 2");
                    llenarMatriz(matriz2);
                    m1.setM(matriz1);
                    m2.setM(matriz2);
                    try {
                        OperacionesMatrices resultado = m1.restar(m2);
                        JOptionPane.showMessageDialog(null, "Resultado de la resta:");
                        resultado.imprimirMatriz();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                }
                case 3 -> { // Multiplicación
                    JOptionPane.showMessageDialog(null, "Primera matriz:");
                    int fila1 = obtenerTamanio();
                    int columna1 = obtenerTamanio();
                    OperacionesMatrices m1 = new OperacionesMatrices(fila1, columna1);
                    double[][] matriz1 = new double[fila1][columna1];
                    llenarMatriz(matriz1);
                    m1.setM(matriz1);

                    JOptionPane.showMessageDialog(null, "Segunda matriz:");
                    int fila2 = obtenerTamanio();
                    int columna2 = obtenerTamanio();
                    OperacionesMatrices m2 = new OperacionesMatrices(fila2, columna2);
                    double[][] matriz2 = new double[fila2][columna2];
                    llenarMatriz(matriz2);
                    m2.setM(matriz2);

                    try {
                        OperacionesMatrices resultado = m1.multiplicar(m2);
                        JOptionPane.showMessageDialog(null, "Resultado de la multiplicación:");
                        resultado.imprimirMatriz();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                }
                case 4 -> { // Transpuesta
                    int fila = obtenerTamanio();
                    int columna = obtenerTamanio();
                    OperacionesMatrices m1 = new OperacionesMatrices(fila, columna);
                    double[][] matriz = new double[fila][columna];
                    llenarMatriz(matriz);
                    m1.setM(matriz);
                    OperacionesMatrices resultado = m1.transpuesta();
                    JOptionPane.showMessageDialog(null, "Transpuesta de la matriz:");
                    resultado.imprimirMatriz();
                }
                case 5 -> JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                default -> JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        } while (true);
    }


    public static int obtenerTamanio() {
        int valor=0;
        boolean sentinel=true;
        do {
            try {
                valor = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamaño de tu matriz "));
                if(valor>0){
                    sentinel=false;
                }else{
                    JOptionPane.showMessageDialog(null, "El valor no puede ser negativo");
                }
            } catch (NumberFormatException ex) {
                System.out.println("el valor debe de ser entero");
            }
        }while(sentinel);
        return valor;
    }

    public static void llenarMatriz(double [][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                boolean sentinel;
                do{
                    sentinel=false;
                    try{
                        matrix[i][j]=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor "));
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "El valor debe ser un numero");
                        sentinel=true;
                    }
                }while (sentinel);
            }
        }
    }

    public double sumardiagonal3(){
        double suma=0;
        int j=0;
        for (int i=m.length-1;i>=0 && j<m[i].length;i--){
            suma+=m[i][j];
            j++;
        }
        return suma;
    }
    public double sumarDiagonal4(){
        double suma=0;
        int j=m.length-1;
        for (int i=0;i<m.length && j>=0;i++){
            suma+=m[i][j];
            j--;
        }
        return suma;
    }
    public double sumarDiagonal5(){
        double suma=0;
        int j=0;
        for (int i=m.length-1;i>=0 && j<m[i].length;i--){
            suma+=m[i][j];
            j++;
        }
        return suma;
    }

    public double sumarDiagonal6(){
        double suma=0;
        for(int i=0;i< m.length;i++){
            suma+=m[i][m.length-1-i];
        }
        return suma;
    }
    public double sumarFilas(){
        double suma=0;
        for (int i=0;i<m.length;i++){
            for(int k=0;k<m[i].length;k++){
                suma+=m[i][k];
            }
        }
        return suma;
    }
    public OperacionesMatrices sumar(OperacionesMatrices otra) throws Exception {
        if (this.m.length != otra.m.length || this.m[0].length != otra.m[0].length) {
            throw new Exception("Las matrices deben tener el mismo tamaño para sumarse.");
        }
        OperacionesMatrices resultado = new OperacionesMatrices(m.length, m[0].length);
        double[][] r = new double[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                r[i][j] = this.m[i][j] + otra.m[i][j];
            }
        }
        resultado.setM(r);
        return resultado;
    }

    public OperacionesMatrices restar(OperacionesMatrices otra) throws Exception {
        if (this.m.length != otra.m.length || this.m[0].length != otra.m[0].length) {
            throw new Exception("Las matrices deben tener el mismo tamaño para restarse.");
        }
        OperacionesMatrices resultado = new OperacionesMatrices(m.length, m[0].length);
        double[][] r = new double[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                r[i][j] = this.m[i][j] - otra.m[i][j];
            }
        }
        resultado.setM(r);
        return resultado;
    }

    public OperacionesMatrices multiplicar(OperacionesMatrices otra) throws Exception {
        if (this.m[0].length != otra.m.length) {
            throw new Exception("El número de columnas de la primera matriz debe coincidir con el número de filas de la segunda matriz.");
        }
        OperacionesMatrices resultado = new OperacionesMatrices(this.m.length, otra.m[0].length);
        double[][] r = new double[this.m.length][otra.m[0].length];
        for (int i = 0; i < this.m.length; i++) {
            for (int j = 0; j < otra.m[0].length; j++) {
                for (int k = 0; k < this.m[0].length; k++) {
                    r[i][j] += this.m[i][k] * otra.m[k][j];
                }
            }
        }
        resultado.setM(r);
        return resultado;
    }

    public OperacionesMatrices transpuesta() {
        OperacionesMatrices resultado = new OperacionesMatrices(this.m[0].length, this.m.length);
        double[][] r = new double[this.m[0].length][this.m.length];
        for (int i = 0; i < this.m.length; i++) {
            for (int j = 0; j < this.m[i].length; j++) {
                r[j][i] = this.m[i][j];
            }
        }
        resultado.setM(r);
        return resultado;
    }


}
