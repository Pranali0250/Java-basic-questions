//write a program to check if given no is prime number
import java.util.*;
public class PrimeNumberCheck {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int p=sc.nextInt();
        System.out.println(isPrime(p));

    }
    public static boolean isPrime(int p) {
        int n = p;
        for(int i=1;i<=n;i++){
            if(n%i==1){
                System.out.println("is a prime number");
                return true;
            }
        }
        System.out.println("is not a prime number");
        return false;

    }
}
