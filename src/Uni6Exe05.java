import java.util.Scanner;

public class Uni6Exe05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] respostasMoca = new String[5];
        String[] respostasRapaz = new String[5];

        String[] perguntas = {
            "Gosta de música sertaneja?",
            "Gosta de futebol?",
            "Gosta de seriados?",
            "Gosta de redes sociais?",
            "Gosta da Oktoberfest?"
        };

        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i]);
            System.out.print("Moça: ");
            respostasMoca[i] = scan.next().toUpperCase().trim();
            System.out.print("Rapaz: ");
            respostasRapaz[i] = scan.next().toUpperCase().trim();
            System.out.println("\n");
        }
        scan.close();

        int pontos = 0;
        for (int i = 0; i < perguntas.length; i++) {
            String moca = respostasMoca[i];
            String rapaz = respostasRapaz[i];
            if (moca.equals(rapaz)) {
                pontos += 3;
            } else if ((moca.equals("SIM") && rapaz.equals("NAO")) || (moca.equals("NAO") && rapaz.equals("SIM"))) {
                pontos -= 2;
            } else {
                pontos++;
            }
        }

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
}
