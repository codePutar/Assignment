package learning_java.practic;

import java.util.Scanner;
public class Selection_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //creating of Array;
        int arr[] = new int[5];
        System.out.print("Enter any 5 numbers in Array: \n");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
       //sorting
       for (int i = 0; i < arr.length; i++) {
        int min_index =i; //assumeing min index

        for (int j = i+1; j < arr.length; j++) {
            if(arr[i]>arr[j]){
                min_index = j;
            }
        }
        //for swaping positions
        int temp = arr[i];
        arr[i] = arr[min_index];
        arr[min_index] = temp;
       }

       for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
       }
    }
}
//Working