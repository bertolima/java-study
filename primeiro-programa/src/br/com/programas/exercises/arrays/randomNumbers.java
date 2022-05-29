package br.com.programas.exercises.arrays;
import java.util.Random;

public class randomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int[] randomNumbers = new int[20];

        for (int i = 0; i < randomNumbers.length; i++) {
            int number = random.nextInt(100);
            randomNumbers[i] = number;
        }
        System.out.println("Random Numbers: ");
        for(int i =0; i < randomNumbers.length; i++){
            System.out.print(randomNumbers[i] + " ");
        }
        System.out.println("");
        System.out.println("Sucessors Random Numbers: ");
        for(int i =0; i < randomNumbers.length; i++){
            System.out.print((randomNumbers[i] + 1) + " ");
        }
        System.out.println("");
        System.out.println("Predecessor Random Numbers: ");
        for(int i =0; i < randomNumbers.length; i++){
            System.out.print((randomNumbers[i] - 1) + " ");
        }
    }
}
