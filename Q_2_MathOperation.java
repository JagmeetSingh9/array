/*Write a class MathOperation which takes 5 integers inputs from user. Create an array using these parameters. Loop through the array and obtain the sum and average of all the elements and display the result.
        Various exceptions that may arise like ArithmeticException, NumberFormatException, and so on should be handled.*/
import java.util.InputMismatchException;
import java.util.Scanner;
public class Q_2_MathOperation {
    public static void main(String[] args) {


        int[] arr = new int[5];
        int sum=0;
        double avg=0;
        Scanner sc = new Scanner(System.in);
        try {
            for (int i = 0; i < 5; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < 5; i++) {
                sum+=arr[i];

            }
            System.out.println(sum);
            System.out.println(avg/5);
        }
        catch (ArithmeticException|IndexOutOfBoundsException| InputMismatchException|NumberFormatException e){
            System.out.println(e);
        }
    }

}