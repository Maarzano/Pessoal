package att3.Models;

import att3.Contracts.IPayable;

public class Student extends Person implements IPayable{
    
    private double grade;
    private double amount;

    public Student(String name, int age, double grade, double amount){
        super(name, age);
        this.grade = grade;
        this.amount = amount;
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
        if (price >= 0 && price <= amount){
            amount -= price;
            return true;
        }
        return false;
    }

    public double getAmount(){
        return this.amount;
    }

    public String study(){
        return getName() + " está estudando";
    }
}
