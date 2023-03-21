import java.util.Scanner;
public class Reto4 {
    public static void main(String[] args) {

        int tamano;
        int sumaColumna = 0;
        int sumaFila = 0;
        Scanner lec = new Scanner(System.in);

        System.out.println("Digite el tamaño del sudoku");
        tamano = lec.nextInt();

        int[][] sudoku = new int[tamano][tamano];

        for (int filas = 0; filas < sudoku.length; filas++) {
            for (int columnas = 0; columnas < sudoku[filas].length; columnas++) {
                System.out.println("Digite el número que va a tomar la posición [" + filas + "][" + columnas + "]");
                sudoku[filas][columnas] = lec.nextInt();
            }
        }
        for (int filas = 0; filas < sudoku.length; filas++) {
            for (int columnas = 0; columnas < sudoku[filas].length; columnas++) {
                sumaFila += sudoku[filas][columnas];
            }
            System.out.println("La suma de la fila " + filas + " es: " + sumaFila);
        }

        for (int columnas = 0; columnas < sudoku[0].length; columnas++) {
            for (int filas = 0; filas < sudoku.length; filas++) {
                sumaColumna += sudoku[filas][columnas];
            }
            System.out.println("La suma de la columna " + columnas + " es: " + sumaColumna);
        }
    }
}
