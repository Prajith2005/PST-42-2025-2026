import java.util.Scanner;
public class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        int square = num * num;
        String numStr = Integer.toString(num);
        String squareStr = Integer.toString(square);
        if (squareStr.endsWith(numStr)) {
            System.out.println(num + " is an Automorphic number.");
        } else {
            System.out.println(num + " is not an Automorphic number.");
        }
    }
}
