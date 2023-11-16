package School.Mangement.System;
/*
Created by Aditya on 15/11/2023
This is a student class which contains attribute like id,name,grade,feepaid,feetotal
 this class keep track student data
 */
public class Student {
    private int id;
    private String name;
    private int grade;
    private static int feespaid;
    private static int totalfees;

    /**
     * this constructor is initilising the every student object with thier data
     * @param id
     * @param name
     * @param grade
     */
    public Student(int id,String name,int grade){
        this.feespaid = 0;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    /**
     * this is a seter method that updating the grade of student
     * @param grade
     */
    public void setGrade(int grade){
        this.grade = grade;
    }

    /**
     * this seter method for updating the fees of student after every instalment of fees he paid
     * @param fees that student will pay
     */
    public static void payfees(int fees){
        feespaid+=fees;
        School.updateTotalMoneyEarned(feespaid);

    }

    /**
     *
     * @return return the id of the student
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return return the name of student
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return return the grade of student
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return return the fees paid by student
     */
    public int getFeespaid() {
        return feespaid;
    }

    /**
     *
     * @return return the total fees have been paid yet
     */
    public int getTotalfees() {
        return totalfees;
    }

    /**
     * return the remainig fees
     * @return
     */
    public int remainingfees(){
        return totalfees-feespaid;
    }
}
