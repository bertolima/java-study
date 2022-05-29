package collections.framework.hash;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class OrderTest {
    public static void main(String[] args) {

        System.out.println("---Ordem Aleatoria---");
    //ordem aleatorio das series (tem que usar hashset)
    Set<serie> myserie = new HashSet<>(){{
        add(new serie("got", "fantasia", 60));
        add(new serie("himym", "comedia", 25));
        add(new serie("dark", "suspense", 60));
    }};
    for (serie series: myserie) System.out.println(series.getNome() + " " + series.getGenero() + " " + series.getTempo());

        System.out.println("---Ordem Inserção---");
    //ordem de inserção (tem que usar linkedhashset)
    Set<serie> myserie2 = new LinkedHashSet<>(){{
        add(new serie("got", "fantasia", 60));
        add(new serie("himym", "comedia", 25));
        add(new serie("dark", "suspense", 60));
    }};
    for (serie series: myserie2) System.out.println(series.getNome() + " " + series.getGenero() + " " + series.getTempo());

        System.out.println("---Ordem Natural (tempo-genero-nome) com Comparable na classe serie---");
    //ordem natural(crescente (tempo-genero-nome) tem que usar o treeset)
    Set<serie> myserie3 = new TreeSet<>(myserie2); //não posso usar myserie2 como argumento pois ele não foi iniciado com Double, portanto não tem o comparable
    for (serie series: myserie3) System.out.println(series.getNome() + " " + series.getGenero() + " " + series.getTempo());

        System.out.println("---Ordem Natural (nome-genero-tempo) criando classe comparator para usar como argumento na treeset---");
    //ordem natural novamente, mas dessa vez usando uma classe somente para o comparator
    Set<serie> myserie4 = new TreeSet<>(new ComparaçãoTotal());
    myserie4.addAll(myserie); //preciso adicionar os valores ao treeset, pois ao iniciar eu apenas dei o comando da comparação
    for (serie series : myserie4) System.out.println(series.getNome() + " " + series.getGenero() + " " + series.getTempo());




 }
}







class serie implements Comparable<serie>{
    private String nome;
    private String genero;
    private Integer tempo;

    //construtor
    public serie(String nome, String genero, Integer tempo) {
        this.nome = nome;
        this.genero = genero;
        this.tempo = tempo;
    }
    //getter
    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempo() {
        return tempo;
    }

    //toString
    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempo=" + tempo +
                '}';
    }


    //equals e hashcode (extremente importantes ao usar implementaçõe "HASH"
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        serie serie = (serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempo.equals(serie.tempo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempo);
    }

    //comparable para usar o myserie2 como argumento para o treeset
    public int compareTo(serie series) {
        int tempoEp = Integer.compare(this.getTempo(),series.getTempo());
        if(tempoEp != 0) return tempoEp;
        int genero = this.getGenero().compareTo(series.getGenero());
        if(genero != 0) return genero;
        return this.getNome().compareTo(series.getNome());
        /*
        Basicamente, o primeiro criterio é o tempo, se tiverem 2 tempos iguais, ele vai comparar por genero, se tiverem
        dois generos iguais, ele vai comparar pelo nome, de forma que tempo>genero>nome
         */

    }
}

//criado classe apenas para comparação, implementando comparator na classe serie
class ComparaçãoTotal implements Comparator<serie>{
    //implementação do metodo compare
    public int compare(serie s1, serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if(nome != 0) return nome;
        int genero = s1.getGenero().compareTo(s2.getGenero());
        if(genero != 0) return genero;
        return Integer.compare(s1.getTempo(), s2.getTempo());
    }
}