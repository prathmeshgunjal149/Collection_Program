//Q3. WAP to create LinkedList and perform the following operation on it.
//        Case 1: add Node at first
//        Case 2: add Node at last
//        Case 3: remove node from first
//        Case 4: remove node from last
//        Case 5: view all data from linked list

package col.org.com;
import java.sql.SQLOutput;
import java.util.*;
public class LinkedList_Switch_Case {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int choise;
        LinkedList ll=new LinkedList();

        do{

            System.out.println("Case 1: add Node at first");
            System.out.println("Case 2: add Node at last");
            System.out.println("Case 3: remove node from first");
            System.out.println("Case 4: remove node from last");
            System.out.println("Case 5: view all data from linked list");
           choise=sc.nextInt();

           switch(choise)
           {
               case 1:
                   System.out.println("Add Data To First Node");
                   sc.nextLine();
                   String First=sc.nextLine();
                   ll.addFirst(First);
                   System.out.println("Element Added Succefuly");

                   break;
               case 2:
                   System.out.println("Add Element To The Last..");
                   sc.nextLine();
                   String Last=sc.nextLine();
                   ll.addLast(Last);
                   System.out.println("Elemnt Added At Last");
                   break;
               case 3:
                   System.out.println("String is Remove From First Node.."+ll.removeFirst());

                   break;
               case 4:
                   System.out.println("String is Remove From First Node.."+ll.removeLast());
                   break;
               case 5:
                     for(Object k : ll)
                     {
                         System.out.println(k);
                     }
                   break;
               case 6:
                   System.exit(choise);
                   break;
               default:
                   System.out.println("Enter The Valid Choise");
           }
        }while(true);
    }
}
