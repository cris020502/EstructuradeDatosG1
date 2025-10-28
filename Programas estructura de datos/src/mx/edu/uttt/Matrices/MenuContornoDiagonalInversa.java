package mx.edu.uttt.Matrices;

import javax.swing.JOptionPane;

public class MenuContornoDiagonalInversa {

    public static void main(String[] args) {
        iniciar();
    }


    public static String menu() {
        return "--- MENÚ PRINCIPAL ---\n\n" +
                "1. Ejecutar 'Contorno Matriz'\n" +
                "2. Ejecutar SumaContornoBajoSobreDiagonal\n" +
                "3. Salir\n\n" +
                "Seleccione una opción:";
    }


    public static void iniciar() {
        boolean sentinel = true;
        String opcion;

        do {
            opcion = JOptionPane.showInputDialog(menu());


            if (opcion == null) {
                sentinel = false;
                break;
            }

            switch (opcion) {
                case "1":

                    ContornoMatriz.iniciar();
                    break;

                case "2":

                    SumaBajoSobreDiagonal.iniciar();
                    break;

                case "3":
                    sentinel = false;
                    JOptionPane.showMessageDialog(null, "Saliendo del menú principal...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida, intente de nuevo.");
            }

        } while (sentinel);
    }
}