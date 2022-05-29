package colletionsFramework.lists;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Temps {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double temperatura;
        double c = 0;
        double media;
        List<Double> temperaturas = new ArrayList<>();
        double[] temperaturasMaiores = new double[6];
        for (int i = 0; i < 6; i++){
            System.out.println("Digite a temperatura média do mês " + (i+1) + ": ");
            temperatura = scan.nextDouble();
            c += temperatura;
            temperaturas.add(temperatura);
        }

        media = c / temperaturas.size();

        System.out.println("Os meses que tiveram a temperatura maior que a média semestral foram: ");

        for (int i = 0; i < 6; i++){
            if (temperaturas.get(i) > media) temperaturasMaiores[i] = temperaturas.get(i);
            if (temperaturasMaiores[i] != 0d && i == 0)
                System.out.println("Janeiro, com " + temperaturasMaiores[i] + "° celsius");
            if (temperaturasMaiores[i] != 0d && i == 1)
                System.out.println("Fevereiro, com " + temperaturasMaiores[i] + "° celsius");
            if (temperaturasMaiores[i] != 0d && i == 2)
                System.out.println("Março, com " + temperaturasMaiores[i] + "° celsius");
            if (temperaturasMaiores[i] != 0d && i == 3)
                System.out.println("Abril, com " + temperaturasMaiores[i] + "° celsius");
            if (temperaturasMaiores[i] != 0d && i == 4)
                System.out.println("Maio, com " + temperaturasMaiores[i] + "° celsius");
            if (temperaturasMaiores[i] != 0d && i == 5)
                System.out.println("Junho, com " + temperaturasMaiores[i] + "° celsius");

        }
    }
}
