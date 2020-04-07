package training.oop;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;
import static org.junit.Assert.*;

public class TeacherTest {

    @Test
    public void should_teacher_introduce_as_expect() {
        String answer = "My name is Tom. I am 18 years old. Teaching for the future of world.";
        Teacher teacher = new Teacher("Tom", 18);

        assertThat(teacher.Introduce().equals(answer));
    }

    @Test
    public void should_teacher_welcome_when_student_join_class() {
        Student student = new Student("Tom", 18);
        Class class_ = new Class(2);
        Teacher teacher = new Teacher("Woody", 30);
        String answer = "My name is Woody. I am 30 years old. Teaching for the future of world. Welcome Tom join Class 2.";

        teacher.TeachClass(class_);
        student.JoinClass(class_);

        assertEquals(teacher.getWelcomeMessage(), answer);
    }

    @Test
    public void should_teacher_say_when_assign_leader_to_class() {
        Student student = new Student("Tom", 21);
        Class class_ = new Class(2);
        Teacher teacher = new Teacher("Woody", 30);
        String answer = "My name is Woody. I am 30 years old. Teaching for the future of world. Tom is the leader of Class 2.";

        teacher.TeachClass(class_);
        student.JoinClass(class_);
        class_.assignStudentAsLeader(student);

        assertEquals(teacher.getAssignClassLeaderMessage(), answer);
    }
}