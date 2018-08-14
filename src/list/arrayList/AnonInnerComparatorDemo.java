package list.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnonInnerComparatorDemo {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Ramendu", 20));
        students.add(new Student("John", 21));
        students.add(new Student("Sam", 19));

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //return o1.getName().compareTo(o2.getName());
                int c;
                c = o1.getAge() - o2.getAge();
                if(c == 0) {
                    c = o1.getName().compareTo(o2.getName());
                }
                return c;
            }
        });

        for(Student student : students) {
            System.out.println(student.toString());
        }
    }
}