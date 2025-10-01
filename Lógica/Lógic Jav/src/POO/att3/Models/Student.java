package att3.Models;

import att3.Contracts.IPayable;

public class Student extends Person implements IPayable{
    
    private double grade;

    public Student(String name, int age, double grade){
        super(name, age);
        this.grade = grade;
    }

    public double getGrade(){
        return this.grade;
    }

    public void setGrade(double grade){
        if (grade >= 0) this.grade = grade;
    }

    @Override
    public String toString(){
        return super.toString() + ", grade: " + getGrade();
    }

    @Override
    public boolean pay(double price){
        return price >= 0 ? true : false;
    }

    public String study(){
        return getName() + " está estudando";
    }
}
