package list.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingLamda {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Ramendu", 20));
        students.add(new Student("John", 21));
        students.add(new Student("Sam", 19));

        Collections.sort(students, (s1, s2) -> s1.getName().compareTo(s2.getName()));

        students.forEach((student -> System.out.println(student.toString())));
    }
}