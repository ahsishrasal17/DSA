class ArrayObj{
    String name;
    int rollno;
    int marks;
}

public class ArrayOfObjects {
    public static void main(String[] args)
    {
        ArrayObj s1 = new ArrayObj();
        s1.name = "Ashish";
        s1.rollno = 1;
        s1.marks = 89;

        ArrayObj s2 = new ArrayObj();
        s2.name = "Pratik";
        s2.rollno = 2;
        s2.marks = 97;

        ArrayObj s3 = new ArrayObj();
        s3.name = "Akshay";
        s3.rollno = 3;
        s3.marks = 93;

        ArrayObj arr[] = new ArrayObj[3];
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i].name + " : " + arr[i].rollno + " : " + arr[i].marks);
        }
    }
}
