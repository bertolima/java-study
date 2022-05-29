package br.com.programas.exercises.aritmetica;

public class emprestimo {
    public static void taxas(double valor, int parcelas, double taxa) {

        double valorMensal = valor / parcelas;
        double valorMensaltaxa = valorMensal * (1 + taxa);
        double valorTotal = valorMensaltaxa * parcelas;
        float valorTotalf = (float)valorTotal;

        System.out.println("O valor do empréstimo em " + parcelas + " vezes é de " + valorTotalf + " reais !");

    }
}
