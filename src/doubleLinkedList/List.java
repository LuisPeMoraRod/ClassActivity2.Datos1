package doubleLinkedList;

public class List<T extends Comparable<T>> {
    private Node<T> first = null;
    private Node<T> last = null;
    private int size = 0;

    public void addFirst(T value) {
        Node<T> newElement = new Node<>(value,this.first,null);
        newElement.setPrevious(this.first);
        this.first = newElement;
        if (this.last == null) {
            this.last = this.first;
        }
        size++;
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
        size++;
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

    public int getSize(){
        return this.size;
    }

    public Node<T> deleteElement(T e){

        Node<T> current = this.first;
        Node<T> previous = this.first;

        while(current != null){

            if(current.getValue().compareTo(e) == 0){
                if (current == this.first){
                    this.first = this.first.getNext();
                    this.first.setPrevious(null);
                }

                else if(current.getNext()==null){
                    current.getPrevious().setNext(null);
                }
                else{
                    previous.setNext(current.getNext());
                    previous.getNext().setPrevious(previous);
                }
                size--;
                return current;
            }

            else{
                previous = current;
                current = current.getNext();
            }


        }
        return null;
    }

    public Node<T> deleteFirst(){
        if(this.first!=null){
            Node<T> temp = this.first;
            this.first = this.first.getNext();
            this.first.setPrevious(null);
            size--;
            return temp;

        }
        else{
            return null;
        }
    }

    public Node<T> deleteLast(){
        if(this.last != null){
            Node<T> temp = this.last;
            this.last = this.last.getPrevious();
            this.last.setNext(null);
            size--;
            return temp;
        }
        else{
            return null;
        }
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
