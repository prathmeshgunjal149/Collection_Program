package col.org.com.ss;
import java.util.*;
 class Player implements Comparable<Player>{
    int id;
    String name;
    int salary;
    public Player()
    {

    }
    public Player(int id,String name,int salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public int compareTo(Player other) {
        return Integer.compare(this.id, other.id);
    }
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }

}
