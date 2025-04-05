package col.org.com;

import java.util.*;

public class VecData {
    public void AddData(Vector v) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How Many Element U Want Add In Vector..");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            v.add(sc.nextInt());
        }
    }

    public void DataWithForEach(Vector v) {
        System.out.println("Data Using For each...");
        for (Object v1 : v) {
            System.out.println(v1);
        }
    }
    public void NormalFor(Vector v)
    { System.out.println("Using Normal For Loop");
        for(int i=0;i<v.size();i++)
        {
            System.out.println(v.get(i));
        }
    }
    public void DataWithIterator(Vector v)
    {
    Iterator i=v.iterator();
    while(i.hasNext())
    {
        System.out.println(i.next());
    }
    }
    public void dataWithList(Vector v)
    {
        ListIterator i=v.listIterator();
        while(i.hasPrevious())
        {
            System.out.println(i.previous());
        }
    }
    public void EnuData(Vector v)
    {
       Enumeration e=v.elements();
       while(e.hasMoreElements())
       {
           System.out.println(e.nextElement());
       }
    }
}
