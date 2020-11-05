package mvc;

import mvc.controller.StudentController;
import mvc.model.Student;
import mvc.view.StudentView;

public class Main {

    public static void main(String[] args) {
        Student model = retriveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        // eventloop
        controller.updateView();
        controller.setStudentName("Claus");
        controller.updateView();

    }


    private static Student retriveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }


}
