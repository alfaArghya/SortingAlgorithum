import java.util.*;
public class Sort04_CountionSort {
    public static void CounterSortAscendingOrder(int array[], int n){    // time complexity -> linear
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            largest = Math.max(largest, array[i]);  //finding the largest number from the array
        }

        int count[] = new int[largest+1]; 
        for(int i = 0; i < n; i++){
            count[array[i]]++;  //store the frequency of numbers
        }

        //sorting
        int j = 0;
        for(int i = 0; i < count.length; i++){
            while(count[i] > 0){
                array[j] = i;
                j++;
                count[i]--;
            }
        }
        Print(array, n);
    }

    public static void CounterSortDescendingOrder(int array[], int n){    // time complexity -> linear
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            largest = Math.max(largest, array[i]);  //finding the largest number from the array
        }

        int count[] = new int[largest+1]; 
        for(int i = 0; i < n; i++){
            count[array[i]]++;  //store the frequency of numbers
        }

        //sorting
        int j = 0;
        for(int i = count.length-1; i >= 0; i--){
            while(count[i] > 0){
                array[j] = i;
                j++;
                count[i]--;
            }
        }
        Print(array, n);
    }

    

    public static void Print(int array[], int n){
        for(int i = 0; i < n; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);       
        int Array[] = new int[100];
        System.out.println("How many data u want to add in array?");
        System.out.print("-> ");
        int n = scn.nextInt();

        for(int i = 0; i < n; i++){
            System.out.print("Array[" + i+ "] = ");
            Array[i] = scn.nextInt();
        }

        System.out.print("Press 1 to sort the array in ascending order\nPress 2  to sort the array in descending order\n");
        System.out.print("--> ");
        int choose = scn.nextInt();
        
        switch(choose){
            case 1:
                CounterSortAscendingOrder(Array, n);
                break;
            case 2:
                CounterSortDescendingOrder(Array, n);
                break;
            default:
                System.out.println("Please choose a valid number.");
                break;
        }

        scn.close();
    }
}
