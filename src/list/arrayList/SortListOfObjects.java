package list.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A list of objects can be sorted using below two methods
 * 1. Make the Object class to implement Comparable
 * 2. Using Comparator
 */
public class SortListOfObjects {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Ramendu", 20));
        students.add(new Student("John", 21));
        students.add(new Student("Sam", 19));

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Sam", 45));
        teachers.add(new Teacher("Bam", 35));
        teachers.add(new Teacher("Jam", 25));
        teachers.add(new Teacher("Dam", 55));

        // Before sorting
        printList(students);

        // Now since the Student class implements Comparable interface, we can use Collections.sort() method
        Collections.sort(students);

        System.out.println("####After sorting the students list");
        // After Sorting
        printList(students);

        // Sort the Teachers by their name
        Collections.sort(teachers, new TeacherNameComparator());

        System.out.println("####After sorting the Teacher List by Name");
        printTeachers(teachers);

        // Sort the Teachers by their age
        Collections.sort(teachers, new TeacherAgeComparator());

        System.out.println("####After sorting the teachers list by their age");
        printTeachers(teachers);

        // Sort the Teachers by both the fields
        Collections.sort(teachers, new TeacherAllComparator());

        System.out.println("$$$$$ After sorting Teachers by all fields");
        printTeachers(teachers);
    }

    private static void printTeachers(List<Teacher> teachers) {

        for(Teacher teacher : teachers) {
            System.out.println(teacher.toString());
        }
    }

    private static void printList(List<Student> students) {

        for(Student student : students) {
            System.out.println(student.toString());
        }
    }

}