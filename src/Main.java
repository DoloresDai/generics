import main.java.dai.model.Student;
import main.java.dai.model.Teacher;
import main.java.dai.common.TaSMap;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Student topStudent1 = new Student("超1",20,90);
        Student topStudent2 = new Student("超2",20,92);
        Student topStudent3 = new Student("超3",20,94);
        Teacher teacher1 = new Teacher("老师1",50,"语文");
        Teacher teacher2 = new Teacher("老师2",55,"数学");
        TaSMap<Student, Teacher> goodStudent = new TaSMap<>();
        goodStudent.put(topStudent1,teacher1);
        goodStudent.put(topStudent2,teacher2);
        goodStudent.put(topStudent3, teacher2);

        Iterator<Student> iTopStudent = goodStudent.keySet().iterator();
        while (iTopStudent.hasNext()){
            System.out.print("好学生名单有：");
            System.out.println(iTopStudent.next());
        }
    }
}
