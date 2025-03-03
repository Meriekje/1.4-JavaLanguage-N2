package nivell2;

import org.assertj.core.api.Assertions;


import java.util.Arrays;
import java.util.List;

public class Exercise4 {

    static class Item {
        String name;
        Item(String name) { this.name = name; }
    }

    public static void main(String[] args) {
        new Exercise4().testListAssertions();
    }
    void testListAssertions() {
        Item item1 = new Item("Apple");
        Item item2 = new Item("Banana");
        Item item3 = new Item("Cherry");


        List<Item> itemList = Arrays.asList(item1, item2, item3);

        Assertions.assertThat(itemList).containsExactly(item1, item2, item3);
        Assertions.assertThat(itemList).contains(item1, item3, item2);
        Assertions.assertThat(itemList).containsOnlyOnce(item2);
        Assertions.assertThat(itemList).doesNotContain(new Item("Orange"));
    }
}
