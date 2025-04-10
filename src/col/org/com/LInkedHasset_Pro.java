package col.org.com;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class LInkedHasset_Pro {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Size Of LinkedHashset");
        int size=sc.nextInt();

        LinkedHashSet<Integer> ls=new LinkedHashSet<>();
        for(int i=0;i<size;i++)
        {
            ls.add(sc.nextInt());
        }
        System.out.println("-----------------------------------");
        for(Integer i:ls)
        {
            System.out.println(i);
        }
    }

}
