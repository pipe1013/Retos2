import java.util.Scanner;
public class
Reto1 {
    public static void main(String[] args) {

        double n,nota,total=0;
        Scanner lec=new Scanner(System.in);

        System.out.println("Por favor digite la cantidad de notas: ");
        n=lec.nextDouble();

        double[] notas = new double[(int) n];

        for (int i = 0; i < notas.length; i++) {

            System.out.println("Digite la nota : " + (i+1));
            nota=lec.nextDouble();

            notas[i]= nota;
            total += nota / n;

        }
        lec.close();
        System.out.println("Su nota final fue de: " + total);
        if(total<3){
            System.out.println("Reprobaste");
        }else if(total>4){
            System.out.println("Aprobaste con buenos resultados");
        }else{
            System.out.println("Pasaste raspando");
        }

    }
}
