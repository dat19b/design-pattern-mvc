package mvc.model.repository;

import mvc.model.Student;

import java.util.List;

public class StudentRepository implements IStudentRepository {

    Student student = new Student();
    List<Student> students;

    public Student retriveStudentFromDatabase() {
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }

    public String getName(){
        return student.getName();
    }

    public String getRollNo(){
        return student.getRollNo();
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void setRollNo(String rollNo) {

    }
}
