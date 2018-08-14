package list.arrayList;

import java.util.List;

/**
 * ArrayList theory
 * It provides dynamic arrays, though it can be slower than conventional arrays, it's helpful in programs where
 * lots of manipulation in the array is needed
 *
 * ArrayList extends AbstractList class and implements List, RandomAccess, Cloneable & Serializable interfaces
 *
 * ArrayList is not synchronised
 *
 * Constructors in ArrayList
 * ArrayList()
 * ArrayList(int size)
 * ArrayList(Collection c)
 *
 *
 */
public class ClassRoom {

    private int classId;
    private List<Student> students;

    public ClassRoom(int classId, List<Student> students) {
        this.classId = classId;
        this.students = students;
    }

    public int getClassId() {
        return classId;
    }

    public List<Student> getStudents() {
        return students;
    }
}
