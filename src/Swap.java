//swap two variables without using third variable
import java.util.*;
public class Swap {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a: ");
        int a=sc.nextInt();
        System.out.println("Enter value of b :" );
        int b=sc.nextInt();
        a=a+b;    //30=10+20
        b=a-b;    // 10=30-20
        a=a-b;     //  20=30-10
        System.out.println("After swapping a is :"+ a +"b is :"+ b );


    }
}
