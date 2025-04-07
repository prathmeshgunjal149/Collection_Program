package col.org.com;

import java.util.Comparator;

public class SortByPrise implements Comparator<Book> {
    public int compare(Book p1,Book p2)
    {
        return Integer.compare(p1.getPrise(), p2.getPrise());
    }
}
