package lists;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new List<Integer>();
        lista.addFirst(666);
        lista.addFirst(777);
        lista.addLast(555);

        List<String> listaStr = new List<>();
        listaStr.addFirst("a");
        listaStr.addFirst("b");
        listaStr.addFirst("c");
        listaStr.addLast("z");

        System.out.println(lista);
        System.out.println(listaStr);

        System.out.println(lista.find(6466));

        List<Persona> listP = new List<>();
        listP.addFirst(new Persona("Isaac"));
        listP.addFirst(new Persona("Juan"));
        listP.addFirst(new Persona("Pedro"));

        System.out.println(listP.find(new Persona("Juan")));

        System.out.println(lista.getLast().getNext());
        System.out.println(lista.getLast().getPrevious());
    }
}
