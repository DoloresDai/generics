package main.java.dai.model;

public class Student extends Person {
    protected int score;

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "姓名："+ name +"，年龄："+age+ "，成绩："+score;
    }
}
