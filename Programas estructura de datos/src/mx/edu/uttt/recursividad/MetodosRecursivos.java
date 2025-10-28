package mx.edu.uttt.recursividad;

import javax.swing.*;

public class MetodosRecursivos {
    public static long factorialk(long n) throws IllegalArgumentException{

        //caro base
        if(n<0) throw new IllegalArgumentException("el valor de n no puede ser 0");
        if(n==0) return 0;
        if(n==1) return 1;

        //caso general
        return n*factorialk(n-1);

    }

    public static void main(String[] args) {
        try{
            int n=Integer.parseInt(JOptionPane.showInputDialog("introduce un numero"));
            System.out.println("el factorial de "+n+ " es "+ factorialk(n));
            System.out.println(n);
        } catch (IllegalArgumentException e) {

            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
}
