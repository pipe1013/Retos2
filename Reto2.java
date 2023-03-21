import java.util.Arrays;
import java.util.Scanner;
public class Reto2 {
    public static void main(String[] args) {
        int numNadadores;
        Scanner lec=new Scanner(System.in);

        System.out.println("Digite la cantidad de participantes: ");
        numNadadores=lec.nextInt();
        lec.nextLine();
        double[] tiempo=new double[numNadadores];
        String[] nombres=new String[numNadadores];

        for (int i = 0; i < numNadadores; i++) {

            System.out.println("Datos del participante:" + (i+1));
            System.out.println("Por favor digite el nombre del nadador ");
            nombres[i]=lec.nextLine();
            System.out.println("Por favor digite el tiempo del participante(en segundos): ");
            tiempo[i]=lec.nextDouble();
            lec.nextLine();


        }
        //Arrays.sort(tiempo) es un método de la clase Arrays en Java que ordena un arreglo de elementos en un orden específico. En este caso, el arreglo tiempo está siendo ordenado en orden ascendente, es decir, del tiempo más bajo al más alto.
        Arrays.sort(tiempo);
        // Imprimir los datos ordenados
        for (int i = 0; i < numNadadores; i++) {
            System.out.println("Participante " + (i + 1) + ": " + nombres[i] + " con un tiempo de " + tiempo[i] + " segundos.");
            lec.close();
        }
    }
}
