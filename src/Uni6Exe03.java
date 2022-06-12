import java.util.Scanner;

public class Uni6Exe03 {
    public Uni6Exe03() {
        Scanner scan = new Scanner(System.in);
        double[] valores = new double[12];
        lerValores(scan, valores);
        ajustarValores(valores);
        escreverValores(valores);
        scan.close();
    }

    public double[] lerValores(Scanner scan, double[] valores) {
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Informe o " + (i + 1) + "° valor: ");
            valores[i] = scan.nextDouble();

        }
        return valores;
    }

    public double[] ajustarValores(double[] valores) {
        double aumento = 0;
        for (int i = 0; i < valores.length; i++) {
            
            if (valores[i] % 2 == 0) {
                aumento = valores[i] * 0.02;
                valores[i] += aumento;

            } else {
                aumento = valores[i] * 0.05;
                valores[i] += aumento;
            }
           
        }
        return valores;
    }
    
    public void escreverValores (double[] valores){
        System.out.println("Valores Atualizados: ");
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);

        }
    }

    public static void main(String[] args) {
        new Uni6Exe03();
    }
}
