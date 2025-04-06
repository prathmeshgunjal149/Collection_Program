
//Q6. WAP to Create Player class with field id , name and salary and store 5 player data in ArrayList and sort the player data by using id
// with the help of Comparable interface

package col.org.com.ss;
import java.util.*;
public class Player_App {

    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
         ArrayList<Player> Al=new ArrayList<>();
        System.out.println("How Many Employee U Want To Add..");
        int size=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter The Id..");
            int id=sc.nextInt();
            System.out.println("Enter The Name..");
            sc.nextLine();
            String name=sc.nextLine();
            System.out.println("Enter The Salary..");
            int salary=sc.nextInt();
            Al.add(new Player(id,name,salary));
        }
      Collections.sort(Al);
        System.out.println("Sort by id...");
        for(Player p:Al)
        {
            System.out.println(p);
        }

    }
}
