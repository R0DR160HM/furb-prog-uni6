import java.util.Scanner;

public class Uni6Exe05 {

    public Uni6Exe05() {
        Scanner scan = new Scanner(System.in);
        
        String[] respostasMoca = leRespostas(scan);
        String[] respostasRapaz = leRespostas(scan);
        int pontos = calcula(respostasMoca, respostasRapaz);
        exibe(pontos);
        
        scan.close();
    }
    
    public String[] leRespostas(Scanner scan) {
        String[] perguntas = {
            "Gosta de música sertaneja?",
            "Gosta de futebol?",
            "Gosta de seriados?",
            "Gosta de redes sociais?",
            "Gosta da Oktoberfest?"
        };
        String[] respostas = new String[5];
    
        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i]);
            respostas[i] = scan.next().toUpperCase().trim();
        }
        return respostas;
    }

    public int calcula(String[] respostas1, String[] respostas2) {
        int pontos = 0;
        for (int i = 0; i < respostas1.length; i++) {
            String moca = respostas1[i];
            String rapaz = respostas2[i];
            if (moca.equals(rapaz)) {
                pontos += 3;
            } else if ((moca.equals("SIM") && rapaz.equals("NAO")) || (moca.equals("NAO") && rapaz.equals("SIM"))) {
                pontos -= 2;
            } else {
                pontos++;
            }
        }
        return pontos;
    }

    public void exibe(int pontos) {
        if (pontos == 15) {
            System.out.println("Casem!");
        } else if (pontos >= 10) {
            System.out.println("Vocês têm muita coisa em comum!");
        } else if (pontos >= 5) {
            System.out.println("Talvez não dê certo :(");
        }  else if (pontos >= 0) {
            System.out.println("Vale um encontro.");
        } else if (pontos >= -9) {
            System.out.println("Melhor não perder tempo");
        } else {
            System.out.println("Vocês se odeiam");
        }
    }

    public static void main(String[] args) {
        new Uni6Exe01();
    }
}
