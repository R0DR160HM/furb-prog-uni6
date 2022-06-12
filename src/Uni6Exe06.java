import java.util.Scanner;

/**
 * Faça um programa que leia um valor N inteiro. Com base neste valor, crie um vetor do tipo real.
 * Em seguida, solicite ao usuário informar essa quantidade N de valores reais para popular o vetor.
 * Após ter preenchido o vetor, solicite que o usuário informe um outro valor real.
 * Informe para o usuário se este valor informado se encontra cadastrado no vetor.
 * Faça um método para ler o vetor e outro, que retorne verdadeiro ou falso, para encontrar o valor.
 */
public class Uni6Exe06 {
    public Uni6Exe06() {
        Scanner scan = new Scanner(System.in);
        int quantidade = lerQuantidade(scan);
        double[] valores = new double[quantidade];
        valores = lerValores(scan, valores);
        double valor = lerProximoValor(scan, valores);
        boolean confirmador = confirmarValores(valor, valores);
        escreverAoUsuario(confirmador, valor);
        scan.close();
      }
    
      public static void main(String[] args) {
        new Uni6Exe06();
      }
      public int lerQuantidade (Scanner scan){
        System.out.print("Informe a quantidade de valores: ");
        int quantidade = scan.nextInt();
        return quantidade;
      }
      public double[] lerValores(Scanner scan, double[] valores) {
        for (int i = 0; i < valores.length; i++) {
          System.out.print("\nInforme o " + (i + 1) + "° valor: ");
          valores[i] = scan.nextDouble();
        }
        return valores;
    
      }
    
      public double lerProximoValor(Scanner scan, double[] valores) {
        System.out.print("\nInforme mais um valor: ");
        double valor = scan.nextDouble();
        
        return valor;
      }
      public boolean confirmarValores(double valor, double[] valores) {
        boolean confirmador = false;
        int i = 0;
        while (confirmador != true){     
          if (valor == valores[i]){
            confirmador = true;
          } else confirmador = false;
          i++;
        }
        return confirmador;
      }
      public void escreverAoUsuario (boolean confirmador, double valor) {
        if (confirmador == true) {
          System.out.println("O valor " + valor + " está cadastrado");
        } else {
          System.out.println("O valor " + valor + " não está cadastrado");
        }
      }
}
