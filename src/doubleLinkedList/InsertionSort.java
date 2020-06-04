package doubleLinkedList;

public class InsertionSort <T extends Comparable <T>>  {

    private DoubleLinkedList<T> doubleLinkedList;
    private int listSize;

    public InsertionSort(DoubleLinkedList<T> doubleLinkedList){
        this.doubleLinkedList = doubleLinkedList;
        this.listSize = doubleLinkedList.getSize();
    }

    public void sort(){
        int index;
        int indexOut;
        T currentOut;

        for (indexOut = 1; indexOut < listSize; indexOut++){
            currentOut = doubleLinkedList.getValue(indexOut);
            index = indexOut;

            while(index > 0 && doubleLinkedList.getValue(index-1).compareTo(currentOut) >=0){
                doubleLinkedList.modifyValue(doubleLinkedList.getValue(index-1),index);
                --index;

            }
            doubleLinkedList.modifyValue(currentOut,index);

        }
    }

    public DoubleLinkedList<T> getSortedList(){
        return doubleLinkedList;
    }
}
