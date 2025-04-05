//Q2. WAP to create ArrayList and perform following operation on it
//Case 1: add new data in ArrayList
//Case 2: view all data from ArrayList
//Case 3: Search Data using contains method
//Case 4: Search data using indexOf() method
//Case 5: delete data using index
//Case 6: count total number of element from ArrayList
//Case 7: check ArrayList  is empty or not

package col.org.com;
import java.sql.SQLOutput;
import java.util.*;
public class ArrayList_Switch_Case {
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        int choise;
        ArrayList arr=new ArrayList();

        do{
            System.out.println("Case 1: add new data in ArrayList");
            System.out.println("Case 2: view all data from ArrayList");
            System.out.println("Case 3: Search Data using contains method");
            System.out.println("Case 4: Search data using indexOf() method");
            System.out.println("Case 5: delete data using index");
            System.out.println("Case 6: count total number of element from ArrayList");
            System.out.println("Case 7: check ArrayList  is empty or not");
            System.out.println("case 8: exit");

            choise=sc.nextInt();

            switch(choise)
            {
                case 1:
                    System.out.println("How Many Elements U Want To Add");
                    int size=sc.nextInt();
                    System.out.println("Enter The Elements..");
                    for(int i=0;i<size;i++)
                    {
                        arr.add(sc.nextInt());
                    }
                    break;
                case 2:
                    System.out.println("These Are The All Elements..");
                    for(int i=0;i< arr.size();i++)
                    {
                        System.out.print("\t"+arr.get(i));
                    }
                    break;
                case 3:
                    System.out.println("Enter The Data For Search Using Contains Method...");
                    int search=sc.nextInt();
                    if(arr.contains(search))
                    {
                        System.out.println("Number Found..");
                    }else {
                        System.out.println("Not Contains The Number...");
                    }
                    break;
                case 4:
                    System.out.println("Enter The NUmber To Search...Using Index Of..");
                    int index=sc.nextInt();
                    int check=arr.indexOf(index);
                    if(check !=-1)
                    {
                        System.out.println("Number Found");
                    }else {
                        System.out.println("Not Found...");
                    }
                    break;
                case 5:
                    System.out.println("Enter The Number To Delete its Index");
                    int ind=sc.nextInt();
                    if(ind>0&&ind<arr.size()){
                        arr.remove(ind);
                        System.out.println("Removed Sucefully");
                    }else {
                        System.out.println("Enter The Valid Number");
                    }
                    break;
                case 6:
                    System.out.println("This Is The Total element.."+arr.size());
                    break;
                case 7:
                      if(arr.isEmpty())
                      {
                          System.out.println("ArrayList Is Empty..");
                      }else {
                          System.out.println("ArrayList Is Not Empty..");
                      }
                    break;
                     case 8:
                        System.out.println("Thankuuuu..");
                         System.exit(choise);
                break;



                default:
                    System.out.println("Enter The Valid Chaoise");
            }
        }while(true);
    }
}
