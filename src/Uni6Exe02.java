import java.util.Scanner;

/**
 * Uni6Exe02
 */
public class Uni6Exe02 {

    public Uni6Exe02() {
        Scanner scan = new Scanner(System.in);
        double[] valores = new double[12];
        
        lerValores(scan, valores);
        double media = calcularMedia(valores, scan);
        escreverMedia(media, valores);
        scan.close();
    }
    public static void main(String[] args) {
        new Uni6Exe02();
    }
    
    public double[] lerValores(Scanner scan, double[] valores) {

        for (int i = 0; i < 12; i++) {
            System.out.print("Informe o " + (i + 1) + "° valor: ");
            double valor = scan.nextDouble();
            valores[i] = valor;
        }
        return valores;
    }

    public double calcularMedia(double[] valores, Scanner scan) {
        double total = 0;

        for (int i = 0; i < valores.length; i++) {
            total += valores[i];
        }
        return total / valores.length;

    }

    public void escreverMedia(double media, double[] valores) {
        System.out.println("Média: " + media);
        for (double valor : valores) {
            if (valor > media) {
                System.out.println("Valor maior que a média:" + valor);
            }
        }
    }
}
