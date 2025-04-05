//Q5. WAP to create an Employee class and store  5 employee objects in the ArrayList collection and perform the following operation on it.
// Case 1: View All Employee Data
//Case 2: Search Employee by using its id.
//Case 3: Delete Employee by using its id.
//Case 4: update employee name by using its id.
//Case 5: find the same name employee

package col.org.com;
import java.util.*;
public class EmployeeDataApp {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        ArrayList al=new ArrayList();
        EmpHelp emp=new EmpHelper();
        int choise;
        do{
            System.out.println("Case 1 : Add Employee Data");
            System.out.println("Case 2 : View All Employee Data");
            System.out.println("Case 3 : Search Employee By Using its Id");
            System.out.println("Case 4 : Delete Employee by Using Its Id..");
            System.out.println("Case 5 : Update Employee Name by Using Its Id..");
            System.out.println("Case 6 :  Find The Same Name Employeee");
            System.out.println("Case 7 : Exit");
            choise=sc.nextInt();

            switch(choise)
            {
                case 1:
                    emp.AddEmp();
                    break;
                case 2:
                    emp.showData();
                    break;

                case 3:
                    emp.SearchEmp();
                    break;
                case 4:
                    emp.DeleteEmp();
                    break;
                case 5:
                     emp.UpdateEmp();
                    break;
                case 6 :
                    emp.FindSameName();
                    break;
                case 7:
                    System.out.println("Thank You..");
                    System.exit(choise);
                    break;
                default:
                    System.out.println("Please Enter Valid Choise..");
            }

        }while(true);


    }
}





