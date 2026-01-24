import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ashish");
        list.add("Rasal");
        System.out.println("Original list : " + list);
        list.add(1, "Sanket");
        System.out.println("List after adding element at 1st index : " + list);
        list.remove(0);
        System.out.println("List after removing element at 0th position : " + list);
        list.remove("Sanket");
        System.out.println("List after deletion of an element : " + list);
        list.set(0,"Ashish");
        System.out.println("Final list : " + list);
    }
}
