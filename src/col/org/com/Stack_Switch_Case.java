//Q4. WAP to create a stack and perform the following operation on it.
//        Case1: push data in stack
//        Case 2: pop data from stack
//        Case 3: display all data from stack
package col.org.com;
import java.util.*;
public class Stack_Switch_Case {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);

        Stack s= new Stack();

        int choise;
        do{
            System.out.println("Case1: push data in stack");
            System.out.println("Case 2: pop data from stack");
            System.out.println("Case 3: display all data from stack");
            choise=sc.nextInt();

            switch(choise)
            {
                case 1:
                    s.push(sc.nextInt());
                    break;
                case 2:
                    System.out.println("the element is poped "+s.pop());
                    break;
                case 3:
                    for(int i=0;i<s.size();i++)
                    {
                        System.out.print("\t"+s.elementAt(i));
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Thank You..");
                    System.exit(choise);
                    break;

                default:
                    System.out.println("Please Enter The Valid Choise...");
            }


        }while(true);


    }
}
