package mvc.controller;

import mvc.model.Student;
import mvc.model.repository.IStudentRepository;
import mvc.view.StudentView;

public class StudentController {

    private IStudentRepository model;
    private StudentView view;

    public StudentController(IStudentRepository model, StudentView view){
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name){
        model.setName(this, name);
    }

    public String getStudentName(){
        return model.getName();
    }

    public void setStudentRollNo(String rollNo){
        model.setRollNo(rollNo);
    }

    public String getStudentRollNo(){
        return model.getRollNo();
    }

    public void updateView(){
        view.printStudentDetails(model.getName(), model.getRollNo());
    }
}
