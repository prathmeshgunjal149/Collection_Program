package col.org.com;

import java.util.Comparator;

public class SortById implements Comparator<Book> {
    public int compare(Book id1,Book id2)
    {
        return Integer.compare(id1.getId(), id2.getId());
    }
}
