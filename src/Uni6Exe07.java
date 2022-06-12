import java.util.Scanner;

public class Uni6Exe07 {
    public Uni6Exe07() {
        Scanner scan = new Scanner(System.in);
        int quantidade = lerQuantidade(scan);
        int[] vetor = new int[quantidade];
        int[] vetorOrdem = new int[vetor.length];
        vetor = lerVetor(scan, vetor);
        vetorOrdem = organizarVetor(vetor, vetorOrdem);
        escreverVetor(vetor, vetorOrdem);
        scan.close();
    }

    public static void main(String[] args) {
        new Uni6Exe07();
    }

    public int lerQuantidade(Scanner scan) {
        System.out.print("Digite a quantidade de elementos(Limite de 20): ");
        int quantidade = scan.nextInt();
        return quantidade;
    }

    public int[] lerVetor(Scanner scan, int[] vetor) {
        int i = 0;
        while (i < vetor.length) {
            System.out.print("\nInforme o " + (i + 1) + " ° valor: ");
            int num = scan.nextInt();
            boolean igual = false;
            for (int j = 0; j < vetor.length; j++) {
                if (vetor[j] == num) {
                    igual = true;
                }
            }
            if (igual) {
                System.out.println("O valor: " + num + " já foi informado, insira um diferente: ");
                i--;
            } else {
                vetor[i] = num;
            }
            i++;
        }
        return vetor;
    }

    public int[] organizarVetor(int[] vetor, int[] vetorOrdem) {
        int aux = 0;
        boolean controle;
        for (int i = 0; i < vetorOrdem.length; i++) {
            vetorOrdem[i] = vetor[i];
        }
        for (int i = 0; i < vetorOrdem.length; i++) {
            controle = true;
            for (int j = 0; j < (vetorOrdem.length - 1); j++) {
                if (vetorOrdem[j] > vetorOrdem[j + 1]) {
                    aux = vetorOrdem[j];
                    vetorOrdem[j] = vetorOrdem[j + 1];
                    vetorOrdem[j + 1] = aux;
                    controle = false;
                }
            }
            if (controle) {
                break;
            }
        }
        return vetorOrdem;
    }

    public void escreverVetor(int[] vetor, int[] vetorOrdem) {
        System.out.print("Vetor Origem: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("[" + vetor[i] + "]");
        }
        System.out.print("\nVetor Ordenado: ");
        for (int i = 0; i < vetorOrdem.length; i++) {
            System.out.print("[" + vetorOrdem[i] + "]");
        }
    }
}
