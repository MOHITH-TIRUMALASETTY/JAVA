class Human{
    private int age;
    private String name;

    public Human(){
        age=12;
        name="john";
    }
    public Human(int age, String name){ //Parameterized constructor
        this.age=age;
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class DefaultAndParameterizedConstructor {
    public static void main(String[] args) {
        Human obj = new Human();
        Human obj1=new Human(30,"Mohith");
        // obj.setAge(30);
        // obj.setName("Mohith");

        System.out.println("Age: " + obj.getAge());
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj1.getAge());
        System.out.println("Name: " + obj1.getName());
    }

}