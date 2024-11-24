cdcdscdpackage learning_java.practic;

import java.util.Scanner;

public class Initials_print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();
        String a ="";
        for (int i = 0; i < name.length(); i++) {
            if(Character.isUpperCase(name.charAt(i))){
                a =a+name.charAt(i);
            }
        }
        System.out.print("Initials: "+a);
    }
}
