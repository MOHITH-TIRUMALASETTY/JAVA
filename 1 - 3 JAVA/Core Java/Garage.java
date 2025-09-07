class Car{
    String brand;
    String model;
    int year;

    Car(){

    }
    Car(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
}
public class Garage {
    public static void main(String[] args) {
        Car myCar = new Car("Tata","nano",2020);
        myCar.year = 2022;
        System.out.println(myCar.brand);
        System.out.println(myCar.year);

    }
}
