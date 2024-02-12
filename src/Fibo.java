import java.util.Scanner;
//fibo series using recursion
public class Fibo {

    public static int fibonacci(int count) {
        if (count <= 1)
            return count;

        return fibonacci(count - 1) + fibonacci(count - 2);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the Fibonacci sequence:");
        int seqLength = scanner.nextInt();

        System.out.print("A Fibonacci sequence of " + seqLength + " numbers: ");

        for (int i = 0; i < seqLength; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        scanner.close();
    }
}
