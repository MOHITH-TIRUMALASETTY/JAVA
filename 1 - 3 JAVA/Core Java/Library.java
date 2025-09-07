class Book{
    String title;
    String author;
    int pages;
    Book(){

    }
    Book(String title, String author, int pages){
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    public void printBookDetails(){
        System.out.println(title+" "+author+" "+pages);
    }
}
class Library{
    public static void main (String  [] args){
        Book obj =new Book();
        Book obj1 = new Book("Python","Mohith",1000);
        Book obj2 = new Book("Java","Arnav",200);

        obj1.printBookDetails();
        obj2.printBookDetails();
        obj.printBookDetails();
    }
}