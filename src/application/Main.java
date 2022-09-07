package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Name: ");
        student.setName(sc.nextLine());
        System.out.print("First grade: ");
        student.addFirstGrade(sc.nextDouble());
        System.out.print("Second grade: ");
        student.addSecondAndThirdGrade(sc.nextDouble());
        System.out.print("Third grade: ");
        student.addSecondAndThirdGrade(sc.nextDouble());

        System.out.println(student.finalGrade());

        sc.close();
    }
}
