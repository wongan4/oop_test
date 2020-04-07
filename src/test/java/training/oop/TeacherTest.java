package training.oop;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class TeacherTest {

    @Test
    public void should_teacher_introduce_as_expect() {
        String answer = "My name is Tom. I am 18 years old. Teaching for the future of world.\n";
        Teacher teacher = new Teacher("Tom", 18, "the future of world");

        assertThat(teacher.Introduce().equals(answer));
    }
}