public class Reto3 {
    public static void main(String[] args) {
        char[][] teclado = {
                {'`', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '-', '=', '\b'},
                {'\t', 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', '[', ']', '\\'},
                {'\t','a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', ';', '{','}',','},
                {'\t','z', 'x', 'c', 'v', 'b', 'n', 'm', ',', '.', '/'}
        };

        for (int fila = 0; fila < teclado.length; fila++) {
            for (int columna = 0; columna < teclado[fila].length; columna++) {
                System.out.print(teclado[fila][columna] + " ");
            }
            System.out.println();
        }
    }
}
