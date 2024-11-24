package  learning_java.practic;
import java.util.Scanner;

public class binary_Search {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        //Array creation
        int arr[] = new int[5];
        System.out.print("Enter 5 numbers: ");
        //entering numbers:
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number to be searched: ");
        int a = sc.nextInt();

        //searching
        int f =0;
        int l =arr.length;
        int c =0;
        int m =0;
        while(l>=f){
            m = (f+l)/2;
            if(arr[m]== a){
                c++;
                break;
            }
            else if(arr[m]>a){
                l= m-1;
            }
            else if(arr[m]<a){
                f = m+1;
            }
        }
        // out put
        if(c==1){
            System.out.print("Entered number found at index: "+m);

        }
        else{
            System.out.print("Entered number does not exist");
        }

     sc.close();
    }
}
