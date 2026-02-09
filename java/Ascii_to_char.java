import java.util.Scanner;
public class Ascii_to_char{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Ascii value:");
        int asciivalue = sc.nextInt();
        a(asciivalue);
        sc.close();
    }

    public static void a(int asciivalue) {
        char character = (char)asciivalue;
        System.out.println("ASCII Value: " + asciivalue + " Character: '" + character + "'");
    
    
    }
}
