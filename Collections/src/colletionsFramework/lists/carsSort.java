package colletionsFramework.lists;

/*
criar lista e ordenan de modo, carro-ano-cor
carro 1 = nome: Argo, ano: 2020, cor: branco
carro 1 = nome: Ka, ano: 2018, cor: azul
carro 1 = nome: Onix, ano: 2022, cor: preto
*/

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class carsSort {
    public static void main(String[] args) {
        List<Cars> myCars = new ArrayList<>(){{
            add(new Cars("Argo",2022,"branco"));
            add(new Cars("Ka",2016,"azul"));
            add(new Cars("Argo",2022,"preto"));
        }};

        System.out.println(myCars);

        //Collections.shuffle - para bagunçar a lista
        Collections.shuffle(myCars);
        System.out.println(myCars);


        /* ordenar em ordem natural
        1- Ir na classe Cars e implements Comparable<Cars>
        2- Clicar em Comparable e alt+enter pra implementas os métodos
        3- Ir para o compareTo
         */

        Collections.sort(myCars,new ComparatorAno());
        System.out.println(myCars);

        Collections.sort(myCars, new ComparatorAno());
        myCars.sort(new ComparatorAno());
        System.out.println(myCars);

        Collections.sort(myCars, new ComparatorNomeAnoCor());
        myCars.sort(new ComparatorNomeAnoCor());
        System.out.println(myCars);
    }
}

class Cars implements Comparable<Cars>{
    private String nome;
    private Integer ano;
    private String cor;

    public Cars(String nome, Integer ano, String cor) {
        this.nome = nome;
        this.ano = ano;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getAno() {
        return ano;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", ano=" + ano +
                ", cor='" + cor + '\'' +
                '}';
    }
    //return this.getNome().compareToIgnoreCase(elemento.getnome()
    //o compareToIgnorecase vai retornar -1 o elemento é menor, se der 0 é igual, se der 1 ele é maior
    //dessa foma se da a comparação de strings
    @Override
    public int compareTo(Cars car) {
        return this.getNome().compareToIgnoreCase(car.getNome());
    }
}
    //ordenar com base no ano
class ComparatorAno implements Comparator<Cars> {
        @Override
        public int compare(Cars c1, Cars c2) {
            return Integer.compare(c1.getAno(), c2.getAno());
        }
    }

class ComparatorCor implements Comparator<Cars> {
    @Override
    public int compare(Cars c1, Cars c2) {
        return c1.getCor().compareToIgnoreCase(c2.getCor());
    }
}

class ComparatorNomeAnoCor implements Comparator<Cars> {
    public int compare(Cars c1, Cars c2) {
        int nome = c1.getNome().compareToIgnoreCase(c2.getNome());
        if (nome != 0) return nome;

        int ano = Integer.compare(c1.getAno(), c2.getAno());
        if (ano !=0) return ano;

        return c1.getCor().compareToIgnoreCase(c2.getCor());
    }
}
