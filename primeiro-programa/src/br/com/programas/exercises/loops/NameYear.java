package br.com.programas.exercises.loops;
import java.util.Scanner;

public class NameYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name;
        int year;

        while(true) {
            System.out.println("Name: ");
            name = scan.next();
            if (name.equals("0")) break;
            System.out.println("Year: ");
            year = scan.nextInt();
        }

    }
}
