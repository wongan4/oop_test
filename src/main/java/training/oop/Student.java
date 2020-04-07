package training.oop;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
    private int classNumber;
    private List<Class> joinedClasses;
    private String welcomeMessage;
    private String assignClassLeaderMessage;

    public String getAssignClassLeaderMessage() {
        return assignClassLeaderMessage;
    }

    public void setAssignClassLeaderMessage(Student student, Class class_) {
        this.assignClassLeaderMessage = this.Introduce() + " " + student.getName() + " is the leader of Class " + class_.getClassNumber() + ".";
    }

    public Student(String name, int age) {
        super(name, age);
        this.joinedClasses = new ArrayList<Class>();
    }

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public void setWelcomeMessage(Student student, Class class_) {
        this.welcomeMessage = this.Introduce() + " Welcome " + student.getName() + " join Class " + class_.getClassNumber() + ".";
    }

    @Override
    protected String Introduce() {
        return "My name is " + this.name +
                ". I am " + this.age +
                " years old. " +
                "I am a student of class " + this.classNumber + ". " +
                "Coding for the glory of OOCL.";
    }

    protected void JoinClass(Class class_) {
        class_.addStudentToClass(this);
        this.classNumber = class_.getClassNumber();
        this.joinedClasses.add(class_);
    }
}
