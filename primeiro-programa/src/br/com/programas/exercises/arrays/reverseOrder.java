package br.com.programas.exercises.arrays;
import java.util.Scanner;

public class reverseOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] list = {1, 2, 3, 4, 5};

        for (int i = list.length -1; i >= 0; i-- ){
            System.out.print(list[i] + " ");

        }
    }
}
