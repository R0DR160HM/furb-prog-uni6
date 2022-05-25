import java.util.Scanner;

/**
 * Faça um programa que leia um valor N inteiro. Com base neste valor, crie um vetor do tipo real.
 * Em seguida, solicite ao usuário informar essa quantidade N de valores reais para popular o vetor.
 * Após ter preenchido o vetor, solicite que o usuário informe um outro valor real.
 * Informe para o usuário se este valor informado se encontra cadastrado no vetor.
 * Faça um método para ler o vetor e outro, que retorne verdadeiro ou falso, para encontrar o valor.
 */
public class Uni6Exe06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Qual deve ser o tamanho do vetor? ");
        int cap = scan.nextInt();
        double[] valores = new double[cap];

        for (int i = 0; i < cap; i++) {
            System.out.print("Informe o " + (i + 1) + "° valor: ");
            valores[i] = scan.nextDouble();
        }

        System.out.print("\nE com qual valor deve ser comparado? ");
        double valorDiferente = scan.nextDouble();
        scan.close();

        for (double valor: valores) {
            if (valor == valorDiferente) {
                System.out.println(valorDiferente + " está cadastrado no vetor!");
            }
        }
        
    }
}
