import java.util.Scanner;
public class Magic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        int sum = num;

        while (sum > 9) {
            int temp = sum;
            int s = 0;
            while (temp > 0) {
                s += temp % 10;
                temp /= 10;
            }
            sum = s;
        }
        
        if (sum == 1) {
            System.out.println(num + " is a Magic number.");
        } else {
            System.out.println(num + " is not a Magic number.");
        }
        sc.close();
    }
}
