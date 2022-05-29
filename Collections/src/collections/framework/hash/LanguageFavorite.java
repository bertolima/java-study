package collections.framework.hash;


import com.sun.source.tree.Tree;
import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LanguageFavorite {
    public static void main(String[] args) {
        Set<linguas> minhasLinguas = new LinkedHashSet<>(){{
            add(new linguas("Java", 1988, "IdelliJ"));
            add(new linguas("Python", 1992, "VSC"));
            add(new linguas("JavaScript", 1995, "Eclipse"));
        }};

        System.out.println("---Ordem de Inserção---");
        for (linguas lingua: minhasLinguas) System.out.println(lingua.getNome() + ", " + lingua.getAno() + ", " + lingua.getIde());


        System.out.println("---Ordem natural(nome)---");
        Set<linguas> minhasLinguas2 = new TreeSet<>(minhasLinguas);
        for (linguas lingua:minhasLinguas2) System.out.println(lingua.getNome() + ", " + lingua.getAno() + ", " + lingua.getIde());

        System.out.println("---Ordem natural(Ano)---");
        Set<linguas> minhasLinguas3 = new TreeSet<>(new comparaAno());
        minhasLinguas3.addAll(minhasLinguas);
        for (linguas lingua: minhasLinguas3) System.out.println(lingua.getNome() + ", " + lingua.getAno() + ", " + lingua.getIde());

        System.out.println("---Ordem natural(Ide)---");
        Set<linguas> minhasLinguas4 = new TreeSet<>(new comparaIde());
        minhasLinguas4.addAll(minhasLinguas);
        for (linguas lingua:minhasLinguas4) System.out.println(lingua.getNome() + ", " + lingua.getAno() + ", " + lingua.getIde());

        System.out.println("---Ordem Total");
        Set<linguas> minhasLinguas5 = new TreeSet<>(new comparaTotal());
        minhasLinguas5.addAll(minhasLinguas);
        for (linguas lingua:minhasLinguas5) System.out.println(lingua.getNome() + ", " + lingua.getAno() + ", " + lingua.getIde());




        
    }


}

class linguas implements Comparable<linguas>{
    private String nome;
    private Integer ano;
    private String Ide;

    public linguas(String nome, Integer ano, String ide) {
        this.nome = nome;
        this.ano = ano;
        Ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getIde() {
        return Ide;
    }

    public void setIde(String ide) {
        Ide = ide;
    }

    @Override
    public String toString() {
        return "linguas {" +
                "nome = " + nome + "" +
                ", ano = " + ano +
                ", Ide = " + Ide + "" +
                '}';
    }

    @Override
    public int compareTo(linguas lingua) {
        return this.getNome().compareTo(lingua.getNome());
    }
}

class comparaAno implements Comparator<linguas>{
    public int compare(linguas l1, linguas l2) {
        return Integer.compare(l1.getAno(), l2.getAno());
    }
}
class comparaIde implements Comparator<linguas>{
    public int compare(linguas l1, linguas l2){
        return l1.getIde().compareTo(l2.getIde());
    }
}

class comparaTotal implements Comparator<linguas>{
   public int compare(linguas l1, linguas l2){
       int nome = l1.getNome().compareTo(l2.getNome());
       if (nome != 0) return nome;
       int ano = Integer.compare(l1.getAno(), l2.getAno());
       if (ano != 0) return ano;
       return l1.getIde().compareTo(l2.getIde());
   }
}