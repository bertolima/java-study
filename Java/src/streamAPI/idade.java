package streamAPI;
import java.util.Scanner;

public class idade {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int qtd = scan.nextInt();
        if (qtd % 2 == 0) System.out.println(0);
        else System.out.println(1);
        for (int i = 0; i < qtd; i++){
            int numero = scan.nextInt();
            if (numero % 2 == 0) System.out.println(0);
            if (numero % 2 != 0) System.out.println(1);
        }
    }
}