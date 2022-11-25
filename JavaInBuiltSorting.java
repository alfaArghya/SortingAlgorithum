import java.util.*;
import java.util.Arrays;
import java.util.Collection;

public class JavaInBuiltSorting {

    public static void PrintArrays(int array[], int n){
        for(int i = 0; i < n; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void PrintArrays(Integer array[], int n){
        for(int i = 0; i < n; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);       
        // int array[] = new int[100];
        // System.out.println("How many data u want to add in array?");
        // System.out.print("-> ");
        // int n = scn.nextInt();

        // for(int i = 0; i < n; i++){
        //     System.out.print("Array[" + i+ "] = ");
        //     array[i] = scn.nextInt();
        // }

        int arr[] ={5, 4, 1, 3, 2};
        Arrays.sort(arr); //sorting in ascending order
        PrintArrays(arr, arr.length);
        // Arrays.sort(arr, 0, 3); //sorting for some index
        // PrintArrays(arr, arr.length);

        Integer arr1[] ={5, 4, 1, 3, 2};
        Arrays.sort(arr1, Collections.reverseOrder());
        PrintArrays(arr1, arr1.length);
        // Arrays.sort(arr1, 0, 3, Collections.reverseOrder());
        // PrintArrays(arr1, arr1.length);

        scn.close();
    }
}
