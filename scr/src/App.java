public class App {

    public static void main(String[] args) {
        DoubleLinkedListOfInteger dlist = new DoubleLinkedListOfInteger();
        DoubleLinkedListOfInteger dlist2 = new DoubleLinkedListOfInteger();

        Integer[] staticList = {70, 2, 30, 9, 20, 3, 50, 7, 60, 0, 80, 5, 10, 1, 100, 6, 90, 8, 40, 4};
        Integer[] staticList2 = {1, 0,10, 1, 20, 2, 30, 3};

        // Convertendo a lista estática para lista dinâmica
        dlist.staticToDynamic(staticList);
        dlist2.staticToDynamic(staticList2);

        System.out.println("Lista atual: " + dlist);
        System.out.println("Lista atual2: " + dlist2);

        dlist.mergeLists(dlist2);
        System.out.println("Lista atual: " + dlist);

    }

}
