public class Inheritance {
    public static void main(String[] args) {
       b obj = new b();
       obj.cse();
    }

}
class a{

public static void cse() {
    
    System.out.println("hello");
    
}

}

class b extends a {

    public static void cse() {
        
        System.out.println("hi");
        
    }
}
    