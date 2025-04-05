//Q1.WAP to create Vector class and store 5 values in it and display vector data using a following methods
//
//Show the vector data using Enumeration
//Show the vector data using Iterator
//Show the vector data using normal for loop
//Show the vector data using foreach
//Show the vector data using ListIterator

package col.org.com;
import java.util.*;
public class Vector_Switch_Case {
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        int choise;
        Vector v=new Vector();
        VecData vec=new VecData();
        do{
            System.out.println("case 1 for Show the vector data using Enumeration ");
            System.out.println("case 2 for Show the vector data using Iterator ");
            System.out.println("case 3 for Show the vector data using normal for loop");
            System.out.println("case 4 for Show the vector data using foreach ");
            System.out.println("case 5 for  Show the vector data using ListIterator ");
            System.out.println("case 6 For Add Data To Vector");
            System.out.println("case 7 for Exit...☠️");
            choise=sc.nextInt();
            switch(choise)
            {
                case 1:
                     vec.EnuData(v);
                    break;
                case 2:
                    vec.DataWithIterator(v);
                    break;
                case 3:
                    vec.NormalFor(v);
                    break;
                case 4:
                       vec.DataWithForEach(v);
                    break;
                case 5:
                    vec.dataWithList(v);
                    break;
                case  6:
                    vec.AddData(v);
                    break;
                case 7:
                    System.out.println("Thankuuuuuu........");
                    System.exit(choise);
                    break;
                default:
                    System.out.println("Enter The Valid Choise...");
            }

        }while(true);


    }

}
