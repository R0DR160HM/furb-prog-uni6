import java.util.Scanner;

public class Uni6Exe08 {

    public Uni6Exe08() {
        double[] valores = obterValores();
        double[][] tabela = criarTabela(valores);
        exibir(valores, tabela);
    }
    
    public double[] obterValores() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe o tamanho do vetor (máximo 20): ");
        int cap = scan.nextInt();
        cap = cap > 20 ? 20 : cap;
        double[] valores = new double[cap];

        for (int i = 0; i < cap; i++) {
            System.out.print("Informe o " + (i + 1) + "° valor: ");
            valores[i] = scan.nextDouble();
        }
        scan.close();
        return valores;
    }

    public double[][] criarTabela(double[] valores) {
        double[][] lista = new double[valores.length][2];
        int index = 0;
        for (double valor : valores) {
            boolean alterado = false;
            for (int i = 0; i < lista.length; i++) {
                if (lista[i] != null && lista[i][0] == valor) {
                    alterado = true;
                    lista[i][1]++;
                }
            }
            if (!alterado) {
                lista[index][0] = valor;
                lista[index][1] = 1;
                index++;
            }
        }
        return lista;
    }

    public void exibir(double[] valores, double[][] tabela) {
        String relatorio = "";
        for (double valor : valores) {
            relatorio += valor + "; ";
        }
        relatorio += "\n";
        for (double[] linha : tabela) {
            if (linha[0] != 0 && linha[1] != 0) {
                relatorio += "\n" + linha[0] + ": " + Math.round(linha[1]);
            }
        }
        System.out.println(relatorio);
    }

    public static void main(String[] args) {
        new Uni6Exe08();
    }
}
