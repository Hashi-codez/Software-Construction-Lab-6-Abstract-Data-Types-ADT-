/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hashir Azeem
 */
import java.util.ArrayList;
import java.util.List;

/**
 * StudentCollectionImpl.java
 *
 * A concrete implementation of the StudentCollection ADT, backed by an
 * ArrayList<Student>. This is the "HOW" behind the "WHAT" declared in
 * the StudentCollection interface. Note this class reuses the Student
 * class from Lab Task 2 -- its private fields and getters (getId(),
 * getName(), getCgpa()) are exactly what makes this class possible
 * without needing to touch Student's internals.
 */
public class StudentCollectionImpl implements StudentCollection {

    private List<Student> students;

    public StudentCollectionImpl() {
        students = new ArrayList<>();
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public boolean removeStudent(int id) {
        return students.removeIf(s -> s.getId() == id);
    }

    @Override
    public Student findStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    @Override
    public int getSize() {
        return students.size();
    }

    @Override
    public boolean isEmpty() {
        return students.isEmpty();
    }
}