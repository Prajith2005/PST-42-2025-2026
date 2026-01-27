package SCANNER;
import java.util.Scanner;
public class two_integer_scanner {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the first integer:");
		int num_1 =scan.nextInt();
		System.out.println("enter the second intger:");
		int num_2 =scan.nextInt();
		int sum=num_1+num_2;
		int diff=num_1-num_2;
		int product=num_1*num_2;
		int quotient=num_1/num_2;
		System.out.println("enter the sum of two string is:"+sum);
		System.out.println("enter the difference of two string is:"+diff);
		System.out.println("enter the product of two string is:"+product);
		System.out.println("enter the quotient of two string is:"+quotient);
		scan.close();
		
	}
}
