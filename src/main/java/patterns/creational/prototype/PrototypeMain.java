package patterns.creational.prototype;

public class PrototypeMain {

    public static void main(String[] args) {

        ItemRegistry registry = new ItemRegistry();

        Book book1 = (Book)registry.createItem("Book");
        System.out.println(book1);
        System.out.println(book1.getName());
        System.out.println(book1.getAuthor());
        Book book2 = (Book)registry.createItem("Book");
        book2.setAuthor("Another author name");
        System.out.println(book2);
        System.out.println(book2.getName());
        System.out.println(book2.getAuthor());

    }

}
