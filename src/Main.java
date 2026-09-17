// https://github.com/prussia2017-maker/COSC113_Inheritance
public class Main {
    public static void main(String[] args) {
        // Create two person object
        Person p1 = new Person();

    //    Person p2 = new Person(72, 70, "Black", "Barack Obama", 170);
        //   System.out.println(p2.name);
        Person p2 = new Person(72, 70);
        System.out.println(p2.name);

        Person p3 = p2.Call_Private();

        Student s1 = new Student();
        s1.age = 20;
        s1.gpa = 4.00;
        System.out.println(s1.gpa);

    }
}