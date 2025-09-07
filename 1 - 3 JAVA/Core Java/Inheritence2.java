class A{
    public A(){
        System.out.println("in A default");
    }
}

class B extends A{
    public B(){
        System.out.println("in B");
    }
    public B(int n){
        System.out.println("int in B");
    }
}
public class Inheritence2 {
    public static void main(String[] args) {
        B object = new B(5);
    }
}
