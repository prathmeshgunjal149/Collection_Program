package col.org.com;

import java.util.Comparator;

public class SortByName implements Comparator<Book> {
    public int compare(Book n1, Book n2) {
        return n1.getName().compareTo(n2.getName());
    }
}
