import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Integer[] ints = {1,23,4};

        DynamicArray<Integer> integers = new DynamicArray<>(ints);
        System.out.println(integers.toString());

        Integer[] integers1 = new Integer[integers.size()];
        integers.toArray(integers1);

        for (int i = 0; i < integers1.length; i++) {
            System.out.println(integers1[i]);
        }

        System.out.println("---------------------------------------------------------------");

        LinkedArray<Integer> linkedArray = new LinkedArray<>();
        linkedArray.add(1);
        linkedArray.add(2);
        linkedArray.add(3);
        System.out.println(linkedArray);
        linkedArray.addFirst(4);
        System.out.println(linkedArray);


    }
}