package collections.framework.hash;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class RainbowExercise {
    public static void main(String[] args) {
        Set<rainbow> cores = new HashSet<>(){{
            add(new rainbow("vermelho"));
            add(new rainbow("verde"));
            add(new rainbow("azul"));
            add(new rainbow("laranja"));
            add(new rainbow("rosa"));
            add(new rainbow("lilás"));
        }};
        System.out.println("Cores em ordem aleatória: ");
        for (rainbow cor:cores) System.out.print(cor.getCores() + " ");
        System.out.println(" ");

        int c = 0;
        for (rainbow cor: cores) c += 1;

        System.out.println("O arco-iris tem " + c + " cores");

        Set<rainbow> cores1 = new TreeSet<>(cores);
        System.out.println("Cores em ordem alfabetica: ");
        for (rainbow cor: cores1)
        System.out.print(cor.getCores() + " ");

        System.out.println("Cores na ordem inversa");
        Set<rainbow> cores2 = new LinkedHashSet<>(){{
            add(new rainbow("vermelho"));
            add(new rainbow("verde"));
            add(new rainbow("azul"));
            add(new rainbow("laranja"));
            add(new rainbow("rosa"));
            add(new rainbow("lilás"));
        }};
        System.out.println("Cores na ordem inversa da informada: ");
        List<rainbow> cores3 = new ArrayList<>(cores2);
        Collections.reverse(cores3);
        for (rainbow cor: cores3) System.out.print(cor.getCores() + " ");
        System.out.println(" ");

        System.out.println("Cores que começam com a letra v: ");
        for (rainbow cor : cores3) {
            if (cor.getCores().startsWith("v")) System.out.println(cor.getCores());
        }
        System.out.println("--- REMOVENDO ELEMENTOS QUE COMEÇAM COM V");
        Iterator<rainbow> remover = cores3.iterator();
        while (remover.hasNext()){
            if(remover.next().toString().startsWith("v")) {
                remover.remove();
            }
        }
        for (rainbow cor:cores3) System.out.println(cor.getCores());

        cores3.clear();
        System.out.println(cores3);

        System.out.println(cores3.isEmpty());


    }
}




class rainbow implements Comparable<rainbow>{
    private String cores;

    public rainbow(String cores) {
        this.cores = cores;
    }

    public String getCores() {
        return cores;
    }

    public void setCores(String cores) {
        this.cores = cores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        rainbow rainbow = (rainbow) o;
        return cores.equals(rainbow.cores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cores);
    }

    @Override
    public int compareTo(rainbow cores) {
        return this.getCores().compareTo(cores.getCores());
    }

    @Override
    public String toString() {
        return ""+cores+"";
    }
}

class comparar implements Comparator<rainbow>{

    @Override
    public int compare(rainbow c1, rainbow c2) {
        return 0;
    }
}