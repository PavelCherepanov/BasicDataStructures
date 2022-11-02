import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayList
        DynamicArray<String> dynamicArray = new DynamicArray<>(2);
        Integer[] ints = {1,12,4};
        DynamicArray<Integer> dynamicArray1 = new DynamicArray<>(ints);
        System.out.println(dynamicArray1.get(1));

        dynamicArray.add("4");
        dynamicArray.add("2");
        dynamicArray.add("3");
        dynamicArray.add("6");
        dynamicArray.remove(2);
        System.out.println(dynamicArray.get(2));
        System.out.println(dynamicArray.size());
        dynamicArray.remove(1);
//        System.out.println(dynamicArray.get(9000));
//        System.out.println(dynamicArray.indexOf("8"));
        dynamicArray.printArray();

        Integer[] numbers = {1,12,4};
        System.out.println(numbers);
        System.out.println(numbers.clone());


    }
}