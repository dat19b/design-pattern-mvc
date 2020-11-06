package mvc.view;

import mvc.controller.StudentController;
import mvc.model.repository.IObserver;

public class StudentView implements IObserver {

    public void printStudentDetails(String studentName, String studentRollNo){
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }

    @Override
    public void update(StudentController controller) {
        System.out.println("I Have been notified");
        controller.updateView();
    }
}
