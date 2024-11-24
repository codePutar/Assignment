package practice;

import java.util.*;

public class piglatin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.next();
        word = word.toUpperCase();
        String s1 ="";
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i)=='A'||word.charAt(i)=='E'||word.charAt(i)=='I'||word.charAt(i)=='O'||word.charAt(i)=='U'){
                s1 = s1+word.substring(i)+ word.substring(0,i)+"AY";
                break;
            }
        }
        System.out.print("Piglaten Form: "+s1);
    }
}
