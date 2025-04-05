package col.org.com;

public class Employee {
    int id,roll;
    String name;

//    public Employee(int id, String name, int roll) {
//    }

    public  Employee(int id,String name,int roll)
    {
        this.id=id;
        this.name=name;
        this.roll=roll;
    }
    public void Employee()
    {

    }
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Roll: " + roll;
    }

}
