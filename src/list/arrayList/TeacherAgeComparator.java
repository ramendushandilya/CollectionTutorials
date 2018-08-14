package list.arrayList;

import java.util.Comparator;

public class TeacherAgeComparator implements Comparator<Teacher> {

    @Override
    public int compare(Teacher teacherOne, Teacher teacherTwo) {
        return teacherOne.getAge() - teacherTwo.getAge();
    }
}