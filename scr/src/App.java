public class App {

    public static void main(String[] args) {
        DoubleLinkedListOfInteger dlist = new DoubleLinkedListOfInteger();

        Integer [] staticList = new Integer [20];
        staticList[0] = 70;
        staticList[1] = 2;
        staticList[2] = 30;
        staticList[3] = 9;
        staticList[4] = 20;
        staticList[5] = 3;
        staticList[6] = 50;
        staticList[7] = 7;
        staticList[8] = 60;
        staticList[9] = 0;
        staticList[10] = 80;
        staticList[11] = 5;
        staticList[12] = 10;
        staticList[13] = 1;
        staticList[14] = 100;
        staticList[15] = 6;
        staticList[16] = 90;
        staticList[17] = 8;
        staticList[18] = 40;
        staticList[19] = 4;

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
