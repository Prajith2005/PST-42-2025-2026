public class Polymorphism {
    public static void main(String[] args) {
        System.out.println(a());
    }
    public static int a() {
       int a=10;
       System.out.println(b());
       return a;
    }
    public static int b() {
        int b=20;
        return b;
}
}