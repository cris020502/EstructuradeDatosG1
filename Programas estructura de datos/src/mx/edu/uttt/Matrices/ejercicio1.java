package mx.edu.uttt.Matrices;

public class ejercicio1 {
    public static void main(String[] args) {
        // sintaxix para la declaraciones
        // tipo de dato[][] nombre de la matriz
        // tide dato nombre matriz [][]

        //declarando matriz
        int[][] numAlumnos;
        double[][] calificaciones;
        double promedios[][];
        char[][] califLetras;
        String nombre[][];
//        //instanciar las matrices
//
       // int [][] = numAlumnos = new int[3][3];
        calificaciones = new double[4][4];
        promedios = new double[3][2];
        califLetras = new char[5][3];

      // nombre[0][0] = "Chunga";

        //asignar valores a una matriz
        String [] nombreVector={"Juan Moroni","Pablo Guerreo","Atzin Bravo","Kimberly"};

        String nombres [][]={{"Luis Hernandez","Jorge Campos","Luis Garcia"},
                {"Roberto Baggio","Ronaldo Nazario",""}};
        double [][] alturas= {

                {2.3,4.5,5.6},
                {10.2,8.5,4.6,},
        };

        //acceder a los valores de la matriz
        int i=0,j=0;
        double valor= alturas[0][j];
        valor = alturas[1][j];
        valor=alturas[alturas.length-1][j];//me da la ultima fila columna "j"
        valor=alturas[alturas.length-1][alturas[alturas.length-1].length-1];//ultima fila y ultima columna
        valor = alturas.length;//numero de filas
        valor=alturas[i].length;//numero de columnas


        Auto sedan1= new Auto("BMW",0,0.0);
        Auto sedan2= new Auto("BMW",100,15.0);
        Auto sedan3= new Auto("Toyota",0,0.0);
        Auto sportCar= new Auto("Ferrari",0,0.0);
        Auto rv1= new Auto("Jeep",0,0.0);
        Auto rv2= new Auto("Ford",200,30.0);

         Auto cars[][]={
                 {sedan1,sedan2,sedan3},
                 {sportCar,new Auto(),rv1},
                 {new Auto("Vocho",150,30.5),rv2,new Auto()}
         };

        System.out.println(cars.length);

    }
}