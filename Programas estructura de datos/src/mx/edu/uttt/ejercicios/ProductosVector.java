package mx.edu.uttt.ejercicios;

import javax.swing.*;

public class ProductosVector {
private Producto[] productos;
private final int tamano= 2;

public ProductosVector() {
    this.productos = new Producto[this.tamano];

}
public ProductosVector(int tamano) {
    if (tamano <= 0)
    this.productos = new Producto[this.tamano];
    else productos = new Producto[tamano];
}
public void llenararreglo(Producto productos) {
    if(estalleno()){
        JOptionPane.showMessageDialog(null, "Vector lleno", "Error", JOptionPane.ERROR_MESSAGE);
    }else {
        this.productos[buscarposicion()] = productos;
    }

}

public boolean estalleno(){
    boolean lleno = true;
    for (Producto productos: this.productos) {
    if (productos==null){
        lleno = false;
        break;
    }
    }
    return lleno;
}
private int buscarposicion(){
    int posicion = 0;
    for (int i = 0; i < this.productos.length; i++) {
        if(this.productos[i]==null){
            posicion= i;
            break;
        }
    }
    return posicion;
}
public void eliminarProducto(Producto producto) {

 }


public String imprimir() {
   String s = "\n Lista de productos:\n";
        for (int i=0;i<this.productos.length;i++) {
            if (this.productos[i] != null) {


                s +="Numero de producto "+i+ " "+this.productos[i].toString() + "   importe: $" + productos[i].getPrecio() * productos[i].getExistencia() + "\n";
               s+= "\n -------------------------------------------------------------- \n";
            }

        }
        return s;
}
    public boolean eliminarPorNombre(String nombre) {
        for (int i = 0; i < this.productos.length; i++) {
            if (this.productos[i] != null && this.productos[i].getNombre().equalsIgnoreCase(nombre)) {
                // mover los productos hacia atrás para rellenar el hueco
                for (int j = i; j < this.productos.length - 1; j++) {
                    this.productos[j] = this.productos[j + 1];
                }
                this.productos[this.productos.length - 1] = null; // limpia el último
                return true; // se eliminó
            }
        }
        return false; // no se encontró
    }

    public boolean buscar(String nombre) {

        for (int i = 0; i < this.productos.length; i++) {
            if (this.productos[i] != null && this.productos[i].getNombre().equalsIgnoreCase(nombre)) {
                JOptionPane.showMessageDialog(null, this.productos[i].toString(), "Producto",2);
                return true;
            }

        }
        return false;
    }

    private int buscarIndicePorNombre(String nombre) {
        for (int i = 0; i < this.productos.length; i++) {
            if (this.productos[i] != null && this.productos[i].getNombre().equalsIgnoreCase(nombre)) {
                return i;
            }
        }
        return -1; // No encontrado
    }
    public boolean modificarNombre(String nombreActual, String nuevoNombre) {
        int index = buscarIndicePorNombre(nombreActual);
        if (index != -1) {
            this.productos[index].setNombre(nuevoNombre);
            return true;
        }
        return false;
    }

    public boolean modificarPrecio(String nombre, double nuevoPrecio) {
        int index = buscarIndicePorNombre(nombre);
        if (index != -1) {
            this.productos[index].setPrecio(nuevoPrecio);
            return true;
        }
        return false;
    }

    public boolean modificarExistencia(String nombre, int nuevaExistencia) {
        int index = buscarIndicePorNombre(nombre);
        if (index != -1) {
            this.productos[index].setExistencia(nuevaExistencia);
            return true;
        }
        return false;
    }



 }
