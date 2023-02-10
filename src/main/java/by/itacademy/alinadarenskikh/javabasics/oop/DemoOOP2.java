package by.itacademy.alinadarenskikh.javabasics.oop;

import com.github.javafaker.Faker;

public class DemoOOP2 {
    public static void main(String[] args) {

        User user1 = new User();
        Faker fake = new Faker();

        user1.setName(fake.harryPotter().character());
        System.out.println("Name: " + user1.getName());

        Student student1 = new Student();
        student1.setName(fake.harryPotter().character());
        student1.setGrant(200);
        System.out.println(student1.getName() + "\ngrant: " + student1.getGrant());

        Person person1 = new Person();
        person1.setName(fake.harryPotter().character());
        person1.setGrant(250);
        person1.setSalary(600);

        System.out.println(person1.getName() + "\ngrant: " + person1.getGrant() + "\nSalary: " + person1.getSalary());
        System.out.println("Total income: " + person1.getIncome());

    }
}