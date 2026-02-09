import java.util.Scanner;
public class Sum_of_ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            char charac = str.charAt(i);
            int z = (int)charac;
            sum += z;
        }
        System.out.println("Sum of ASCII values: " + sum);
    }   
}
