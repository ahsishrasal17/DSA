public class Array
{
    public static void main(String[] args)
    {
        int[] arr= new int[5];
        for (int i=0; i<arr.length; i++){
            arr[i] = (int) (Math.random()*10);
            System.out.println(arr[i]);
        }
    }
}
