package br.com.programas.exercises.aritmetica;

public class Calculadora {

    public static void soma(double n1, double n2) {
        double resultado = n1 + n2;
        int resultadoInt = (int)resultado;
        System.out.println(n1 + " + " + n2 + " é " + " = " + resultadoInt);

    }

    public static void sub(double n1, double n2) {
        double resultado = n1 - n2;
        int resultadoInt = (int)resultado;
        System.out.println(n1 + " - " + n2 + " é = " + resultadoInt);
    }

    public static void div(double n1, double n2) {
        double resultado = n1 / n2;
        int resultadoInt = (int)resultado;
        System.out.println(n1 + "/" + n2 + "é = " + resultadoInt);
    }

    public static void mult(double n1, double n2) {
        double resultado = n1 * n2;
        int resultadoInt = (int)resultado;
        System.out.println(n1 + " * " + n2 + " é = " + resultadoInt);

    }

}
