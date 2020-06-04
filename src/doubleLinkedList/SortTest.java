package doubleLinkedList;

import static org.junit.Assert.assertTrue;


import org.junit.Before;
import org.junit.Test;

public class SortTest {

    DoubleLinkedList<Integer> intDoubleLinkedList = new DoubleLinkedList<>();
    DoubleLinkedList<String> strDoubleLinkedList = new DoubleLinkedList<>();
    DoubleLinkedList<Persona> personaDoubleLinkedList = new DoubleLinkedList<>();

    DoubleLinkedList<Integer> intDoubleLinkedListExpected = new DoubleLinkedList<>();
    DoubleLinkedList<String> strDoubleLinkedListExpected = new DoubleLinkedList<>();
    DoubleLinkedList<Persona> personaDoubleLinkedListExpected = new DoubleLinkedList<>();



    @Before
    public void createList(){

        intDoubleLinkedList.addFirst(5);
        intDoubleLinkedList.addFirst(3);
        intDoubleLinkedList.addFirst(1);
        intDoubleLinkedList.addFirst(4);
        intDoubleLinkedList.addFirst(7);
        intDoubleLinkedList.addFirst(2);
        intDoubleLinkedList.addFirst(6);

        strDoubleLinkedList.addFirst("Francia");
        strDoubleLinkedList.addFirst("Canada");
        strDoubleLinkedList.addFirst("Islandia");
        strDoubleLinkedList.addFirst("Rusia");
        strDoubleLinkedList.addFirst("Brasil");

        personaDoubleLinkedList.addFirst(new Persona("Monica"));
        personaDoubleLinkedList.addFirst(new Persona("Antonio"));
        personaDoubleLinkedList.addFirst(new Persona("Luis"));
        personaDoubleLinkedList.addFirst(new Persona("Camila"));

        intDoubleLinkedListExpected.addFirst(7);
        intDoubleLinkedListExpected.addFirst(6);
        intDoubleLinkedListExpected.addFirst(5);
        intDoubleLinkedListExpected.addFirst(4);
        intDoubleLinkedListExpected.addFirst(3);
        intDoubleLinkedListExpected.addFirst(2);
        intDoubleLinkedListExpected.addFirst(1);

        personaDoubleLinkedListExpected.addFirst(new Persona("Monica"));
        personaDoubleLinkedListExpected.addFirst(new Persona("Luis"));
        personaDoubleLinkedListExpected.addFirst(new Persona("Camila"));
        personaDoubleLinkedListExpected.addFirst(new Persona("Antonio"));

        strDoubleLinkedListExpected.addFirst("Rusia");
        strDoubleLinkedListExpected.addFirst("Islandia");
        strDoubleLinkedListExpected.addFirst("Francia");
        strDoubleLinkedListExpected.addFirst("Canada");
        strDoubleLinkedListExpected.addFirst("Brasil");


    }

    @Test
    public void TestBubbleSort() {

        System.out.println("Lista de enteros desordenada: "+ intDoubleLinkedList);
        System.out.println("Lista esperada: "+ intDoubleLinkedListExpected);

        BubbleSort<Integer> bubbleSort = new BubbleSort<>(intDoubleLinkedList);
        bubbleSort.sort();

        System.out.println("Lista obtenida: "+ bubbleSort.getSortedList());

        boolean compareIntLists = bubbleSort.getSortedList().comparesLists(intDoubleLinkedListExpected.getFirst());
        System.out.println(compareIntLists);
        assertTrue(compareIntLists);

    }

    @Test
    public void TestSelectionSort(){

        System.out.println("Lista de enteros desordenada: "+ personaDoubleLinkedList);
        System.out.println("Lista esperada: "+ personaDoubleLinkedListExpected);

        SelectionSort<Persona> selectionSort = new SelectionSort<>(personaDoubleLinkedList);
        selectionSort.sort();

        System.out.println("Lista obtenida: "+ selectionSort.getSortedList());

        boolean comparePersonLists = selectionSort.getSortedList().comparesLists(personaDoubleLinkedListExpected.getFirst());
        System.out.println(comparePersonLists);
        assertTrue(comparePersonLists);
    }

    @Test
    public void TestInsertionSort(){

        System.out.println("Lista de enteros desordenada: "+ strDoubleLinkedList);
        System.out.println("Lista esperada: "+ strDoubleLinkedListExpected);

        InsertionSort<String> insertionSort = new InsertionSort<>(strDoubleLinkedList);
        insertionSort.sort();

        System.out.println("Lista obtenida: "+ insertionSort.getSortedList());

        boolean compareStrLists = insertionSort.getSortedList().comparesLists(strDoubleLinkedListExpected.getFirst());
        System.out.println(compareStrLists);
        assertTrue(compareStrLists);
    }


}
