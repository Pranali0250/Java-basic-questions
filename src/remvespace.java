//remove spaces from string in java
import java.util.*;


public class remvespace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String s=sc.nextLine();
        String nopspace=removeWhiteSpace(s);
        System.out.println("String after removing space is :" +nopspace);

    }
    public static String  removeWhiteSpace(String input){
        StringBuilder output=new StringBuilder();     //String builder allows modification in string without creating object each time
        char[] charArray=input.toCharArray();   //it converts the string into new character array
        for(char c:charArray){
            if(!Character.isWhitespace(c))
                output.append(c);

        }
        return output.toString();
    }
}
