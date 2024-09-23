package Practice3;

public class Employee {
    String name;
    int id;
    int age;
    String dept;

    Employee(String name, int id, int age, String dept) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.dept = dept;
    }
    @Override
    public String toString() {
        return (name + " " + id + " " + age + " " + dept);
    }
}
