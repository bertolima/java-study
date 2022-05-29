package br.com.programas.exercises.aritmetica;

public class mensagem {

    public static void mensagemBomdia(int hora) {
        if (hora >= 5 && hora < 12) {
            System.out.println("Bom dia!");
        } else if (hora >= 12 && hora <= 17) {
            System.out.println("Boa Tarde!");
        } else {
            System.out.println("Boa noite!");
        }
    }
}
