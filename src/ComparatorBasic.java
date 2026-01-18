import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


class MyComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2)
    {
        return o2 - o1; 
    }
}

class StringCompare implements Comparator<String>{

    @Override
    public int compare(String o1, String o2)
    {
        return o2.length() - o1.length();
    }
}

public class ComparatorBasic
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);

        list.sort(null);
        System.out.println(list);
        list.sort(new MyComparator());
        System.out.println(list);

        List<String> list1 = Arrays.asList("banana","mango","date","strawberry","apple");
        System.out.println(list1);
        list1.sort(new StringCompare());
        System.out.println(list1);
    }
}
