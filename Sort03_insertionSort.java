import java.util.*;
public class Sort03_insertionSort {

    public static void InsertionSortAscendingOrder(int array[], int n){

        for(int i = 1; i < n; i++){   //-> O(n^2)
            int Current = array[i];
            int PreviousIndex = i-1;
            while(PreviousIndex >= 0 && array[PreviousIndex] > Current){
                array[PreviousIndex + 1] = array[PreviousIndex];
                PreviousIndex--;
            }
            array[PreviousIndex+1] = Current;
        }
        Print(array, n);
    }

    public static void InsertionSortDescendingOrder(int array[], int n){

        for(int i = 1; i < n; i++){   //-> O(n^2)
            int Current = array[i];
            int PreviousIndex = i-1;
            while(PreviousIndex >= 0 && array[PreviousIndex] < Current){
                array[PreviousIndex + 1] = array[PreviousIndex];
                PreviousIndex--;
            }
            array[PreviousIndex+1] = Current;
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
                InsertionSortAscendingOrder(Array, n);
                break;
            case 2:
                InsertionSortDescendingOrder(Array, n);
                break;
            default:
                System.out.println("Please choose a valid number.");
                break;
        }
        
        scn.close();
    }
}
