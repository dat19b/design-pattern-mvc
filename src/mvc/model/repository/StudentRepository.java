package mvc.model.repository;

import mvc.controller.IStudentController;
import mvc.controller.StudentController;
import mvc.model.Student;
import twitter.observers.ISubscriber;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentRepository implements IStudentRepository {

    Student student;
    private Set<IObserver> observers = new HashSet<>();

    public StudentRepository(){
        student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
    }

    public void addObserver(IObserver s){
        observers.add(s);
    }

    public void removeObserver(IObserver s){
        observers.remove(s);
    }

    public String getName(){
        return student.getName();
    }

    public String getRollNo(){
        return student.getRollNo();
    }

    @Override
    public void setName(IStudentController cs, String name) {
        student.setName(name);
        for (IObserver s : observers){
            s.update();
        }


        //tell(sc);
    }

    @Override
    public void setRollNo(String rollNo) {

    }

    private void tell(StudentController cs){
        for (IObserver s : observers){
            s.update(cs);
        }
    }
}
