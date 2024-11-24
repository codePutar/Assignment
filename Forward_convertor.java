package learning_java.practic;

import java.util.Scanner;

public class Forward_convertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.next();
        String war = " ";
        for (int i = 0; i < word.length(); i++) {
            int a = (int)word.charAt(i);
            if(word.charAt(i)>='A'&& word.charAt(i)<='X'||word.charAt(i)>='a'&& word.charAt(i)<='x'){
                a = a+2;
                war = war+(char)a;
            }
            else if(word.charAt(i)=='Z'){
                war = war+'B';
            }
            else if(word.charAt(i)=='z'){
                war = war+'b';
            }
            else if(word.charAt(i)=='Y'){
                war = war+'A';
            }
            else if(word.charAt(i)=='y'){
                war = war+'a';
            }
        }
        System.out.println(war);
        sc.close();
    }
}
