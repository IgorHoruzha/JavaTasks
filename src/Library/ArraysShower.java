package Library;

public class ArraysShower {
    public static <T> void  Show(T[] arr){
        int arrLength = arr.length;
        for (int i=0;i<arrLength;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }

}
