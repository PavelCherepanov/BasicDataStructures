public class DynamicArray<E> implements Array<E> {
    private E array[];
    private int count;

    public DynamicArray(int length) {
        array = (E[]) new Object[length];
    }
    //метод toArray
//конструктор
//
    public DynamicArray(E[] array){
        this.array = array.clone();
    }

//    public E[] toArray(){
//        return ;
//    }

    public void printArray() {
        for (int i = 0; i < count; i++) {
            System.out.print(array[i] + " ");
        }
    }

    @Override
    public void add(E element) {
        if (array.length == count) {
            E newArray[] = (E[]) new Object[count * 2];
            for (int i = 0; i < count; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[count++] = element;
    }

    @Override
    public E get(int index) {
        E element = null;
//        if(index >= count | index < 0){
//            throw new ArrayIndexOutOfBoundsException("Error. Bad get");
//        }
        element = array[index];
        return element;
    }

    @Override
    public void remove(int index) {
        if (count == 0 || index > count) {
            throw new ArrayIndexOutOfBoundsException("Error. Remove outside the array");
        }

        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

        count--;
    }

    @Override
    public int indexOf(E element) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                index = i;
                break;
            } else {
                throw new ArrayIndexOutOfBoundsException("Error. Index out");
            }
        }
        return index;
    }

    public int size(){
        return count;
    }


}