package doubleLinkedList;

public class SelectionSort<T extends Comparable <T>> {

    private DoubleLinkedList<T> doubleLinkedList;
    private int listSize;

    public SelectionSort(DoubleLinkedList<T> doubleLinkedList){

        this.doubleLinkedList = doubleLinkedList;
        this.listSize = doubleLinkedList.getSize();

    }

    public int getMinIndex(int start){

        int indexOfMin = start;

        for (int index = start+1; index <= listSize-1; index++){
            if (doubleLinkedList.getValue(index).compareTo(doubleLinkedList.getValue(indexOfMin))<0){
                indexOfMin = index;
            }
        }

        return indexOfMin;
    }

    public void sort(){

        T minElement;
        T element;
        int minIndex;

        for (int currentIndex = 0; currentIndex <= listSize-1; currentIndex++){

            minIndex = getMinIndex(currentIndex);
            minElement = doubleLinkedList.getValue(minIndex);
            element = doubleLinkedList.getValue(currentIndex);

            doubleLinkedList.modifyValue(minElement,currentIndex);
            doubleLinkedList.modifyValue(element,minIndex);

        }
    }

    public DoubleLinkedList<T> getSortedList(){
        return this.doubleLinkedList;
    }

}
