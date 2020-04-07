package training.oop;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class StudentTest  {

    @Test
    public void student_test() {
        String answer = "My name is Tom. I am 18 years old. Coding for the glory of OOCL";
        Student s = new Student("Tom", 18, "OOCL");

        assertThat(s.Introduce().equals(answer));
    }
}
