import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private double gpa;

    public Student(String name, double gpa){
        this.name = name;
        this.gpa = gpa;
    }

    public String getName(){
        return name;
    }

    public double getGpa(){
        return gpa;
    }
}
public class Comparator2{
    public static void main(String[] args)
    {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Pratik", 8.5));
        students.add(new Student("Ashish", 8.5));
        students.add(new Student("Darshan", 9.2));
        students.add(new Student("Akshay", 8.7));
        students.sort((a,b) -> {
            if(b.getGpa() - a.getGpa() > 0){
                return 1;
            } else if (b.getGpa() - a.getGpa() < 0){
                return -1;
            }else {
                return a.getName().compareTo(b.getName());
            }
        });
        for (Student s : students){
            System.out.println(s.getName() + " : " + s.getGpa());
        }
    }
}
