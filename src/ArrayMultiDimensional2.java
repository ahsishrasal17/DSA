public class ArrayMultiDimensional2 {
    public static void main(String[] args)
    {
        int arr[][] = new int[3][4];
        for (int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                arr[i][j] = (int)(Math.random()*10);
            }
        }

        for(int n[] : arr){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
