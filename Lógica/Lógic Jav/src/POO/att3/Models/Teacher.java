package att3.Models;

import java.util.List;

import att3.Contracts.INotifiable;

public class Teacher extends Person implements INotifiable{

    private List<Student> listOfStudents;

    public Teacher(String nome, int age, List<Student> list){
        super(nome, age);
        this.listOfStudents = list;
    }

    public List<Student> getListOfStudents(){
        return this.listOfStudents;
    }

    @Override
    public String toString(){
        return super.toString() + ", tem " + getListOfStudents().size() + ", estudantes";
    }

    @Override
    public void notify(String message){
        System.out.printf("Professor %s recebeu uma notificação: %s%n", getName(), message);
    }

    public String teach(){
        return getName() + " está ensinando";
    }

    public String teach(Student student){
        return teach() + " o aluno " + student;
    }


}
