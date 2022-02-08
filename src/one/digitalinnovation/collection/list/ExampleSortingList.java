package one.digitalinnovation.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExampleSortingList {

    public static void main(String[] args) {

        List<Cachorro> cachorros = new ArrayList<>(){{
            add(new Cachorro("Kiron", 9, "preto"));
            add(new Cachorro("Scooby", 6, "marrom"));
            add(new Cachorro("Mustaffa", 7, "amarelo"));
        }};
        System.out.println("--\tOrdem de inserção\t--");
        System.out.println(cachorros);

        System.out.println("--\tOrdem aleatória\t--");
        Collections.shuffle(cachorros);
        System.out.println(cachorros);

        System.out.println("--\tOrdem Natural (Nome)\t--");
        Collections.sort(cachorros);
        System.out.println(cachorros);

        System.out.println("--\tOrdem idade)\t--");
        cachorros.sort(new ComparatorIdade());
//        Collections.sort(cachorros, new ComparatorIdade());
        System.out.println(cachorros);

        System.out.println("--\tOrdem cor)\t--");
        Collections.sort(cachorros, new ComparatorCor());
//        cachorros.sort(new ComparatorCor());
        System.out.println(cachorros);

        System.out.println("--\tOrdem Nome/Cor/Idade\t--");
//        Collections.sort(cachorros, new ComparatorNomeCorIdade());
        cachorros.sort(new ComparatorNomeCorIdade());
        System.out.println(cachorros);
    }
}

    class Cachorro implements Comparable<Cachorro>{
    private String nome;
    private int idade;
    private String cor;

    public Cachorro(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

        @Override
        public String toString() {
            return "Cachorro{" +
                    "nome='" + nome + '\'' +
                    ", idade='" + idade + '\'' +
                    ", cor='" + cor + '\'' +
                    '}';
        }

        @Override
        public int compareTo(Cachorro cachorro) {
            return this.getNome().compareToIgnoreCase(cachorro.getNome());
        }
    }

    class ComparatorIdade implements Comparator<Cachorro> {

        @Override
        public int compare(Cachorro o1, Cachorro o2) {
            return Integer.compare(o1.getIdade(), o2.getIdade());
        }
    }

    class ComparatorCor implements Comparator<Cachorro> {

        @Override
        public int compare(Cachorro o1, Cachorro o2) {
            return o1.getCor().compareToIgnoreCase(o2.getCor());
        }
    }

    class ComparatorNomeCorIdade implements Comparator<Cachorro> {

        @Override
        public int compare(Cachorro o1, Cachorro o2) {
            int nome = o1.getNome().compareToIgnoreCase(o2.getNome());
            if (nome != 0) return nome;

            int cor = o1.getCor().compareToIgnoreCase(o2.getCor());
            if (cor != 0) return cor;

            return Integer.compare(o1.getIdade(), o2.getIdade());
        }
    }
