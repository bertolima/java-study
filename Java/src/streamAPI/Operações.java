package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Operações {
    public static void main(String[] args) {


        List<String> randomNumbers =
            Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
/*
        randomNumbers.stream().forEach(new Consumer<String>() {
            public void accept(String s) {
                System.out.println(s);
        }
    });
*/

//    Com lambda
//    randomNumbers.forEach(s -> System.out.println(s));

    //com Reference method
        randomNumbers.forEach(System.out::println);


        System.out.println("---COLOCAR 5 PRIMEIROS NÚMEROS DENTRO DE UM SET---");
/*        randomNumbers.stream()
                .limit(5) //pega as primeiras x quantidade da lista
                .collect(Collectors.toSet()) //coloca em um set
                .forEach(System.out::println); //imprime com um reference method
*/
        Set<String> randomNumbers1 = randomNumbers.stream() //criação do Set que vai receber os numeros de randomNumbers
                .limit(5) //define a quantidade a ser colocada
                .collect(Collectors.toSet()); //coloca de fato os numeros no Set

        System.out.println("---TRANSFORMAR A LISTA DE STRINGS EM INTEIROS---");
/*        List<Integer> inteiros = randomNumbers.stream()
                .map(new Function<String, Integer>() { //A function vai receber um String e retornar um Integer
                    public Integer apply(String s) { //Tem que usar o método Applly
                        return Integer.parseInt(s); //vai converter a String s em Integer
                    }
                })
                .collect(Collectors.toList())
*/                ;
            //COM LAMBDA
/*        List<Integer> inteiros = randomNumbers.stream()//cria uma list de inteiros com randomnumbers como parametro
                .map(s -> Integer.parseInt(s)) //converte s String para S Integer
                .collect(Collectors.toList()); //coloca os elementos convertidos na lista inteiros
       System.out.println(inteiros);
*/
            //COM REFERENCE METHOD
          List<Integer> inteiros = randomNumbers.stream()
                  .map(Integer::parseInt)
                  .collect(Collectors.toList());

//        System.out.println("PEGUE OS NUMEROS PARES E MAIORES QUE 2---");
//        List<Integer> InteirosMaiores2 = randomNumbers.stream()
//                .map(Integer::parseInt)
//                .filter(i-> i % 2 == 0 && i > 2)
//                .collect(Collectors.toList());
//        System.out.println(InteirosMaiores2);
//        System.out.println("MOSTRAR MEDIA DOS NUMEROS---");
//        randomNumbers.stream()
//                .mapToInt(Integer::parseInt)
//                .average()
//                .ifPresent(System.out::println);
        System.out.println("---REMOVER OS NUMEROS IMPARES DA LISTA---");
        List<Integer> inteiros3 = randomNumbers.stream()
                .map(s -> Integer.parseInt(s))
                .collect(Collectors.toList());
        inteiros3.removeIf(i -> i % 2 != 0);
        System.out.println(inteiros3);







    }
}
