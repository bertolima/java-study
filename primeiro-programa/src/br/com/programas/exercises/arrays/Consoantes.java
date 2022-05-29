package br.com.programas.exercises.arrays;
import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] consoantes = new String[6];

        System.out.println("Digite 6 letras: ");
        int c = 0;
        for (int i = 0; i < 6; i++) {
            String letras = scan.next();
            if (!(letras.equalsIgnoreCase("a") |
                    letras.equalsIgnoreCase("e") |
                    letras.equalsIgnoreCase("i") |
                    letras.equalsIgnoreCase("o") |
                    letras.equalsIgnoreCase("u"))) {
                consoantes[i] = letras;
                c++;
            }
        }
        System.out.println("Consoantes: ");
        for (int i = 0; i < consoantes.length; i++) {
            if (consoantes[i] != null) {
                System.out.print(consoantes[i] + " ");

            }
        }
        System.out.println("");
        System.out.print("O número de consoantes é: " + c);
    }


}
