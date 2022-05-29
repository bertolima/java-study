package map;

import javax.sound.midi.Soundbank;
import java.util.*;

public class test2 {
    public static void main(String[] args) {
        //Ordem aleatória
        System.out.println("---Ordem aleatória dos Livros---");
        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Rick Riodan", new Livro("Percy Jackson", 316));
            put("George Orwell", new Livro("A revolução dos bichos", 95));
            put("Jordan Peteron", new Livro("8 regras para a vida", 417));
        }};

        for (Map.Entry<String, Livro> livros: meusLivros.entrySet()){
            System.out.println(livros.getKey() + " - " + livros.getValue().getNome());
        }

        //Ordem de inserção
        System.out.println("---Ordem de inserção dos livros---");
        Map<String, Livro> meusLivros2 = new LinkedHashMap<>(){{
            put("Rick Riodan", new Livro("Percy Jackson", 316));
            put("George Orwell", new Livro("A revolução dos bichos", 95));
            put("Jordan Peteron", new Livro("8 regras para a vida", 417));
        }};

        for(Map.Entry<String, Livro> livros: meusLivros2.entrySet()){
            System.out.println(livros.getKey() + " - " + livros.getValue().getNome() + ", " + livros.getValue().getPaginas() + " páginas");
        }

        //Ordem alfabetica de autores
        System.out.println("---Ordem alfabetica autores---");
        Map<String, Livro> meusLivros3 = new TreeMap<>(meusLivros);
        for (Map.Entry<String, Livro> livros : meusLivros3.entrySet()){
            System.out.println(livros.getKey() + " - " + livros.getValue().getNome() + ", " + livros.getValue().getPaginas() + " paginas");
        }

        //Ordem alfabetica nome dos livros
        System.out.println("---Ordem alfabetica nome dos livros---");
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new comparaNome()){};
        meusLivros4.addAll(meusLivros.entrySet());
        for(Map.Entry<String, Livro> livros : meusLivros4){
            System.out.println(livros.getKey() + " - " + livros.getValue().getNome() + ", " + livros.getValue().getPaginas() + " paginas");
        }

        //Ordem número de painas
        System.out.println("---Ordem numeros de paginas---");
        Set<Map.Entry<String, Livro>> meusLivros5 = new TreeSet<>(new comparaPagina());
        meusLivros5.addAll(meusLivros.entrySet());
        for(Map.Entry<String, Livro> livros : meusLivros5){
            System.out.println(livros.getKey() + " - " + livros.getValue().getNome() + ", " + livros.getValue().getPaginas() + " paginas");
        }





    }
}


class Livro{
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas ;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class comparaNome implements Comparator<Map.Entry<String, Livro>>{
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareTo(l2.getValue().getNome());
    }
}

class comparaPagina implements Comparator<Map.Entry<String, Livro>>{
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2){
        return Integer.compare(l1.getValue().getPaginas(), l2.getValue().getPaginas());
    }
}
