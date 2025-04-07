package col.org.com;

public class Book {
    private int id;
    private String name;
    private int prise;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public Book(int id , String name, int prise) {
        this.id = id;
        this.name=name;
        this.prise=prise;

    }
    public Book(){}
    {

    }
    public String toString()
    {
        return "Book{id=" + id + ", name='" + name + "', price=" + prise + "}";
    }
}
