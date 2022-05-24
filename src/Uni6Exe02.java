import java.util.Scanner;

/**
 * Uni6Exe02
 */
public class Uni6Exe02 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double[] vetor = new double[12];
        double total = 0;

        for (int i = 0; i < 12; i++) {
            System.out.print("Informe o " + (i + 1) + "° número: ");
            vetor[i] = scan.nextDouble();
            total += vetor[i];
        }
        scan.close();

        double media = total / vetor.length;

        for (double num : vetor) {
            if (num > media) System.out.println(num);
        }

    }
}
