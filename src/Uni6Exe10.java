import java.util.Scanner;

public class Uni6Exe10 {

    Uni6Exe10() {
        int[] vetor = new int[50];
        Scanner scan = new Scanner(System.in);
        int acao = -1;

        while (acao != 8) {
            System.out.println(
                "\n-----------------------------" +
                "\n| 1: Incluir valor          |" +
                "\n| 2: Pesquisar valor        |" +
                "\n| 3: Alterar valor          |" +
                "\n| 4: Excluir valor          |" +
                "\n| 5: Mostrar valores        |" +
                "\n| 6: Ordenar valores        |" +
                "\n| 7: Inverter valores       |" +
                "\n| 8: Sair do sistema        |" +
                "\n-----------------------------"
            );
            acao = scan.nextInt();
            
            switch (acao) {
                case 1: vetor = incluirValor(scan, vetor);
                break;
                case 2: pesquisarValor(scan, vetor);
                break;
                case 3: vetor = alterarValor(scan, vetor);
                break;
                case 4: vetor = excluirValor(scan, vetor);
                break;
                case 5: mostrarValores(vetor);
                break;
                case 6: vetor = ordenarValores(vetor);
                break;
                case 7: vetor = inverter(vetor);
                break;
            }
        }
        scan.close();
    }
    
    public static void main(String[] args) {
        new Uni6Exe10();
    }
    public int[] incluirValor(Scanner scan, int[] vetor) {
        System.out.print("Informe um valor diferente de 0: ");
        int valor = scan.nextInt();
        int index = -1;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == 0) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("O valor não foi incluído pois o vetor já está cheio");
        } else {
            System.out.println("O valor foi incluído com sucesso");
            vetor[index] = valor;
        }
        
        return vetor;
    }
    public void pesquisarValor (Scanner scan , int[] vetor){
        System.out.print("Informe o valor que deseja pesquisar: ");
        int pesquisa = scan.nextInt();

        int index = encontrar(vetor, pesquisa);
        if (index > -1) {
            System.out.println("O número está incluído no vetor");
        } else {
            System.out.println("Número não encontrado!");
        }
    }
    
    public int[] alterarValor (Scanner scan , int[] vetor){
        System.out.print("Informe o número a ser substituído: ");
        int pesquisa = scan.nextInt();
        System.out.print("Informe o substituto (diferente de 0): ");
        int novo = scan.nextInt();

        int index = encontrar(vetor, pesquisa);
        if (index > -1) {
            vetor[index] = novo;
        } else {
            System.out.println("Número não encontrado!");
        }
        return vetor;
    }

    public int encontrar (int[] vetor, int valor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                return i;
            }
        }
        return -1;
    }
    public int[] excluirValor(Scanner scan, int[] vetor) {
        System.out.print("Informe o número a ser apagado: ");
        int apagar = scan.nextInt();

        int index = encontrar(vetor, apagar);
        if (index > -1) {
            for (int i = index; i < vetor.length; i++) {
                if (i == 49) {
                    break;
                }
                vetor[i] = vetor[i + 1];
            }
            System.out.println("O " + (index + 1) + "° item foi excluido");
        } else {
            System.out.println("Valor não existe");
        }

        return vetor;
    }
    public void mostrarValores(int[] valores) {
        String relatorio = "[";
        for (int valor: valores) {
            if (valor != 0) {
                relatorio += valor + "; ";
            }
        }
        relatorio += "]";
        System.out.println(relatorio);
    }

    public int[] ordenarValores(int[] valores) {
        boolean mudou = true;
        while (mudou) {
            mudou = false;
            for (int i = 0; i < valores.length; i++) {
                int proximoIndex = i + 1 < valores.length ? i + 1 : i;
                if (valores[i] > valores[proximoIndex]) {
                    mudou = true;
                    int valorMenor = valores[proximoIndex];
                    valores[proximoIndex] = valores[i];
                    valores[i] = valorMenor;
                }
            }
        }
        return valores;
    }

    public int[] inverter(int[] vetor) {
        int[] novoVetor = new int[vetor.length];
        for (int i = 0; i < vetor.length; i++) {
            int valor = vetor[vetor.length - (i + 1)];
            novoVetor[i] = valor;
        }
        while (novoVetor[0] == 0) {
            for (int i = 0; i < novoVetor.length; i++) {
                int proximoIndex = i + 1 < novoVetor.length ? i + 1 : i;
                int valorMenor = novoVetor[proximoIndex];
                novoVetor[proximoIndex] = novoVetor[i];
                novoVetor[i] = valorMenor;
            }
        }
        return novoVetor;
    }
}