import java.sql.SQLOutput;

public class App {

    public static void main(String[] args) {
        DoubleLinkedListOfInteger dlist = new DoubleLinkedListOfInteger();
        DoubleLinkedListOfInteger dlist2 = new DoubleLinkedListOfInteger();

        Integer[] staticList = {70, 2, 30, 9, 20, 3, 50, 7, 60, 0, 80, 5, 10, 1, 100, 6, 90, 8, 40, 4};
        Integer[] staticList2 = {1, 0, 10, 1, 20, 2, 30, 3};

        System.out.println("===============================");
        System.out.println("Criação do array: ");
        for (int i = 0; i < staticList.length; i++) {
            System.out.print(staticList[i] + " | ");
        }
        System.out.println("\n===============================");

        System.out.println("Criação do array 2: ");
        for (int i = 0; i < staticList2.length; i++) {
            System.out.print(staticList2[i] + " | ");
        }
        System.out.println("\n===============================");

        // Convertendo a lista estática para lista dinâmica
        dlist.staticToDynamic(staticList);
        dlist2.staticToDynamic(staticList2);

        System.out.println("TRANSFORMANDO EM DOUBLE LINKED LIST: ");
        System.out.println("Lista 1: " + dlist);
        System.out.println("Lista 2 (criada para dar merge): " + dlist2);

        dlist.mergeLists(dlist2);
        System.out.println("===============================");
        System.out.println("Impletmentação do método 3: ");
        System.out.println("MERGELIST: " + dlist);
        System.out.println("===============================");

        System.out.println("Impletmentação do método 5: ");
        dlist.removeRange(2, 5);
        System.out.println("REMOVERANGE: " + dlist);
        System.out.println("===============================");


        System.out.println("Impletmentação do método 7: ");
        dlist.removeLowerThan(50);
        System.out.println("REMOVELOWERTHAN: " + dlist);
        System.out.println("===============================");


        System.out.println("Criação do vetor, pilha e fila...");
        Integer[] list = new Integer[8];
        list[0] = 20;
        list[1] = 30;
        list[2] = 50;
        list[3] = 80;
        list[4] = 30;
        list[5] = 10;
        list[6] = 90;
        list[7] = 20;

        StackOfInteger s = new StackOfInteger();
        QueueOfInteger q = new QueueOfInteger();

        for (int i = 0; i < list.length; i++) {
            if (i >= 4) {
                q.enqueue(list[i]);
            } else {
                s.push(list[i]);
            }
        }

        System.out.println("===============================");
        System.out.println("ESTADO INICIAL:");
        print(s, q);

        s.push(s.top() - q.dequeue());
        System.out.println("===============================");
        System.out.println("Após s.push(s.top() - q.dequeue());");
        print(s, q);

        q.enqueue(q.dequeue() + s.pop());
        System.out.println("===============================");
        System.out.println("Após q.enqueue(q.dequeue() + s.pop());");
        print(s, q);

        q.enqueue(q.head() - s.top());
        System.out.println("===============================");
        System.out.println("Após q.enqueue(q.head() - s.top());");
        print(s, q);

        s.push(q.dequeue() - s.top());
        System.out.println("===============================");
        System.out.println("Após s.push(q.dequeue() - s.top());");
        print(s, q);
    }


    public static void print(StackOfInteger s, QueueOfInteger q) {
        System.out.println("Pilha (base <- topo): " + s);
        System.out.println("Fila (frente -> fim): " + q);
    }

}
