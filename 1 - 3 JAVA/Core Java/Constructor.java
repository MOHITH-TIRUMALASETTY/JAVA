class Human{
    private int age;
    private String name;

    public Human() {
        // Default constructor name of the constructor is class itself never returns anything
        age=12;
        name="john";
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

class Constructor {
    public static void main(String[] args) {
        Human obj = new Human();
        // obj.setAge(30);
        // obj.setName("Mohith");

        System.out.println("Age: " + obj.getAge());
        System.out.println("Name: " + obj.getName());
    }

}