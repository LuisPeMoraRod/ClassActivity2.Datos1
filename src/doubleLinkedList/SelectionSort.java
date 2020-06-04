package doubleLinkedList;

public class SelectionSort<T extends Comparable <T>> {

    private List<T> list;
    private int listSize;

    public SelectionSort(List<T> list){

        this.list = list;
        this.listSize = list.getSize();

    }

    public int getMinIndex(int start){

        int indexOfMin = start;

        for (int index = start+1; index <= listSize-1; index++){
            if (list.getValue(index).compareTo(list.getValue(indexOfMin))<0){
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
            minElement = list.getValue(minIndex);
            element = list.getValue(currentIndex);

            list.modifyValue(minElement,currentIndex);
            list.modifyValue(element,minIndex);

        }
    }

    public List<T> getSortedList(){
        return this.list;
    }

}
