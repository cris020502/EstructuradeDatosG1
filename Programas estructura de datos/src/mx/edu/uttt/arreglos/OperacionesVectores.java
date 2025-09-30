package mx.edu.uttt.arreglos;

import javax.swing.*;

public class OperacionesVectores {
    private double [] vector;
    private final int tamano= 5;
    public OperacionesVectores(){
        vector=new double[tamano];

    }
    public OperacionesVectores(double [] vector){
        this.vector=new double[vector.length];
       llenarVector(vector);
    }
    public void llenarVector(double [] vector){
        for(int i=0;i<vector.length;i++){
            this.vector[i]=vector[i];

        }

    }

    public void llenarVector(){
     int i=0;
        do {
            this.vector[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la posicion ["+(i+1)+"]"));
         i++;
     }while(i<this.vector.length);
    }


    public void imprimirVector(){
        this.toString();
    }
    public double sumarVectores(double [] vector){
        double suma=0;
        for(int i=0;i<vector.length;i++){
            suma=vector[i];

        }
        return suma;
    }
    public double ObtenerValorMaximo(){

        double max=0.0;
        for(int i=0;i<vector.length;i++){
            if(vector[i]>max){
                max=vector[i];
            }
        }
        return max;
    }

    public double ObtenerValorMinimo(){
        double min=0.0;
        for(int i=0;i<vector.length;i++){
            if(vector[i]<min){
                min=vector[i];

            }
        }
        return min;
    }
    public boolean CompararVectores(double [] vector ){
      boolean isEqual=true;
     if (this.vector.length != vector.length) {
         isEqual=false;
     } else {
         for(int i=0;i<this.vector.length && isEqual;i++){
             if(vector[i]!=this.vector[i]){
                 isEqual=false;
             }
         }
     }
     return isEqual;
    }
    public void cambiartamanovector(int tamano) {
        if (vector.length >= tamano) {

        double temp[] = new double[tamano];

        for (int i = 0; i < this.vector.length; i++) {
            temp[i] = vector[i];

        }

        temp = null;
        return;
        }
        System.out.println("no se puede cambiar el valor de la vector");

        }


    @Override
    public String toString(){
     String salida="";
        for(double valor:vector){
         salida+=valor+" | "+valor+" | ";

     }
        return salida;
    }
}
