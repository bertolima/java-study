package br.com.programas.exercises.loops;
import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        System.out.println("Digite o número da tabuada");
        number = scan.nextInt();

        for (int i = 1; i < 11; i++){
            System.out.println(number + " X " + i + " = " + (number * i));
        }
    }
}
