import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List2 {
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        System.out.println(list.getClass().getName());

        List<String> list1 = Arrays.asList("Monday", "Tuesday");
        System.out.println(list1.getClass().getName());
        list1.set(1,"Wednesday");
        System.out.println(list1.get(1));

        String[] arr = {"Apple", "Banana"};
        List<String> list2 = Arrays.asList(arr);
        System.out.println(list2.getClass().getName());
        System.out.println(list2);

        List<Integer> list3 = List.of(1,4,7,8);
        System.out.println(list3);

        ArrayList<String> list4 = new ArrayList<>(list2);
        list4.add("Strawberry");
        System.out.println(list4);
    }
}
