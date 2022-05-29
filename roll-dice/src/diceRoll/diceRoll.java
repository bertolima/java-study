package diceRoll;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class diceRoll {
    public static void main(String[] args) {
        //criar um HashMap para guardar quantas vezes o lado l apareceu no lançamento de dados
        Map<Integer, Integer> dado = new HashMap<>();
        //antes do lançamento, todos os lados apareceram 0 vezes
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        dado.put(1, a);
        dado.put(2, b);
        dado.put(3, c);
        dado.put(4, d);
        dado.put(5, e);
        dado.put(6, f);

        Random gerador = new Random();
        for (int i = 0; i < 100; i++){
            //o random gerador vai gerar numeros entre 1 e 6
            //os if's dizem pra qual chave vai cada valor, no caso, o valor 1 vai pra chave 1, o valor 2 pra chave 2...
            int dados = (gerador.nextInt(6) + 1);
            if (dados == 1) dado.put(1, a += 1);
            if (dados == 2) dado.put(2, b += 1);
            if (dados == 3) dado.put(3, c += 1);
            if (dados == 4) dado.put(4, d += 1);
            if (dados == 5) dado.put(5, e += 1);
            if (dados == 6) dado.put(6, f += 1);
        }
        System.out.println("O valor 1 apareceu " + dado.get(1) + " vezes!");
        System.out.println("O valor 2 apareceu " + dado.get(2) + " vezes!");
        System.out.println("O valor 3 apareceu " + dado.get(3) + " vezes!");
        System.out.println("O valor 4 apareceu " + dado.get(4) + " vezes!");
        System.out.println("O valor 5 apareceu " + dado.get(5) + " vezes!");
        System.out.println("O valor 6 apareceu " + dado.get(6) + " vezes!");
    }
}
