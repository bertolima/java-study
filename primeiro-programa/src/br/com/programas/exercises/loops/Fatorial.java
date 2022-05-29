package br.com.programas.exercises.loops;
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number;
        int c = 1;
        System.out.println("Digite um número para obter seu fatorial");
        number = scan.nextInt();

        for (int i = 1; i < (number + 1); i++){
            c = c * i;
        }
        System.out.println("O fatorial de " + number + " é igual a " + c);
    }
}
