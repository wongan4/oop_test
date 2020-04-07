package training.oop;

public class Student extends Person{
    private String company;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Student(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }

    @Override
    public String Introduce() {
        return "My name is " + this.name + ". I am " + this.age + " years old. Coding for the glory of " + this.company + "\n";
    }
}
