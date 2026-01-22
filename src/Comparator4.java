import com.sun.source.tree.BreakTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student2{
    String name;
    int age;

    Student2(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public Integer getAge(){
        return age;
    }

    public String toString(){
        return age + " : " + name;
    }
}

class CustomCompare implements Comparator<Student2>{

    @Override
    public int compare(Student2 a, Student2 b)
    {
        int nameCompare = a.getName().compareTo(b.getName());
        int ageCompare = a.getAge().compareTo(b.getAge());
        return (nameCompare == 0) ? ageCompare : nameCompare;
    }
}

public class Comparator4 {
    public static void main(String[] args)
    {
        List<Student2> list = new ArrayList<>();
        list.add(new Student2("Ashish",27));
        list.add(new Student2("Darshan", 26));
        list.add(new Student2("Akash", 26));
        list.add(new Student2("Pratik", 25));
        list.add(new Student2("Ashish", 28));

        Collections.sort(list, new CustomCompare());
        for(Student2 s : list){
            System.out.println(s);
        }

    }
}
