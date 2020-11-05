package mvc.model.repository;

import mvc.model.Student;

public interface IStudentRepository {

    //Student retriveStudentFromDatabase();

    String getName();

    String getRollNo();

    void setName(String name);

    void setRollNo(String rollNo);
}
