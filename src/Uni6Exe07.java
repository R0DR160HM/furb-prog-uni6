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
        scan.close();

        // Ordenar
        boolean changed = true;
        while (changed) {
            changed = false;
            for (int i = 0; i < valores.length; i++) {
                int valor = valores[i];
                if (i > 0 && valor < valores[i - 1]) {
                    changed = true;
                    int valorAnterior = valores[i - 1];
                    valores[i - 1] = valor;
                    valores[i] = valorAnterior;
                }
            } 
        }

        for (int valor : valores) {
            System.out.println(valor);
        }

    }    
}
