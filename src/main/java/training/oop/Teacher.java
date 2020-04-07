package training.oop;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person{
    private List<Class> taughtClasses;
    private String welcomeMessage;
    private String assignClassLeaderMessage;

    public Teacher(String name, int age) {
        super(name, age);
        this.taughtClasses = new ArrayList<Class>();
    }

    public String getAssignClassLeaderMessage() {
        return assignClassLeaderMessage;
    }

    public void setAssignClassLeaderMessage(Student student, Class class_) {
        this.assignClassLeaderMessage = this.Introduce() + student.getName() + " is the leader of Class " + class_.getClassNumber() + ".";
    }

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public void setWelcomeMessage(Student student, Class class_) {
        this.welcomeMessage = this.Introduce() + " Welcome " + student.getName() + " join Class " + class_.getClassNumber() + ".";
    }

    protected void TeachClass(Class class_) {
        if (this.taughtClasses.size() < 5) {
            class_.addTeacherToClass(this);
        }
        else {
            System.out.println("ERROR: 1 teacher can only teach at most 5 classes");
        }
    }

    @Override
    protected String Introduce() {
        return "My name is " + this.name + ". I am " + this.age + " years old. Teaching for the future of world.\n";
    }
}
