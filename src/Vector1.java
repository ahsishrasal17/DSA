import java.util.Vector;

public class Vector1 {
    public static void main(String[] args)
    {
        Vector<Integer> vector = new Vector<>(2);
        System.out.println("Initial Capacity : " + vector.capacity());
        vector.add(1);
        vector.add(2);
        System.out.println("Capacity afetr adding 2 elements " + vector.capacity());
        vector.add(3);
        System.out.println("Capacity after adding third element " + vector.capacity());
        vector.add(2);
        vector.add(3);
        System.out.println("Capacity after adding five elements " + vector.capacity());

        Vector vector1 = new Vector();
        vector1.add(1);
        vector1.add(2);
        vector1.add("Ashish");
        vector1.add(3);
        System.out.println(vector1);
    }
}
