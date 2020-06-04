package doubleLinkedList;

public class InsertionSort <T extends Comparable <T>>  {

    private List<T> list;
    private int listSize;

    public InsertionSort(List<T> list){
        this.list = list;
        this.listSize = list.getSize();
    }

    public void sort(){
        int index;
        int indexOut;
        T currentOut;

        for (indexOut = 1; indexOut < listSize; indexOut++){
            currentOut = list.getValue(indexOut);
            index = indexOut;

            while(index > 0 && list.getValue(index-1).compareTo(currentOut) >=0){
                list.modifyValue(list.getValue(index-1),index);
                --index;

            }
            list.modifyValue(currentOut,index);

        }
    }

    public List<T> getSortedList(){
        return list;
    }
}
