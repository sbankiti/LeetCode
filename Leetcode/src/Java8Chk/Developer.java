package Java8Chk;
public class Developer implements Cloneable{

    String Name;
    int Age;

    public static final int nu = 907;

   public Employee emp = new Employee();

    public Developer(){};
    public Developer(String name, int age) {
        Name = name;
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {

      return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public Object clone() throws CloneNotSupportedException {
        Developer d = (Developer)super.clone();

        d.emp = new Employee();
        d.emp.name = emp.name;

        return d;
    }
}
