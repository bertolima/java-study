package streamAPI;
/*Dadas as seguintes informações  de id e contato, crie um dicionário e
ordene este dicionário exibindo (Nome id - Nome contato);
id = 1 - Contato = nome: Simba, numero: 2222;
id = 4 - Contato = nome: Cami, numero: 5555;
id = 3 - Contato = nome: Jon, numero: 1111;
*/

import java.util.*;
import java.util.function.Function;

public class test1 {
    public static void main(String[] args) {
        Map<Integer, Contato> contatos = new HashMap<>(){{
            put(1, new Contato("Simba", 2222));
            put(4, new Contato("Cami", 5555));
            put(3, new Contato("Jon", 1111));
        }};

        System.out.println("---ORDEM DE INSEÇÃO---");

        for (Map.Entry<Integer, Contato> contato : contatos.entrySet())
            System.out.println("id: " + contato.getKey() + " - nome: " + contato.getValue().getNome() + " - número: " + contato.getValue().getNumero());


        System.out.println("---ORDEM DE ID---");
        Map<Integer, Contato> contatos1 = new TreeMap<>(contatos);
        for (Map.Entry<Integer, Contato> contato : contatos1.entrySet())
            System.out.println("id: " + contato.getKey() + " - nome: " + contato.getValue().getNome() + " - número: " + contato.getValue().getNumero());

        System.out.println("---ORDEM NUMERO DE TELEFONE---");
        //Essa é a forma em que criamos uma classe anônima(criamos o Comparator como argumento da TreeSet)
        /* Set<Map.Entry<Integer, Contato>> contatos2 = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            public int compare(Map.Entry<Integer, Contato> c1, Map.Entry<Integer, Contato> c2) {
                return Integer.compare(c1.getValue().getNumero(), c2.getValue().getNumero());
            }
            */

        //Essa é a forma resumida em que usamos a Function que vai retornar um Integer, com o método Apply, que vai comparar
        //os valores
        /*
        Set<Map.Entry<Integer, Contato>> contatos2 = new TreeSet<>(Comparator.comparing(
                new Function<Map.Entry<Integer, Contato>, Integer>() {
                    public Integer apply(Map.Entry<Integer, Contato> cont) {
                        return cont.getValue().getNumero();
                    }
                }));

        //Essa é a forma mais resumida usando um lambida, vamos criar um Comparator como argumento na Treeset
        //e vamos colocar "cont" como um objeto e -> dai colocamos o argumento, no caso vai comparar o valor do número do cont
        //que seria o cont.getValue().getNumero()
        */
        Set<Map.Entry<Integer, Contato>> contatos2 = new TreeSet<>(Comparator.comparing(
                cont -> cont.getValue().getNumero()));

        contatos2.addAll(contatos.entrySet());
        for (Map.Entry<Integer, Contato> contato : contatos2)
            System.out.println("id: " + contato.getKey() + " - nome: " + contato.getValue().getNome() + " - número: " + contato.getValue().getNumero());




    };
}
