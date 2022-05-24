import java.util.Scanner;

public class Uni6Exe03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] vetor = new double[12];

        for (int i = 0; i < 12; i++) {
            System.out.print("Informe o " + (i + 1) + "° número: ");
            vetor[i] = scan.nextDouble();
            if (i % 2 == 0) {
                vetor[i] += vetor[i] * 0.02;
            } {
                vetor[i] += vetor[i] * 0.05;
            }
        }
        scan.close();

        for (double num : vetor) {
            System.out.println(num);
        }

    }
}
