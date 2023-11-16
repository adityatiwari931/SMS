package School.Mangement.System;

public class Teacher {
    private int id;
    private String name;
    private int salary;

    /**
     * this constructor initialising the attributes of teacher at the time of object creation
     * @param id
     * @param name
     * @param salary
     */
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
     * used to set the salary of teacher
     * @param salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * @return the id of the teacher
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return the name of the teacher
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return the Salary of the teacher
     */
    public int getSalary() {
        return salary;
    }
}
