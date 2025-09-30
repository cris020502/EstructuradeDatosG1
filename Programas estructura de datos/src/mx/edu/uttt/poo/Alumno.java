package mx.edu.uttt.poo;

public class Alumno  {

private String nombre;
private int edad;
private char sexo;
private String colorPiel;

public Alumno() {

}
public Alumno(String nombre, int edad, char sexo, String colorPiel) {
    this.setNombre(nombre);
    this.setEdad(edad);
    this.setSexo(sexo);
    this.setColorPiel(colorPiel);
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad >= 17?edad:17;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo == 'h' || sexo =='m' || sexo == 'M' || sexo == 'H' ? sexo : 'I';
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        colorPiel = colorPiel.toUpperCase();

        switch (colorPiel){
            case "BLANCO":
                this.colorPiel = colorPiel;
                break;
            case "NEGRO":
            case "MORENO OSCURO":
                this.colorPiel = colorPiel;
                break;
                default:
                    this.colorPiel = "NEUTRO";
        }



    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sexo=" + sexo +
                ", colorPiel='" + colorPiel + '\'' +
                '}';
    }
}

