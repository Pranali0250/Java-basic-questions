//check if there is  a vowel present in string or not
import java.util.*;
public class CheckVowels {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String to check for vowels");
        String s=sc.nextLine();


        System.out.println("String is "+stringContainsVowels(s));

    }
    public static boolean stringContainsVowels(String s){

        return  s.toLowerCase().matches(".*[aeiou].*");
    }
}
