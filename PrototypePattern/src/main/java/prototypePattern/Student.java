package prototypePattern;

public class Student implements Prototype {
    int age;
    String name;
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public Prototype clone() {
        return new Student(this.age, this.name);
    }
}
