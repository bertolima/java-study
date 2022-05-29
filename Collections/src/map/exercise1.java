package map;

import java.util.*;

public class exercise1 {
    //criar um dicionario de estados e sua população
    public static void main(String[] args) {
        Map<String, Integer> estados = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        for (Map.Entry<String, Integer> estado : estados.entrySet()){
            System.out.println(estado.getKey() + " - " + estado.getValue());
        }
        System.out.println(" ");
        //substituir a população do RN por 3534165
        estados.put("RN", 3534165);
        for (Map.Entry<String, Integer> estado : estados.entrySet()) {
            System.out.println(estado.getKey() + " - " + estado.getValue());
        }

        //confira se o estado do PB está no dicionario, caso não o adicione
        if (estados.containsKey("PB")) {
            System.out.println("O estado do PB está no dicionario");
        } else {System.out.println("O estado do PB não está no dicionario");
            estados.put("PB", 4039277);
        }

        //exiba a população de PE
        System.out.println("A população de Pernambuco é de " + estados.get("PE"));

        //Exiba os estados e sua população na ordem q foram informados
        System.out.println("---Estados na ordem que foram informados");
        Map<String, Integer> estados1 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        for (Map.Entry<String, Integer> estado : estados1.entrySet()){
            System.out.println(estado.getKey() + " - " + estado.getValue());
        }

        System.out.println("---Estados e sua população na ordem alfabetica---");
        Map<String, Integer> estados2 = new TreeMap<>(estados){};
        for (Map.Entry<String, Integer> estado : estados2.entrySet()){
            System.out.println(estado.getKey() + " - " + estado.getValue());
        }

        //Exiba o estado com a menor população e a sua quantidade
        System.out.println("---Estado com menor população---");
        Integer menorPop = Collections.min(estados.values());
        String menorEstado = "";
        for(Map.Entry<String, Integer> estado : estados.entrySet()){
            if(estado.getValue().equals(menorPop)) menorEstado = estado.getKey();
        }
        System.out.println(menorEstado + " - " + menorPop);

        //exiba o estado com maior populção e a sua quantidade
        System.out.println("---Estado com a maior população e sua quantidade---");
        Integer maiorPop = Collections.max(estados.values());
        String maiorEstado = "";
        for (Map.Entry<String, Integer> estado : estados.entrySet()){
            if (estado.getValue().equals(maiorPop)) maiorEstado = estado.getKey();
        }
        System.out.println(maiorEstado + " - " + maiorPop);

        //exiba a soma da população dos estados

        int c = 0;
        for (Map.Entry<String, Integer> estado : estados.entrySet()) {
            c += estado.getValue();
        }
        System.out.println("---A soma da população dos estados é " + c);

        //media da população dos estados do dicionario
        System.out.println(c / estados.size() + " é a média da população dos estados");

        //removendo estados com a população menor que 4000000
        System.out.println("---Estados com menos de 4.000.000 de habitantes---");
        Iterator<Integer> iterator = estados.values().iterator();
        while(iterator.hasNext()){
            if(iterator.next() < 4000000) iterator.remove();
        }
        for (Map.Entry<String, Integer> estado : estados.entrySet())
            System.out.println(estado.getKey() + " - " + estado.getValue());

        // apagando os estados do dicionario
        estados.clear();
        System.out.println(estados);

        //checando se o dicionario esta vazio
        System.out.println(estados.isEmpty());

    }
}
