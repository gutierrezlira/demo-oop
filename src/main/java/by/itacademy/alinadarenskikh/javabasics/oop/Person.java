package by.itacademy.alinadarenskikh.javabasics.oop;

public class Person extends Student{
    int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getIncome(){
        return grant+salary;
    }
}
