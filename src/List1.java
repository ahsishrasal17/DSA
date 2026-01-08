import java.util.ArrayList;
import java.util.List;

public class List1 {
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        list.add("Ashish");
        list.add("Pratik");
        list.add("Akshay");
        list.add(3, "Darshan");
        list.add("Akash");
        System.out.println("Original List : " + list);
        System.out.println();

        list.set(4, "Ashish");
        System.out.println("List after setting 4th element : " + list);
        System.out.println();

        System.out.println(list.indexOf("Ashish"));
        System.out.println(list.lastIndexOf("Ashish"));
        System.out.println();

        list.remove("Ashish");
        list.remove(3);
        System.out.println(list);
        System.out.println();

        System.out.println(list.get(0));
        System.out.println(list.get(2));
        System.out.println();

        System.out.println("Is element present? : " + list.contains("Ashish"));
        System.out.println("Is element present? : " + list.contains("Pratik"));
        System.out.println();

        for(String n : list){
            System.out.println(n + " ");
        }
    }
}
