class A{
    public void show1(){
        System.out.println("in A");
    }
    public void show1(int n){
        System.out.println("int in A");
    }
    public A(){
        System.out.println("in A default");
    }
}

class B extends A{
    public void show(){
        System.out.println("in B");
    }
}


public class Demo {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
