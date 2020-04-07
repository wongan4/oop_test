package training.oop;

public class Student extends Person{
    private String target;
    private int classNumber;

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Student(String name, int age, String target, int classNumber) {
        super(name, age);
        this.target = target;
        this.classNumber = classNumber;
    }

    @Override
    public String Introduce() {
        return "My name is " + this.name +
                ". I am " + this.age +
                " years old. " +
                "I am a student of class " + this.classNumber + ". " +
                "Coding for the glory of " + this.target + "\n";
    }
}
