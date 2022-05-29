package colletionsFramework.lists;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Crime {
    public static void main(String[] args) {
        String telefone;
        String local;
        String moradia;
        String dinheiro;
        String trabalho;
        int c = 0;
        Scanner scan = new Scanner(System.in);
        List<String> questions = new ArrayList<>();

        System.out.println("Telefonou para a vítima?");
        telefone = scan.next();

        System.out.println("Esteve no local do crime?");
        local = scan.next();

        System.out.println("Mora perto da vítima?");
        moradia = scan.next();

        System.out.println("Devia para a vítima?");
        dinheiro = scan.next();

        System.out.println("Já trabalhou para a vítima?");
        trabalho = scan.next();

        questions.add(telefone);
        questions.add(local);
        questions.add(moradia);
        questions.add(dinheiro);
        questions.add(trabalho);

        //verifica elementos da array
        //System.out.println(questions);

        for (int i = 0; i < questions.size(); i++){
            if (questions.get(i).equalsIgnoreCase("Sim")) c = c + 1;
        }

        //verifica o valor do contador apos as perguntas
        //System.out.println(c);

        if (c == 2) System.out.println("A pessoa é suspeita!");
        else if (c >= 3 && c <= 4) System.out.println("A pessoa é cúmplice!");
        else if (c == 5) System.out.println("A pessoa é o assassino!");
        else System.out.println("A pessoa é inocente!");



    }
}
