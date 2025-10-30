import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Input numerator : ");
        int numerator = scanner.nextInt();
        System.out.print("Input denominator : ");
        int denominator = scanner.nextInt();

        System.out.println(numerator/denominator);
    }
}
