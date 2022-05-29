package br.com.programas.exercises.loops;
import java.util.Scanner;

public class ParUnpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtdNumbers;
        int number;
        int Npar = 0;
        int Nunpar = 0;

        System.out.println("Quantos números serão? ");
        qtdNumbers = scan.nextInt();
        System.out.println("Digite " + qtdNumbers + " números");

        for (int i = 0; i < qtdNumbers; i++){
            number = scan.nextInt();
            if (number % 2 == 0) Npar++;
            else Nunpar++;
        }
        System.out.println("A quantidade de números pares é " + Npar + " e a quantidade de números ímpares é " + Nunpar);


    }
}
