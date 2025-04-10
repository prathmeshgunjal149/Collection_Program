package col.org.com;
import java.util.*;
public class HashSet_Program {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Size Of HashSet");
        int size=sc.nextInt();
        HashSet <Integer>hs =new HashSet<>();
        for(int i=0;i<size;i++)
        {
            hs.add(sc.nextInt());
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
        for(Integer e:hs)
        {
            System.out.println(e);
        }
    }
}
