import java.util.Arrays;
import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("Original List : " + list);
        list.addFirst(0);
        list.addLast(4);
        System.out.println("List after adding element at frist and last : " + list);
        list.set(4,5);
        System.out.println("List after updating element at index 4 : " + list);
        list.remove(1);
        list.remove(Integer.valueOf(0));
        System.out.println("List after removing elements at index 0 and 1 : " + list);
        for(int n : list){
            System.out.println(n);
        }

        LinkedList<String> fruits = new LinkedList<>(Arrays.asList("apple","banana","date","mango"));
        LinkedList<String> fruitsToRemove = new LinkedList<>(Arrays.asList("banana","date"));
        fruits.removeAll(fruitsToRemove);
        System.out.println(fruits);
    }
}
