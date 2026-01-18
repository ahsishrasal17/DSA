import java.util.Arrays;
import java.util.List;

public class Comparator1
{
    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("Pratik", "Darshan", "Ashish", "Akash");
        list.sort((a, b) -> b.length() - a.length());
        System.out.println(list);
    }
}
