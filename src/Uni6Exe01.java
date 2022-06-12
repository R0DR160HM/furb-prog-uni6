import java.util.Scanner;

public class Uni6Exe01 {
    public Uni6Exe01() {
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[10];
        lerNumeros(scan, numeros);
        escreverNumeros(numeros);
        scan.close();
        
    }
    public static void main(String[] args) {

        new Uni6Exe01();

    }

    public int[] lerNumeros(Scanner scan, int[] numeros) {

        for (int i = 0; i < 10; i++) {
            System.out.print("Informe o " + (i + 1) + "° número: ");
            numeros[i] = scan.nextInt();
        }
        return numeros;
    }

    public void escreverNumeros(int[] numeros) {
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

    }
}
