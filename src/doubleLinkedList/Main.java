package doubleLinkedList;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new List<Integer>();
        lista.addFirst(666);
        lista.addFirst(777);
        lista.addFirst(999);
        lista.addLast(555);
        lista.addLast(111);


        List<String> listaStr = new List<>();
        listaStr.addFirst("a");
        listaStr.addFirst("b");
        listaStr.addFirst("c");
        listaStr.addLast("z");

        System.out.println(lista);
        System.out.println(listaStr);

        System.out.println(lista.find(6466));

        List<Persona> listP = new List<>();
        listP.addFirst(new Persona("Monica"));
        listP.addFirst(new Persona("Zendaya"));
        listP.addFirst(new Persona("Pedro"));

        System.out.println(listP.find(new Persona("Juan")));

        System.out.println(lista.getLast().getNext());
        System.out.println(lista.getLast().getPrevious());

        lista.deleteElement(111);
        System.out.println(lista.getSize());
        System.out.println(lista);

        lista.insertElement(222,2);
        System.out.println(lista);

        System.out.println(lista.getValue(3));

        lista.modifyValue(333,3);
        System.out.println(lista);


        System.out.println(listP);
        BubbleSort<String> bubbleSort = new BubbleSort(listP);
        bubbleSort.sort();
        System.out.println(bubbleSort.getSortedList());





    }
}
