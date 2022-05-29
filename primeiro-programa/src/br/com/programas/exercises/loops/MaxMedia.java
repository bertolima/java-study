package br.com.programas.exercises.loops;
import java.util.Scanner;

public class MaxMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number;
        int maior = 0;
        int media = 0;

        for( int i = 0; i < 5; i++){
            System.out.println("Digite um número ");
            number = scan.nextInt();
            if (number > maior) {
                maior = number;
            }
            media = media + number;
        }

        media = media / 5;
        System.out.println("O maior número é " + maior);
        System.out.println("A media dos números é " + media);





    }
}
