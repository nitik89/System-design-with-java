package builderPattern;

public class Director {
    StudentBuilder studentBuilder;
     Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }
    public Student createStudent() {
        if(studentBuilder instanceof EngineeringStudent){
            return createEngineeringStudent();
        }
        else if(studentBuilder instanceof MBAStudent){
            return createMBAStudent();
        }
        return null;

    }
    private Student createEngineeringStudent(){

        return studentBuilder.setRollNumber(1).setAge(22).setName("sj").setSubjects().build();
    }

    private Student createMBAStudent(){

        return studentBuilder.setRollNumber(2).setAge(24).setName("sj").setFatherName("MyFatherName").setMotherName("MyMotherName").setSubjects().build();

    }


}
