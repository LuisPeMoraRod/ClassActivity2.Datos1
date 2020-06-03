package lists;

public class Node<T extends Comparable<T>> {
    private T value;
    private Node<T> next;

    public Node(T value) {
        this.value = value;
        this.next = null;
    }

    public Node(T value, Node<T> next) {
        this.value = value;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node: " + value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
