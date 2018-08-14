package list.LinkedList;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * LinkedList theory
 * Linear DS where elements are not stored in contiguous locations
 * Constructors
 * LinkedList()
 * LinkedList(Collection c)
 *
 */
public class Runner {

    public static void main(String[] args) {

        List<Student> students = new LinkedList<>();
        students.add(new Student("Ramendu", 21));
        students.add(new Student("Sam", 22));
        students.add(new Student("John", 11));

        // Ways to iterate Linked List

        // Enhanced For Loop
        for(Student student : students) {
            System.out.println(student.toString());
        }

        // Using Lambda
        students.forEach(student -> System.out.println(student.toString()));

        // Sorting anon comparator
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        // Sorting using Lambda
        Collections.sort(students, (s1, s2) -> s1.getAge() - s2.getAge());
        students.forEach(student -> System.out.println(student.toString()));
    }
}