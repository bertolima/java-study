package dio;
import java.util.Scanner;

public class troco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int valorCompra = scan.nextInt();
            int valorPago = scan.nextInt();
            int troco = valorPago - valorCompra;
            if (valorCompra == 0 && valorPago == 0) break;

            int[] notas = {2, 5, 10, 20, 50, 100};
            boolean possivel = false;

            for (int i = 0; i < 6; i++)
                for (int k = 0; k < 6; k++)
                    if (troco - notas[k] == notas[i]) possivel = true;

            if (possivel) System.out.println("possible");
            else System.out.println("impossible");
        }
    }
}
