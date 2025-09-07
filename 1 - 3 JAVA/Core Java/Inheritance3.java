class Vehicle{
    String brand;
    public void honk(){
        System.out.println("This vehicle is honking ");
    }
}

class Car extends Vehicle{
    String model;
    public void drive(){
        super.honk();
        System.out.println("This car is driving ");
    }
}

class Inheritance3{
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Ford";
        myCar.model = "Mustang";
        myCar.honk();
        myCar.drive();
        System.out.println("My car is : "+myCar.brand+" "+"Model : "+myCar.model);
    }
}