public class Employee {
    String name;
    int eno;
    int marks;

    Employee(String n, int en, int m){
        name = n;
        eno = en;
        marks = m;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Employee No: " + eno);
        System.out.println("Marks: " + marks);
    }
}
