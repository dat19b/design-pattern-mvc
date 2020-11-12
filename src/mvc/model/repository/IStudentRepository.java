package mvc.model.repository;

import mvc.controller.StudentController;
import mvc.model.Student;

public interface IStudentRepository {

    //Student retriveStudentFromDatabase();

    String getName();

    String getRollNo();

    void setName(StudentController cs, String name);

    void setRollNo(String rollNo);

    void addObserver(IObserver s);

    void removeObserver(IObserver s);


}
