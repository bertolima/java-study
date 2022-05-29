package collections.framework.hash;
import java.util.*;

public class test {
    public static void main(String[] args) {
        //Criei um conjunto e adicionei notas
        Set<Double> notas = new HashSet<>(Arrays.asList(5d, 4d, 6d, 8d, 10d));
        System.out.println(notas);

        //perguntar se a nota esta dentro do conjunto (retorna true ou false)
        System.out.println(notas.contains(5d));

        //exibir a menor ou maior nota
        System.out.println(Collections.max(notas));
        System.out.println(Collections.min(notas));

        //exibir soma dos valores posso usar o foreach ou iterator (for lopp não pode, pois não ha posição em Set
        //foreach
        double c = 0;
        for (double nota: notas) c += nota;
        System.out.println(c);

        //iterator
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        //exibir a media das notas
        double media;
        media = c / notas.size();
        System.out.println(media);

        //remover a nota 5 (remove apenas o valor, não a posição)
        notas.remove(5d);
        System.out.println(notas);

        //remover notas menores que 8 (so da pra usar o iterator, pois ao remover um item do hash no loop foreach, acusa erro)
        //iterator
        Iterator<Double> remo = notas.iterator();
        while(remo.hasNext()){
            Double next = remo.next();
            if (next < 8) remo.remove();
        }
        System.out.println(notas);

        //exibir as notas na ordem que foram informadas (nessario usar um linkedhashset
        Set<Double> notasOrdem = new LinkedHashSet<>(Arrays.asList(5d, 4d, 6d, 8d, 10d));
        System.out.println(notasOrdem);

        //exibir notas na ordem crescente (necessario usar o treeset, pois a ordem crescente é a natural)
        Set<Double> notasCrescente = new TreeSet<>(notasOrdem);
        System.out.println(notasCrescente);

        //apagar o conjunto
        notas.clear();
        System.out.println(notas);

        //verificar se esta vazio(retorna true ou false)
        System.out.println(notas.isEmpty());

    }
}
