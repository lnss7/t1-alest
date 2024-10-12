public class App {

    public static void main(String[] args) {
        DoubleLinkedListOfInteger dlist = new DoubleLinkedListOfInteger();

        Integer[] staticList = {70, 2, 30, 9, 20, 3, 50, 7, 60, 0, 80, 5, 10, 1, 100, 6, 90, 8, 40, 4};


        // Convertendo a lista estática para lista dinâmica
        dlist.staticToDynamic(staticList);

        dlist.add(10);
        dlist.add(20);
        dlist.add(30);
        dlist.add(40);
        dlist.add(50);
        dlist.add(60);
        dlist.add(70);
        dlist.add(80);



        System.out.println("Lista atual: " + dlist);
        System.out.println("Tamanho da lista: " + dlist.size());

        System.out.println("Busca valor na posição 2: " + dlist.get(2));
        System.out.println("Busca valor na posição 6: " + dlist.get(6));

        System.out.println("Trocou " + dlist.set(2, 35) + " por 35 na posicao 2.");

        System.out.println("Removeu 50? " + dlist.remove(50));
        System.out.println("Removeu 57? " + dlist.remove(57));

        System.out.println("Lista atual: " + dlist);

        dlist.add(0, 0);
        dlist.add(dlist.size(), 90);
        dlist.add(4, 44);
        System.out.println("Lista atual: " + dlist);

        System.out.println("List de trás para frente: " + dlist.toStringBackToFront());

    }

}
