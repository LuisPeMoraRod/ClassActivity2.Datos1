package doubleLinkedList;

public class Persona implements Comparable<Persona> {
    public String id;

    public Persona(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return this.id;
    }

    @Override
    public int compareTo(Persona o) {
        if (o == null) {
            return -1;
        }
        return this.id.compareTo(o.toString());
    }
}
