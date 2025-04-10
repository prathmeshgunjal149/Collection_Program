//Assignments on Map , Collections class + Object class
//__________________________________________________________________
//Q1. WAP to create LinkedHashMap and store student id and name in it here id consider as key and name consider as value and perform following operation on it.
//
//Case 1: Add New Data in Map
//Case 2: View All Data from map using Map.Entry
//Case 3: Search name of student using its id with the help of get() method
//Case 4: search name of student using its id with the help of containsKey() method
//Case 5: delete student record from map using its id.
//Case 7: update the name of student using its id
//Case 8: show all data from map using values() method
//Case 9: show the all keys from map using keySet() method
//Etc


package col.org.com.ss;
import java.sql.SQLOutput;
import java.util.*;
public class Student_App_Using_Linked_Hash_Map {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int choise;
        LinkedHashMap<Integer,String> stud=new LinkedHashMap<>();

        do {
            System.out.println("Case 1: Add New Data in Map");
            System.out.println("Case 2: View All Data from map using Map.Entry");
            System.out.println("Case 3: Search name of student using its id with the help of get() method");
            System.out.println("Case 4: search name of student using its id with the help of containsKey() method");
            System.out.println("Case 5: delete student record from map using its id.");
            System.out.println("Case 6: update the name of student using its id");
            System.out.println("Case 7: show all data from map using values() method");
            System.out.println("Case 8: show the all keys from map using keySet() method");
            System.out.println("Case 9: Exit");

            choise=sc.nextInt();

            switch (choise)
            {
                case 1:
                    System.out.println("How Many Student Name And Id U Want To Store");
                    int size=sc.nextInt();
                    for(int i=0;i<size;i++) {
                        System.out.println("Enter The id... ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter The Name..");
                        String name = sc.nextLine();
                        stud.put(id, name);
                    }
                   break;
                case 2:

                    System.out.println("All Students:");
                    Set<Map.Entry<Integer, String>> entries = stud.entrySet();
                    for (Map.Entry entry : entries) {
                        System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
                    }
                    break;


                case 3:
                    System.out.println("Enter The id For Search name");
                    int idd=sc.nextInt();
                    String namee=stud.get(idd);
                         if(namee!=null)
                         {
                             System.out.println("Name Found With This Id.."+namee);

                         }else {
                             System.out.println("No Found..");
                         }


                    break;
                case 4:
                    System.out.println("Enter The id For Search name");
                    int iddd=sc.nextInt();
                    if(stud.containsKey(iddd))
                    {
                        System.out.println("Name Found..."+stud.get(iddd));
                    }else {
                        System.out.println("Not Found");
                    }
                    break;
                case 5:
                    System.out.println("Enter The id To Delete its Record...");
                    int ib=sc.nextInt();
                    if(stud.containsKey(ib))
                    {
                        System.out.println("Data Removed  "+stud.remove(ib));
                    }else {
                        System.out.println("No Data Found To Delete");
                    }

                    break;
                case 6:
                    System.out.println("Enter The id To Update Name..");
                    int ik=sc.nextInt();
                    if(stud.containsKey(ik))
                    {
                        System.out.println(stud.get(ik));

                        System.out.println("Enter The New Name..");
                        sc.nextLine();
                        String na=sc.nextLine();

                        stud.replace(ik,na);
                        System.out.println("Updated Name...."+stud.get(ik));
                    }else {
                        System.out.println("Id Not Found..");
                    }

                    break;
                case 7:
                    System.out.println("Only Student Name");
                    for(String kk:stud.values())
                    {
                        System.out.println(kk);
                    }
                    break;
                case 8:
                    System.out.println("All Data With Key Set");
                    for(Integer l:stud.keySet())
                    {
                        System.out.println(l);
                    }
                    break;
                case 9:
                    System.out.println("Thank You");
                    System.exit(choise);
                    break;
                default:
                    System.out.println("Please Enter The Valid Choise..");



            }
        }while(true);
    }
}
