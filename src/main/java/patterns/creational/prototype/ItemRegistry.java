package patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class ItemRegistry {

    private Map<String, Item> items = new HashMap<>();

    public ItemRegistry() {
        loadItems();
    }

    public Item createItem(String type) {
        Item item = null;
        try {
            item = (Item)items.get(type).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return item;
    }

    private void loadItems() {
        Book book = new Book();
        book.setName("Book name");
        book.setAuthor("Author name");
        items.put("Book", book);

        Movie movie = new Movie();
        movie.setName("Movie name");
        movie.setRuntime(10000L);
        items.put("Movie", movie);
    }

}
