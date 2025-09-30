package mx.edu.uttt.ejercicios;

import javax.swing.*;

public class TestProductoVector {
    public static void main(String[] args) {
        iniciar();
    }
    public static void iniciar(){
        int tamanio=Integer.parseInt( JOptionPane.showInputDialog("introduce numero de productos"));

    ProductosVector pv = new ProductosVector();
    boolean sentinel=true;
    String opcion="";
    do {
        opcion = JOptionPane.showInputDialog(menu());

        switch (opcion) {

            case "1":
                if(pv.estalleno()){
                  JOptionPane.showMessageDialog(null, "El Vector esta lleno");
                }else {
                    pv.llenararreglo(agregarProducto());
                }
                break;
                case "2":
                     JOptionPane.showMessageDialog(null, pv.imprimir());

                  break;
                  case "3":

                JOptionPane.showMessageDialog(null, pv.imprimir());
                String producto = JOptionPane.showInputDialog(null, "¿Qué producto deseas eliminar?");
                boolean eliminado = pv.eliminarPorNombre(producto);

                if (eliminado) {
                    JOptionPane.showMessageDialog(null, "Producto eliminado correctamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "El producto no existe en la lista.");
                }

                      break;
                      case "4":
                          JOptionPane.showMessageDialog(null, pv.imprimir());
                            String nombre = JOptionPane.showInputDialog(null,"Que producto deseas buscar");
                            boolean buscar= pv.buscar(nombre);
                            if (buscar) {
                                JOptionPane.showMessageDialog(null, pv.buscar(nombre));
                            }
                          break;
            case "5": // Modificar Nombre
                JOptionPane.showMessageDialog(null, pv.imprimir());
                String nombreAct = JOptionPane.showInputDialog("Introduce el nombre del producto a modificar:");
                String nuevoNombre = JOptionPane.showInputDialog("Introduce el nuevo nombre:");
                if (pv.modificarNombre(nombreAct, nuevoNombre)) {
                    JOptionPane.showMessageDialog(null, "Nombre modificado correctamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró el producto.");
                }
                break;
            case "6": // Modificar Precio
                JOptionPane.showMessageDialog(null, pv.imprimir());
                String nombrePrecio = JOptionPane.showInputDialog("Introduce el nombre del producto a modificar precio:");
                double nuevoPrecio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el nuevo precio:"));
                if (pv.modificarPrecio(nombrePrecio, nuevoPrecio)) {
                    JOptionPane.showMessageDialog(null, "Precio modificado correctamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró el producto.");
                }
                break;

            case "7": // Modificar Existencia
                JOptionPane.showMessageDialog(null, pv.imprimir());
                String nombreExist = JOptionPane.showInputDialog("Introduce el nombre del producto a modificar existencia:");
                int nuevaExistencia = Integer.parseInt(JOptionPane.showInputDialog("Introduce la nueva existencia:"));
                if (pv.modificarExistencia(nombreExist, nuevaExistencia)) {
                    JOptionPane.showMessageDialog(null, "Existencia modificada correctamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró el producto.");
                }
                break;

            case "8": // Salir
                sentinel = false;
                JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                break;
                      default:
                          JOptionPane.showMessageDialog(null, "introduce un opcion valida");
        }
    }while (sentinel);






    }
    public static String menu(){
        return "Menu principan \n 1)"+
                "Agregar productos \n"+
                "2) Imprimir\n"+
                "3) Eliminar \n"+
                "4) Buscar \n"+
                "5) Modificar Nombre \n"+
                "6) Modificar Precio \n"+
                "7)Modificar Existencia\n"+
                "8) Salir";
    }



    static Producto agregarProducto( ) {
        //se crea el objeto de producto
        Producto producto = new Producto();

        //solcitud de variables
        String nombre = JOptionPane.showInputDialog("introduce el nombre del producto");
        int existencia = Integer.parseInt(JOptionPane.showInputDialog("introduce el existencia"));
        double precio = Double.parseDouble(JOptionPane.showInputDialog("introduce el precio del producto"));

        //asignan valores
        producto.setNombre(nombre);
        producto.setExistencia(existencia);
        producto.setPrecio(precio);

        return producto;

    }



    }

