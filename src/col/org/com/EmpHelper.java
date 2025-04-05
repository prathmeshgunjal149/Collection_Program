package col.org.com;
import java.util.*;
public class EmpHelper implements EmpHelp{
    Scanner sc= new Scanner(System.in);
    ArrayList <Employee> al= new ArrayList();

    public void AddEmp(){
        System.out.println("How any Employee Details U Want To Add");
        int size=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter The Id...");
            int id=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter The Name");
            String name=sc.nextLine();
             System.out.println("Enter The Rolll Number..");
             int roll=sc.nextInt();
            Employee emp = new Employee(id, name, roll);
            al.add(emp);

        }

    }
    public void showData()
    {
        System.out.print("This Is Your All Employee..");
        for(Employee e:al)
        {
            System.out.println(e);
        }
    }

    @Override
    public void SearchEmp() {
        int flag=0;
        System.out.println("Enter The Id Which Was U Want To Search..");
        int idd=sc.nextInt();
       for(Employee emm:al)
       {
           if(emm.id==idd)
           {
               System.out.println("Found."+emm);
               flag=1;
               break;
           }
       }
if(flag==0)
{
    System.out.println("Not Found....");
}
    }


    public void DeleteEmp()
    {
        System.out.println("Enter The Id Which Was U Want To Delete");
        int del=sc.nextInt();
        int flag=0;
        for(Employee Em:al)
        {
            if(Em.id==del)
            {
                System.out.println(Em+"   "+al.remove(Em)+"Removed Succefully");
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("Not Found Employee For Delete..");
        }
    }


    public void UpdateEmp()
    {
        System.out.println("Enter The Employee Id For Update ");
        int ii=sc.nextInt();
        int flag=0;

        for(Employee et:al)
        {
            if(et.id==ii)
            {
                System.out.println(et);
                System.out.println("Enter The New Name...");
                sc.nextLine();
                String newName=sc.nextLine();
                et.name=newName;
                System.out.println("This Is Updated Name.."+et);
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("not Found For Update");
        }
    }

    public void FindSameName()
    {
        int flag=1;
       for(int i=0;i<al.size();i++)
       {
        Employee a=al.get(i);

        for(int j=i+1;j<al.size();j++)
        {
            Employee a1=al.get(j);
            if(a.name.equals(a1.name))
            {
                System.out.println(a.name);
                flag=0;
                break;
            }
        }
       }
       if(flag==1)
       {
           System.out.println("There is No Duplicate Employee Name");
       }
    }
}
