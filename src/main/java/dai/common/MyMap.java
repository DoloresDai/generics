package main.java.dai.common;

import main.java.dai.model.Student;

import java.util.Set;

public interface MyMap<Student, Teacher> {
    public Teacher put(Student student, Teacher teacher);

    public Teacher get(Student student);

    public int size();

    public boolean isEmpty();

    public boolean containsTeacher(Teacher teacher);

    public boolean containsStudent(Student student);

    public Set<Student> keySet();
}
