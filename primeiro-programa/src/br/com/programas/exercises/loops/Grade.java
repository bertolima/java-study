package br.com.programas.exercises.loops;
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int grade;

        while(true){
            System.out.println("Digite uma nota entre 0 e 10: ");
            grade = scan.nextInt();
            if (grade >= 0 && grade <= 10) break;
            else System.out.println("Nota Inválida!");
             }

        }

    }
