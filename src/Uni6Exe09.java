import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni6Exe09 {
    public Uni6Exe09() {
        final int tamanho = 30;
        Scanner scan = new Scanner(System.in);
        int[] notas = new int[tamanho];
        int[] idades = new int[tamanho];
        int[] sexos = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            sexos[i] = ler(scan, "Cliente " + (i + 1) + " informe o seu sexo (1-Feminino, 2-Masculino): ");
            notas[i] = ler(scan, "Cliente " + (i + 1) + " informe a sua nota para o filme (de 0 a 10): ");
            idades[i] = ler(scan, "Cliente " + (i + 1) + " informe a sua idade: ");
            System.out.println();
        }

        double media = mediaCinema(notas);
        mediaHomens(notas, sexos);
        notaMulherMaisJovem(notas, sexos, idades);
        anciasNotaMaiorMedia(notas, sexos, idades, media);
        scan.close();
    }

    public static void main(String[] args) {
        new Uni6Exe09();
    }

    public int ler(Scanner scan, String mensagem) {
        System.out.print(mensagem);
        return scan.nextInt();
    }

    public double mediaCinema(int[] notas) {
        double total = 0;
        for (int nota : notas) {
            total += nota;
        }
        DecimalFormat df = new DecimalFormat("0.00");
        double media = total / notas.length;
        System.out.println("Média recebida pelo cinema: " + df.format(media));
        return media;
    }
    public void mediaHomens (int[] notas, int[] sexos) {
        double total = 0;
        int qtdHomens = 0;
        for (int i = 0; i < notas.length; i++) {
            if (sexos[i] == 2) {
                qtdHomens++;
                total += notas[i];
            }
        }
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Média dada pelos homens: " + df.format(total / qtdHomens));
    }
    public void notaMulherMaisJovem(int[] notas, int sexos[], int[] idades) {
        int idadeMaisJovem = Integer.MAX_VALUE;
        int indexMulherMaisJovem = -1;
        for (int i = 0; i < notas.length; i++) {
            if (sexos[i] == 1 && idades[i] < idadeMaisJovem) {
                idadeMaisJovem = idades[i];
                indexMulherMaisJovem = i;
            }
        }
        System.out.println("Nota dada pela mulher mais jovem: " + notas[indexMulherMaisJovem]);
    }

    public void anciasNotaMaiorMedia(int[] notas, int sexos[], int[] idades, double media) {
        int qtd = 0;
        for (int i = 0; i < notas.length; i++) {
            if (sexos[i] == 1 && idades[i] > 50 && notas[i] > media) {
                qtd++;
            } 
        }
        System.out.println("Quantidade de mulheres com mais 50 anos que deram nota acima da média: " + qtd);
    }
}