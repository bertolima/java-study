package colletionsFramework.lists;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class gradesStudents {
    public static void main(String[] args) {
        //lista de notas é 4, 7, 5, 9, 10, 2, 3
        List<Double> notas = new ArrayList<Double>();
        notas.add(4d);
        notas.add(7d);
        notas.add(5d);
        notas.add(9d);
        notas.add(10d);
        notas.add(2d);
        notas.add(3d);
        System.out.println(notas);

        //index.Of - utilizado para conferir em que posição da lista está o valor
        System.out.println("A posição da nota 5: " + notas.indexOf(5d));

        //.add adiciona elemento 8 na posição quatro
        notas.add(4, 8d);
        System.out.println(notas);

        //.set - utilizado para substituição de valores numa lista
        notas.set(4, 7d);
        System.out.println(notas);

        //.contains - utiizado para conferir se elemento indicado está na lista
        System.out.println(notas.contains(2d));

        //for each - utiizado para imprimir x de uma lista x : lita
        for (Double nota : notas) {
            System.out.print(nota + " ");
        }

        //.get - recebe a posição e passa o elemento
        System.out.println(notas.get(4));
        System.out.println(notas.toString());

        //Collections.min - pega o menor valor da array
        System.out.println(Collections.min(notas));

        //Collections.max - pega o maior valor da array
        System.out.println(Collections.max(notas));

        //obter soma de variaveis dentro da array
        double c = 0;
        for (int i = 0; i < notas.size(); i++){
            c += notas.get(i);
        }
        System.out.println(c);

        //calculo de media de numeros da array
        double d = 0;
        double media;
        for (int i = 0; i < notas.size(); i++) {
            d += notas.get(i);
        }
        media = d / notas.size();
        System.out.println(media);

        //.remove - remove um elemento da array, se não especificar o tipo, vai remover a posição
        notas.remove(2d);
        System.out.println(notas);

        //remover elementos que não cupram determinadda caracteristica da array
        for (int i = 0; i < notas.size(); i++){
            if (notas.get(i) < 7) notas.remove(i);
        }
        System.out.println(notas);

        //.clear para apagar toda a lista
        notas.clear();
        System.out.println(notas);

        //.isEmpty para conferir se a lista esta vazia(retorna booleano)

        System.out.println(notas.isEmpty());





    }
}
