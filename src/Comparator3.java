import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student1{
    int rollno;
    String name;

    Student1(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }

    public String toString(){
        return rollno + " : " + name;
    }
}

class SortByRollNo implements Comparator<Student1>{

    @Override
    public int compare(Student1 a, Student1 b)
    {
        return b.rollno - a.rollno;
    }
}

public class Comparator3 {
    public static void main(String[] args)
    {
        List<Student1> list = new ArrayList<>();
        list.add(new Student1(5, "Ashish"));
        list.add(new Student1(8, "Darshan"));
        list.add(new Student1(3, "Akshay"));
        list.add(new Student1(4, "Pratik"));

        Collections.sort(list, new SortByRollNo());
        for(Student1 s : list){
            System.out.println(s);
        }
    }
}
