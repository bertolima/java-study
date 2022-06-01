package dio;
import java.util.Scanner;

public class parimpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();


        scan.nextLine();
        for (int i = 0; i < n1; i++) {
            String nome1 = scan.next();
            String parImpar = scan.next();
            String nome2 = scan.next();
            String parImpar2 = scan.next();
            int valor = scan.nextInt();
            int valor2 = scan.nextInt();


            int soma = valor + valor2;
            if (soma % 2 == 0 && parImpar.equals("PAR")) System.out.println(nome1);
            if (soma % 2 != 0 && parImpar.equals("PAR")) System.out.println(nome2);
            if (soma % 2 == 0 && parImpar.equals("IMPAR")) System.out.println(nome2);
            if (soma % 2 != 0 && parImpar.equals("IMPAR")) System.out.println(nome1);
        }
        scan.close();
    }
}

