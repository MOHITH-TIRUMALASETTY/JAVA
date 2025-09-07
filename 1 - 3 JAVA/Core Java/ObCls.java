class Laptop{
    String model;
    int price;
}

public class ObCls{
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model = "Lenova";
        obj.price = 40000;
        
        System.out.println(obj);
    
    }

}