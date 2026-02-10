import java.util.Scanner;
public class String_to_int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        int num = Integer.parseInt(str);
        System.out.println("Integer is: " + num);
    }
}
