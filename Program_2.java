import java.util.Scanner;

public class Program2{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer (a): ");
        int a = sc.nextInt();

        // Loop to generate the series of odd numbers
        for (int i = 1, count = 1; count <= a; i += 2, count++) {
            if (count == a) {
                System.out.print(i); // Avoid printing a comma after the last number
            } else {
                System.out.print(i + ", ");
            }
        }

        sc.close();
    }
}
