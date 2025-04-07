//Q7. WAP to create class name as Book with field id,name and price and 5 book objects in ArrayList and perform sorting like as
//Case 1: Sort book by using id
//Case 2: Sort book by price
//Case 3: Sort book by name
//Note: Use Comparator interface for solve above program

package col.org.com;
import java.util.*;
public class Book_Management
{
    public static void main(String args[])
    {
       Scanner sc= new Scanner(System.in);
       System.out.println("How Many Employee Details U Want TO Store..");
       int size=sc.nextInt();
       ArrayList<Book> Al=new ArrayList<>();
       Book b[]=new Book[size];
        System.out.println("Fill The Details..");
        for(int i=0;i<size;i++)
        {
            System.out.println(" Enter book id ,Name,prise ");
            int id=sc.nextInt();
            sc.nextLine();
            String name=sc.nextLine();
            int prise=sc.nextInt();
            b[i]=new Book(id,name,prise);
            b[i].setId(id);
            b[i].setName(name);
            b[i].setPrise(prise);
            Al.add(b[i]);
        }
       Collections.sort(Al,new SortById());
        for(Book bb :Al)
        {
            System.out.println(bb);
        }

        Collections.sort(Al,new SortByPrise());
        for(Book bb :Al)
        {
            System.out.println(bb);
        }

        Collections.sort(Al,new SortByName());
        for(Book bb :Al)
        {
            System.out.println(bb);
        }

    }
}
