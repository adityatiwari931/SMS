package School.Mangement.System;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("======WELCOME TO SCHOOL======");
        Teacher aadi = new Teacher(1,"adi",3000);
        Teacher amit = new Teacher(1,"amit",3000);
        Teacher ram = new Teacher(1,"ram",3000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(aadi);
        teacherList.add(amit);
        teacherList.add(ram);


        Student kl = new Student(1,"kl",1);
        Student vk = new Student(1,"vk",1);
        Student msd = new Student(1,"ram",1);

        List<Student> studentList = new ArrayList<>();
        studentList.add(kl);
        studentList.add(vk);
        studentList.add(msd);

        School SVM = new School(teacherList,studentList);

        kl.payfees(3000);
        vk.payfees(4000);
        System.out.println("Total money earned by SVM is "+SVM.getTotalMoneyEarned());



    }
}
