package learning_java.practic;

import java.util.Scanner;

public class palindrom_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String a = sc.next();
        String c = "";
        for (int i = a.length()-1; i>=0;i--) {
            c = c+ a.charAt(i);
        }
        if(a.equals(c)){
            System.out.println("Entered String is a palindrome");
        }
        else{
            System.out.println("Entered String is not palindrome");
        }
    }
}
