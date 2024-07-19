package prototypePattern;

public class Main {
    public static void main(String[] args) {
        //create instances of Student and clone them
        //modify one clone and observe changes in the other clone
        //demonstrate the use of Prototype interface in Java
        Student student1 = new Student(18, "John Doe");
        Student student2 = (Student) student1.clone();

        student1.age = 19;

        System.out.println("Student 1: " + student1.age + ", " + student1.name);//18, John Doe
        System.out.println("Student 2: " + student2.age + ", " + student2.name);//19, John Doe
    }
}
