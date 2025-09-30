package mx.edu.uttt.ejercicios;

public class Producto {
//atributos
private String nombre;
private double precio;
private int existencia;

    public Producto() {
        this.nombre = "Sin nombre";
        this.precio = 0;
        this.existencia = 0;
    }

    public Producto(String nombre, double precio, int existencia) {
        this.setNombre(nombre);
        this.setPrecio(precio);
        this.setExistencia(existencia);

    }

    //metodo get y set
    public String getNombre() {
        return this.nombre;
    }
    //mutador es void
    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }

    public int getExistencia() {
        return this.existencia;
    }
    public void setExistencia(int existencia) {
        if (existencia >= 0)
            this.existencia = existencia;

    }
  public double getPrecio() {
        return this.precio;
  }
  public void setPrecio(double precio) {
       if (precio >= 0.0)
        this.precio = precio;

  }

    @Override
    public String toString() {
        return "Nombre del producto: "+getNombre()+
                "\n Existencia: "+getExistencia()+
                "\n Precio: "+getPrecio();
    }
}
