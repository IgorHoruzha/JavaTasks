package Library;

public class ArrayTools {
    public static <T> void display(T[] arr){
        int arrLength = arr.length;
        for (int i=0;i<arrLength;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }

}
