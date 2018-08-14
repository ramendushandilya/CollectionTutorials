package list.arrayList;

import java.util.Comparator;

public class TeacherAllComparator implements Comparator<Teacher> {

    public int compare(Teacher o1, Teacher o2) {

        int c;
        c = o1.getName().compareTo(o2.getName());
        if(c == 0)
            c = o1.getAge() - o2.getAge();
        return c;
    }

}