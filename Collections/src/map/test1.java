package map;

import java.util.*;

public class test1 {
    public static void main(String[] args) {
        //criar um dicionario de carros com o seu consumo
        Map<String, Double> carros = new HashMap<>(){{
            put("Argo", 14.5d);
            put("Ford Ka", 13.0d);
            put("hb20", 15.2d);
            put("onix", 14.8d);
        }};
        System.out.println(carros);

        //substitui o valor de consumo do carro (troca o valor referente ao valor da key)
        carros.put("Argo", 15.0);
        System.out.println(carros);

        //verificar se um modelo(key) está no dicionario
        System.out.println(carros.containsKey("Argo"));

        //retorna o valor que está atrelado ao modelo(key)
        System.out.println(carros.get("onix"));

        //exiba os modelos (retorna todas as chaves do dicionario como String numa Set)
        System.out.println(carros.keySet());

        //exiba os valores de consumo dos carros(retorna o elemento atrelado ás keys)
        Double melhorConsumo = Collections.max(carros.values());

        //exiba o modelo mais economico e o seu consumo (o max dos valoes)
        System.out.println(Collections.max(carros.values()));
        Set<Map.Entry<String, Double>> entries = carros.entrySet();
        String modeloEficiente = "";

        for (Map.Entry<String, Double> entry: entries){
            if(entry.getValue().equals(melhorConsumo))
                modeloEficiente = entry.getKey();
        }
        System.out.println(modeloEficiente +" " + melhorConsumo);

        //exiba o modelo menos economico e seu consumo
        Double maiorConsumo = Collections.min(carros.values());
        String modeloConsumidor = "";
        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(maiorConsumo)) {
                modeloConsumidor = entry.getKey();
                System.out.println(modeloConsumidor + " " + maiorConsumo);
            }
        }

        //exiba a soma dos consumos
        Collection<Double> todosCarros = carros.values();
        double c = 0;
        for (Double carros1 :todosCarros) c += carros1;
        System.out.println("A soma dos consumos é de " + c);

        //exiba a media dos consumos
        double media;
        media = c / todosCarros.size();
        System.out.println("A média dos consumos é de " + media);

        //Remova os modelos com consumo igual a 15.2
        Iterator<Double> iterator = carros.values().iterator();
        while(iterator.hasNext()){
            if(iterator.next().equals(15.2)) iterator.remove();
        }
        System.out.println(carros);

        //imprimir na ordem de inserção
        Map<String, Double> carros3 = new LinkedHashMap<>(){{
            put("Argo", 14.5d);
            put("Ford Ka", 13.0d);
            put("hb20", 15.2d);
            put("onix", 14.8d);
        }};
        System.out.println(carros3);

        Map<String, Double> carros4 = new TreeMap<>(carros3);
        System.out.println(carros4);

        //apagar dicionario
        carros.clear();

        //verificar se esta vazio
        System.out.println(carros.isEmpty());







    }
}
