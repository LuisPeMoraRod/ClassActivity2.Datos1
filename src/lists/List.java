package lists;

public class List<T extends Comparable<T>> {
    private Node<T> first = null;
    private Node<T> last = null;

    public void addFirst(T value) {
        Node<T> newElement = new Node<>(value,this.first);
        newElement.setPrevious(this.first);
        this.first = newElement;
        if (this.last == null) {
            this.last = this.first;
        }
    }

    public void addLast(T value) {
        if (this.first == null) {
            this.first = this.last = new Node<>(value);
            return;
        }
        Node<T> newElement = new Node<>(value);
        this.last.setNext(newElement);
        newElement.setPrevious(this.last);
        this.last = newElement;
    }

    /**
     * Looks for an item in the list
     * @param e element to find
     * @return zero-based index of the item or -1 if not found
     */
    public int find(T e) {
        Node<T> temp = this.first;
        int index = 0;
        while (temp != null) {
            if (temp.getValue().compareTo(e) == 0) {
                return index;
            }
            index++;
            temp = temp.getNext();
        }
        return -1;
    }

    @Override
    public String toString() {
        if (this.first == null) {
            return "List of: <empty>";
        }
        StringBuilder stringBuilder = new StringBuilder("List of: ");
        Node<T> temp = this.first;
        while (temp != null) {
            stringBuilder.append(temp.getValue().toString());
            stringBuilder.append(" ");
            temp = temp.getNext();
        }
        return stringBuilder.toString();
    }

    public Node<T> getLast(){
        return this.last;
    }
}
