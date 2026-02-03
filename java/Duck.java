import java.util.Scanner;
public class Duck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        String num = sc.nextLine();
        if(num.charAt(0)=='0'){
            System.out.println(num + " is not a Duck number.");
            return;
        }
        for(int i=0;i<num.length();i++){
            if(num.charAt(i)=='0'){
                System.out.println(num + " is a Duck number.");
                return;
            }
            else{
                System.out.println(num + " is not a Duck number.");
            }
        }

    
}

}
