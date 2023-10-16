import java.util.Scanner;
public class AH3 {
    static void fizzBuzz(int n) {
        for (int i = 1; i <=n; i++) {
            if (i%3 == 0 && i%5 != 0) {
                System.out.print("Fizz ");
            }
            else if (i%3 != 0 && i%5 == 0) {
                System.out.print("Buzz ");
            }
            else if (i%3 == 0 && i%5 == 0) {
                System.out.print("FizzBuzz");
            }
            else {
                System.out.print(i + " ");
            }
        }
    }
    static void recursiveFizzBuzz (int n, int counter) {
        if (counter > n) {
            return;
        }
        else if (counter%3 == 0 && counter%5==0 ) {
            System.out.print("FizzBuzz ");
        }
        else if (counter%3 == 0 && counter%5 != 0) {
            System.out.print("Fizz ");
        }
        else if (counter%5 == 0 && counter%3 !=0) {
            System.out.print("Buzz ");
        }
        else {
            System.out.print(counter + " ");
        }
        recursiveFizzBuzz(n, counter+1);
    }
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        int n;
        System.out.println("Enter a number: ");
        n = console.nextInt();
        //fizzBuzz(n);
        recursiveFizzBuzz(n, 1);
    }
}