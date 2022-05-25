import java.util.Scanner;

public class Uni6Exe07 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Qual deve ser o tamanho do vetor? ");
        int cap = scan.nextInt();
        if (cap > 20) cap = 20;

        int[] valores = new int[cap];

        for (int i = 0; i < cap; i++) {
            System.out.print("Informe " + (i + 1) + "° valor: ");
            int novoValor = scan.nextInt();
            for (int valor : valores) {
                if (valor == novoValor) {
                    i--;
                    break;
                }
            }
            valores[i] = novoValor;
        }

        // Ordenar
        for (int i = 0; i < valores.length; i++) {
            int valor = valores[i];
            // if (valores[i - 1] != null && valor < valores[i - 1]) {

            // }
        } 

    }    
}
