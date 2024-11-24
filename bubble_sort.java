package learning_java.practic;

import java.util.*;

public class bubble_sort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //creating arry
        int a[] = new int[5];
        //Entering numbers in arry;
        System.out.println("Enter 5 number: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        
        //sorting
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if(a[j]>a[i]){
                    int temp =a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }

        //printing
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}