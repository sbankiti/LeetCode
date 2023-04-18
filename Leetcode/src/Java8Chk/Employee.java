package Java8Chk;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Employee {

    String name;
    List<String> Email;

    public static class NewClass{

        public void newMethod(){
            System.out.println("Class inside a class");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getEmail() {
        return Email;
    }

    public void setEmail(List<String> email) {
        Email = email;
    }

    public Employee(){

    }
    public Employee(String name, List<String> email) {
        this.name = name;
        Email = email;
    }

    /*@Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);
    }*/
}
