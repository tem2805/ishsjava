import java.util.Scanner;

public class PrimeGame {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int number = sc.nextInt();

        for(int i=2; i<number; i=i+1){
            if(number % i == 0){
                counter++; //counter = counter + 1
                break;
            }
            System.out.print(i + " ");
        }
        if(counter==0){
            System.out.println(number + " is a prime number~");
        }else{
            System.out.println(number + " is NOT prime number!");
        }
    }
}
