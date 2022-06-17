
import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int y;
        int x;
        int count = 0;


        System.out.println("Please enter a Number: ");
        x = scan.nextInt();


        while (count < x) {


            count++;


            if (count % 3 == 0 && count % 2 != 0) {
                System.out.println(count);



            }

        }
    }
}
