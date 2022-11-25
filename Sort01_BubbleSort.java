import java.util.*;
public class Sort01_BubbleSort {

    public static void BubbleSortAscendingOrder(int[] array, int n){ // --> O(n^2)
        // int swap = 0;
        for(int i = 0; i < n-1; i++){
            int swap = 0;
            for(int j = 0; j < n-1-i; j++){
                if(array[j] > array[j+1]){ //ascending order
                    //swap
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swap++;
                    if(swap == 0){
                        break;  //this will help you to exit the loop if your array is already sorted
                    }
                }            
            }
        }
        Print(array, n);
    }
    public static void BubbleSortDescendingOrder(int[] array, int n){ // --> O(n^2){
        for(int i = 0; i < n-1; i++){
            int swap = 0;
            for(int j = 0; j < n-1-i; j++){
                if(array[j] < array[j+1]){ //descending order
                    //swap
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swap++;
                    if(swap == 0){
                        break;   //this will help you to exit the loop if your array is already sorted
                    }
                }
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
                BubbleSortAscendingOrder(Array, n);
                break;
            case 2:
                BubbleSortDescendingOrder(Array, n);
                break;
            default:
                System.out.println("Please choose a valid number.");
                break;
        }


        scn.close();
    }
}
