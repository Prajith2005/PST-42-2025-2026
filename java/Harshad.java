import java.util.Scanner;
public class Harshad {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        int sum = 0;
        int temp =num;
        while(temp>0){
            int digit = temp%10;
            sum+=digit;
            temp/=10;
        }
        if(num%sum==0){
            System.out.println(num + " is a Harshad number.");
        } else {
            System.out.println(num + " is not a Harshad number.");
        }

    }
}
