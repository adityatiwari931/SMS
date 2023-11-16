package School.Mangement.System;

import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * this constructor initialise the School object
     * @param teacher
     * @param student
     */
    public School(List<Teacher> teacher, List<Student> student) {
        this.teachers = teacher;
        this.students = student;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     * return the list of the teacher
     * @return
     */
    public List<Teacher> getTeacher() {
        return teachers;
    }

    /**
     * add new teacher to the list
     * @param teacher
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     * return the list of the student
     * @return
     */
    public List<Student> getStudent() {
        return students;
    }

    /**
     * add a student to the school
     * the student argument add student
     * @param student
     */

    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * return the total money earned
     * @return
     */
    public  int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * update the money earned by the school
     * @param MoneyEarned money that supposed to be added
     */
    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned+=moneyEarned;
    }

    /**
     * return the total money spent by the school
     * @return
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     *update the money spent by the school
     * which is given as salary to the teacher
     * @param totalMoneySpent
     */
    public void updateTotalMoneySpent(int moneySpent) {
//        totalMoneySpent+=moneySpent;
        totalMoneyEarned-=moneySpent;
    }
}
