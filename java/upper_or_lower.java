import java.util.Scanner;
public class upper_or_lower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character:");
        char character = sc.next().charAt(0);
        int a = (int)character;
        if(a>=65 && a<=90 ||a>=97 && a<=122){
            if(a>=65 && a<=90){
                System.out.println("The character is in upper case");
            }
            else{
                System.out.println("The character is in lower case");
            }
        }
        else{
            System.out.println("The character is not an alphabet");
        }
    }
}
