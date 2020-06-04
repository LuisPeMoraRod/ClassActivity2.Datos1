package doubleLinkedList;

public class BubbleSort<T extends Comparable <T>> {

    private DoubleLinkedList<T> doubleLinkedList;
    private int listSize;

    public BubbleSort(DoubleLinkedList<T> doubleLinkedList){

        this.doubleLinkedList = doubleLinkedList;
        this.listSize = doubleLinkedList.getSize();

    }

    public void sort(){

        int end;
        T element1;
        T element2;

        for (end = listSize-1; end >= 1; end--){

            for (int index = 0; index < end; index ++){

                element1 = doubleLinkedList.getValue(index);
                element2 = doubleLinkedList.getValue(index+1);

                if(element1.compareTo(element2)>0){
                    doubleLinkedList.modifyValue(element1,index+1);
                    doubleLinkedList.modifyValue(element2,index);
                }

            }
        }

    }

    public DoubleLinkedList<T> getSortedList(){
        return doubleLinkedList;
    }

}
