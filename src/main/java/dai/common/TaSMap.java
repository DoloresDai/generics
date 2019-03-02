package main.java.dai.common;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TaSMap<Student, Teacher> implements MyMap<Student, Teacher> {
    private HashSet<MyEntry<Student, Teacher>> set = new HashSet<>();

    @Override
    public Teacher put(Student student, Teacher teacher) {
        MyEntry<Student, Teacher> myEntry = new MyEntry<>();
        myEntry.setStudent(student);
        myEntry.setTeacher(teacher);
        set.add(myEntry);
        return myEntry.getTeacher();
    }

    @Override
    public Teacher get(Student student) {
        Iterator<MyEntry<Student, Teacher>> iterator = set.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getStudent().equals(student)) {
                return iterator.next().getTeacher();
            }
        }
        return null;
    }

    @Override
    public int size() {
        return set.size();
    }

    @Override
    public boolean isEmpty() {
        return set.isEmpty();
    }

    @Override
    public boolean containsTeacher(Teacher teacher) {
        Iterator<MyEntry<Student, Teacher>> iterator = set.iterator();
        while (iterator.hasNext()) {
            return iterator.next().getTeacher().equals(teacher);
        }return false;
    }

    @Override
    public boolean containsStudent(Student student) {
        Iterator<MyEntry<Student, Teacher>> iterator = set.iterator();
        while (iterator.hasNext()) {
            return iterator.next().getStudent().equals(student);
        }return false;

    }

    @Override
    public Set<Student> keySet() {
        Set<Student> students = new HashSet<>();
        for (MyEntry<Student, Teacher> elememt : set) {
            students.add(elememt.getStudent());
        }return students;
    }
}
