package main.java.dai.common;

import main.java.dai.model.Student;
import main.java.dai.model.Teacher;

public class MyEntry<Student, Teacher> {
    private Teacher teacher;
    private Student student;



    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
