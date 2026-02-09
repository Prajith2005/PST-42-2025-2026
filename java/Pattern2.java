import java.util.Scanner;
public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        System.out.println("Pattern:");
        a(n);
        b(n);
        sc.close();
    }

    public static void a(int n) {
        for(int i=0; i<=n; i++){
            System.out.println("* ");
            }  
        }
    
    public static void b(int n) {
            for(int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
    }
}
    
