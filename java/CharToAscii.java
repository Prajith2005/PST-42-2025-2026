import java.util.Scanner;
public class CharToAscii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        a(str);

    }

    public static void a(String str) {
        for(int i=0;i<str.length();i++){
            char character =str.charAt(i);
        int asciivalue=(int)character;
        System.out.println("Character: '" + character + "' --> ASCII Value: " + asciivalue);
        }
        }
}
