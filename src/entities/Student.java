package entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {

    private String name;
    private double grade;

    public void addFirstGrade(double grade) {
        if (grade <= 30) {
            this.grade += grade;
        } else {
            this.grade = 0.00;
        }
    }
    public void addSecondAndThirdGrade(double grade){
        if(grade <= 35){
            this.grade += grade;
        } else {
            this.grade = 0.00;
        }
    }
    public String finalGrade(){
        if(this.grade >= 60){
            return "FINAL GRADE = " + String.format("%.2f%n", this.grade)
                    + "PASS";
        }
        else{
            return "FAILED \n"
                    + "MISSING "
                    + String.format("%.2f", 60 - this.grade) + " POINTS";
        }
    }
}
