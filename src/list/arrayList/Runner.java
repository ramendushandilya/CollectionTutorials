package list.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Ramendu", 20));
        students.add(new Student("John", 21));
        students.add(new Student("Sam", 19));

        ClassRoom classRoom = new ClassRoom(1, students);

        students = classRoom.getStudents();

        /**
         * Ways to iterate an array list in Java
         * 1. Normal For Loop
         * 2. Enhanced For Loop
         * 3. While Loop
         * 4. Iterator
         */

        // Normal For Loop
        System.out.println("#####Looping using For Loop");
        for(int i = 0 ; i < students.size() ; i++) {
            System.out.println(students.get(i).toString());
        }

        // Enhanced For Loop
        System.out.println("\n#####Looping using Enhanced For Loop");
        for(Student student : students) {
            System.out.println(student.toString());
        }

        // Using While Loop
        System.out.println("\n#####Looping using While Loop");
        int i = 0;
        while (students.size() > i) {
            System.out.println(students.get(i).toString());
            i++;
        }

        // Using Iterator
        System.out.println("\n#####Looping using Iterator");
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }

    }
}
