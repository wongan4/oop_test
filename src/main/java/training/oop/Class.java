package training.oop;

import java.util.ArrayList;
import java.util.List;

public class Class {
    protected int classNumber;
    protected List<Student> studentList;
    protected Student classLeader;
    protected Teacher teacher;

    public Class(int classNumber) {
        this.classNumber = classNumber;
        this.studentList = new ArrayList<>();
        this.classLeader = null;
        this.teacher = null;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    protected void addStudentToClass(Student student) {
        if (!this.studentList.contains(student)) {
            this.teacher.setWelcomeMessage(student, this);
            if (studentList.size() > 0) {
                this.studentList.forEach(studentInClass -> studentInClass.setWelcomeMessage(student, this));
            }
            this.studentList.add(student);
        }
        else {
            System.out.println("ERROR: student already in class " + this.classNumber);
        }
    }

    protected void addTeacherToClass(Teacher teacher) {
        if (this.teacher == null) {
            this.teacher = teacher;
        } else {
            System.out.println("ERROR: 1 class should only has 1 teacher");
        }
    }

    protected void assignStudentAsLeader(Student student) {
        if (this.studentList.contains(student) && this.classLeader == null) {
            this.teacher.setAssignClassLeaderMessage(student, this);
            if (studentList.size() > 0) {
                this.studentList.forEach(studentInClass -> studentInClass.setAssignClassLeaderMessage(student, this));
            }
            this.classLeader = student;
        }
        else {
            System.out.println("ERROR: student not in this class or this class already has class leader");
        }
    }

    public Student getClassLeader() {
        return classLeader;
    }

    public void setClassLeader(Student classLeader) {
        this.classLeader = classLeader;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
