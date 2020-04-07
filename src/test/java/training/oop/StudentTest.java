package training.oop;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class StudentTest  {

    @Test
    public void should_student_introduce_as_expect() {
        String answer = "My name is Tom. I am 18 years old. I am a student of class 2. Coding for the glory of OOCL.\n";
        Student s = new Student("Tom", 18, "OOCL", 2);

        assertThat(s.Introduce().equals(answer));
    }
}
