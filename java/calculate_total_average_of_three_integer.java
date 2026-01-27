package SCANNER;
import java.util.Scanner;
public class calculate_total_average_of_three_integer {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the first integer:");
	int num1=scan.nextInt();
	System.out.println("enter the second integer:");
	int num2=scan.nextInt();
	System.out.println("enter the third integer:");
	int num3=scan.nextInt();
	int total=num1+num2+num3;
	double average=total/3.0;
	System.out.println("total value:"+total);
	System.out.println("average value:"+average);
	scan.close();
	
}

}
