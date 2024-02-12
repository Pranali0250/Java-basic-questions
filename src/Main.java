import java.util.Scanner;
//revese a string in java using for loop without bulid in function
public class Main {
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String: ");
        s=sc.nextLine();                                     //reading string from user
        System.out.print("After reverse string is: ");
        for(int i=s.length();i>0;--i)                       //i is the length of the strin
             {
            System.out.print(s.charAt(i-1));              //printing the character at index i-1
        }                                                 //charAt()-return character at specifed index in a string
    }
}
