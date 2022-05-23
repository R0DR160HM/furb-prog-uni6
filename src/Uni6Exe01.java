import java.util.Scanner;

public class Uni6Exe01 {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        int[] vetor = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Informe o " + (i + 1) + "° número: ");
            vetor[i] = scan.nextInt();
        }
        scan.close();

        String relatorio = "";
        for (int i = vetor.length; i > 0; i--) {
            relatorio += vetor[i - 1] + "; ";
        }
        System.out.println(relatorio);
        
    }
}
