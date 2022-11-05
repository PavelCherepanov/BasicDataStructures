import java.util.Arrays;

public class DynamicArray<E> implements Array<E> {
    private E array[];
    private int count;

    public DynamicArray(int length) {
        array = (E[]) new Object[length];
    }

    public DynamicArray(E[] array) {
        this.array = array;
        count = array.length;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < count; i++) {
            str.append(array[i].toString() + " ");
        }
        return str.toString();
    }

    public E[] toArray(E[] array) {
        if (array.length < 0 | array.length > count) {
            throw new ArrayIndexOutOfBoundsException("Error. toArray outside the array");
        }
        System.arraycopy(this.array, 0, array, 0, count);
        return array;
    }

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
        if (index >= count | index < 0) {
            throw new ArrayIndexOutOfBoundsException("Error. Get outside the array");
        }
        element = array[index];
        return element;
    }

    @Override
    public void remove(int index) {
        if (count == 0 | index >= count) {
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
                return -1;
            }
        }
        return index;
    }

    public int size() {
        return count;
    }
}