//factorial using recurrsion
//find a factorial of a given no
import java.util.*;
public class Fact {
    public static void main(String args[]){
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no to fine a factorial");
        a=sc.nextInt();
        int result=factorial(a);
        System.out.println("The factorial is"+ result );

    }

    public static int factorial(int a){
        if(a==1){
            return 1;
        }
        else{
            return (a*factorial((a-1)));
        }


    }
}
