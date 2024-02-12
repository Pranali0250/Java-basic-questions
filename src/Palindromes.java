//check if given String is pallindrom or not
import java.util.*;
public class Palindromes {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        if(checklinePalindrome(s)){
            System.out.println("it is not a pallindrom string");
        }
        else{
            System.out.println("it is a pallindrome string");
        }



        }

        static boolean checklinePalindrome(String input){

        int length=input.length();
        for(int i=0;i<length/2;i++){
            if(input.charAt(i)!=input.charAt(length-i-1)){
                return false;

            }
        }
        return true;
        }



}
