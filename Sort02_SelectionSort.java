import java.util.*;
public class Sort02_SelectionSort {
    public static void SelectionSortAscendingOrder(int[] array, int n){   //O(n^2)

        for(int i = 0; i < n-1; i++){
            int MinPos = i;
            for(int j = i+1; j < n; j++){ 
                if(array[MinPos] > array[j]){ // ascending order
                    MinPos = j;
                }
            }
                //swap
            int temp = array[MinPos];
            array[MinPos] = array[i];
            array[i] = temp;
        }
        Print(array, n);
    }

    public static void SelectionSortDescendingOrder(int[] array, int n){   //O(n^2)

        for(int i = 0; i < n-1; i++){
            int MinPos = i;
            for(int j = i+1; j < n; j++){ 
                if(array[MinPos] < array[j]){ // Descending order
                    MinPos = j;
                }
            }
                //swap
            int temp = array[MinPos];
            array[MinPos] = array[i];
            array[i] = temp;
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
                SelectionSortAscendingOrder(Array, n);
                break;
            case 2:
                SelectionSortDescendingOrder(Array, n);
                break;
            default:
                System.out.println("Please choose a valid number.");
                break;
        }

        scn.close();
    }
}
