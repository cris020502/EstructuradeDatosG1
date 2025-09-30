package mx.edu.uttt.poo;
import javax.swing.JOptionPane;
public class TestAlumno {
    public static void main(String[] args) {
        Alumno a1 = new Alumno();

      String nombre = "";
      int edad = 0;
      char sexo = '\0';
      String colorPiel="";
      nombre= JOptionPane.showInputDialog("Introduce tu nombre","Nombre");
      edad= Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
      sexo= JOptionPane.showInputDialog("introduce tu sexo h/m").charAt(0);
      colorPiel= JOptionPane.showInputDialog("introduce tu color piel {Blanco,negro,moreno oscuro}");

        a1.setNombre(nombre);
        a1.setEdad(edad);
        a1.setSexo(sexo);
        a1.setColorPiel(colorPiel);
        String salida ="Resultados+\n"+"Nombre"+a1.getNombre()+ "\n" +"Edad"+a1.getEdad()+"\n"+
                "Sexo"+a1.getSexo()+"\n"+"ColorPiel"+a1.getColorPiel();

        JOptionPane.showMessageDialog(null, salida);
        JOptionPane.showMessageDialog(null,"Resultados \n"+a1 );

    }

}
