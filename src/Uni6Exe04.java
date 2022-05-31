import java.util.Scanner;

/**
 * Faça um programa para ler os valores de dois vetores de inteiros,
 * cada um contendo 10 elementos. Crie um terceiro vetor em que cada elemento é a soma dos
 * valores contidos nas posições respectivas dos vetores originais.
 * Por exemplo, vetor1 = [1,2,3] vetor2 = [1,5,6] vetor3 = [2,7,9].
 * Exiba, ao final, os três vetores na tela. Faça três métodos:
 * um método para ler valores dos vetores, outro para somar e outro para escrever os vetores.
 */
public class Uni6Exe04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] somas = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "° par de valores:");
            vetor1[i] = scan.nextInt();
            vetor2[i] = scan.nextInt();
        }

        scan.close();

        for (int i = 0; i < vetor1.length; i++) {
            somas[i] = vetor1[i] + vetor2[i];
            System.out.println();
        }

        String rVetor1 = "";
        String rVetor2 = "";
        String rSomas = "";

        for (int i = 0; i < somas.length; i++) {
            rVetor1 += vetor1[i] + ", ";
            rVetor2 += vetor2[i] + ", ";
            rSomas += somas[i] + ", ";
        }

        System.out.println("Vetor 1:      " + rVetor1);
        System.out.println("Vetor 2:      " + rVetor2);
        System.out.println("Somas:        " + rSomas);

    }
}
