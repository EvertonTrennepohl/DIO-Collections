package one.digitalinnovation.collection.list;

import java.util.*;

public class ExampleList {

    public static void main(String[] args) {

//        Formas de criar List:
//        List<Double> notas = new ArrayList<>()(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
//        List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); Lista imutável, não permite adicionar e remover elementos
//        List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); Lista imutável, não permite adicionar e remover elementos

        System.out.println("Crie uma lista e adicione as sete notas: ");
        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0:");
        System.out.println("Posição: " + notas.indexOf(5.0));
        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8.0);
        System.out.println(notas.toString());
        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println(notas.toString());
        System.out.println("Confira se a nota 5 está na lista: " + notas.contains(5.0));
        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        for (Double nota : notas) System.out.println(nota);
        System.out.println("Exiba a terceira nota adicionada: ");
        System.out.println(notas.get(2));
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));
        System.out.println("Remova a nota 0: ");
        notas.remove(0.0);
        System.out.println(notas.toString());
        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("Soma: " + soma);
        System.out.println("Exiba a media das notas: " + (soma / notas.size()));
        System.out.println("Remova a nota na posição 0: ");
        notas.remove(0);
        System.out.println(notas.toString());
        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            if(iterator1.next() < 7) {
                iterator1.remove();
            }
        }
        System.out.println(notas.toString());
        System.out.println("Apague toda a lista: ");
//        notas.clear();
        System.out.println("A lista está vazia? " + notas.isEmpty());

        /*
            Utilizando métodos da implementação LinkedList
         */
        System.out.println("Crie uma lista chamada notas2 e coloque todos "
                + "os elementos da List ArrayList nessa nova lista ");
        LinkedList<Double> notas2 = new LinkedList<>();
        for (Double nota : notas) {
            notas2.add(nota);
        }
        System.out.println(notas2);

        System.out.println("Mostre a primeira nota da nova lista sem removê-la: ");
        System.out.println(notas2.peek());
        System.out.println(notas2);

        System.out.println("Mostre a primeira nota da lista removendo-a:");
        System.out.println(notas2.poll());
        System.out.println(notas2);
    }
}
