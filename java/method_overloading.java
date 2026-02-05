public class method_overloading {
    public static void main(String[] args) {
        int a=10,b=20,c=30;
        System.out.println(a(a,b));
        System.out.println(a(a,b,c));
    }
    static int a(int a,int b) {
        return a+b;
    }
    static int a(int a,int b,int c) {
        return a+b+c;
    }
}
