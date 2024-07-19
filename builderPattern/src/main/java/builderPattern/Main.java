package builderPattern;

public class Main {
    public static void main(String args[]){

        Director directorObj1 = new Director(new EngineeringStudent());
        Director directorObj2 = new Director(new MBAStudent());

        Student engineerStudent = directorObj1.createStudent();
        Student mbaStudent =directorObj2.createStudent();

        System.out.println(engineerStudent.toString());
        System.out.println(mbaStudent.toString());

    }

}
