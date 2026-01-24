import java.util.ArrayList;
import java.util.Vector;

public class ArrayListvsVector {
    public static void main(String[] args)
    {
        ArrayList<Integer> arrayList = new ArrayList<>();

        Thread t1 = new Thread( () -> {
            for(int i=0; i<1000; i++){
                arrayList.add(i);
            }
        });

        Thread t2 = new Thread( () -> {
            for(int i=-0; i<1000; i++)
                arrayList.add(i);
        });

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Size of ArrayList is : " + arrayList.size());

        Vector<Integer> vector = new Vector<>();

        Thread t3 = new Thread( () -> {
            for(int i=0; i<1000; i++){
                vector.add(i);
            }
        });

        Thread t4 = new Thread( () -> {
            for(int i=0; i<1000; i++){
                vector.add(i);
            }
        });

        t3.start();
        t4.start();

        try{
            t3.join();
            t4.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Size of vector is : " + vector.size());
    }
}
