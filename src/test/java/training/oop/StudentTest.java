package training.oop;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;
import static org.junit.Assert.*;

public class StudentTest  {

    @Test
    public void should_student_introduce_as_expect() {
        String answer = "My name is Tom. I am 18 years old. I am a student of class 2. Coding for the glory of OOCL.";
        Student student = new Student("Tom", 18);
        Teacher teacher = new Teacher("Woody", 30);
        Class class_ = new Class(2);

        teacher.TeachClass(class_);
        student.JoinClass(class_);

        assertEquals(student.Introduce(), answer);
    }

    @Test
    public void should_student_welcome_when_student_join_class() {
        Student student = new Student("Tom", 18);
        Student newStudent = new Student("Jim", 20);
        Class class_ = new Class(2);
        Teacher teacher = new Teacher("Woody", 30);
        String answer = "My name is Tom. I am 18 years old. I am a student of class 2. Coding for the glory of OOCL. Welcome Jim join Class 2.";

        teacher.TeachClass(class_);
        student.JoinClass(class_);
        newStudent.JoinClass(class_);

        assertEquals(student.getWelcomeMessage(), answer);
    }

    @Test
    public void should_student_say_when_assign_leader_to_class() {
        Student student = new Student("Tom", 18);
        Student newStudent = new Student("Jim", 20);
        Class class_ = new Class(2);
        Teacher teacher = new Teacher("Woody", 30);
        String answer = "My name is Tom. I am 18 years old. I am a student of class 2. Coding for the glory of OOCL. Jim is the leader of Class 2.";

        teacher.TeachClass(class_);
        student.JoinClass(class_);
        newStudent.JoinClass(class_);
        class_.assignStudentAsLeader(newStudent);

        System.out.println(student.getAssignClassLeaderMessage());
        System.out.println(answer);

        assertEquals(student.getAssignClassLeaderMessage(), answer);
    }
}
