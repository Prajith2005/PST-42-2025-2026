import java.util.Scanner;
public class Int_to_Str {
 public static void main(String[]args)   {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter th integer:");
    int num =sc.nextInt();
    String numStr = String.valueOf(num);
    System.out.println("string is "+numStr);
 }
}
