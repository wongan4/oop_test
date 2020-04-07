package training.oop;

public class Teacher extends Person{
    private String teachingTarget;

    public String getTeachingTarget() {
        return teachingTarget;
    }

    public void setTeachingTarget(String teachingTarget) {
        this.teachingTarget = teachingTarget;
    }

    public Teacher(String name, int age, String teachingTarget) {
        super(name, age);
        this.teachingTarget = teachingTarget;
    }

    @Override
    protected String Introduce() {
        return "My name is " + this.name + ". I am " + this.age + " years old. Teaching for " + this.teachingTarget + ".\n";
    }
}
