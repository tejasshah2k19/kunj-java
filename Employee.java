
public class Employee {

    //instance variable 
    int salary;
    int age;
    String name; //ram 
    char gender; //single character 'M' 'F' 

    //constructor 
    public Employee() {
        salary = 10000;
        age = 30;
        name = "";
        gender = 'm';
    }

    public Employee(int salary, int age, String name, char gender) {
        //local varibale 
        this.salary = salary;
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public static void main(String[] args) {

        Employee e = new Employee();
        System.out.println(e.age);//30 

        e = null;
        System.gc();
        // e.age=100;

        Employee e2 = new Employee(25000, 25, "Rock", 'M');
        System.out.println(e2.age);
    }

}
