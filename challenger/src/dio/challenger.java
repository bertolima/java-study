package dio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class challenger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 -x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("%.4f%n", distancia);
        scan.close();
    }
}
