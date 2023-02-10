package by.itacademy.alinadarenskikh.javabasics.oop;

import com.github.javafaker.Faker;
import com.github.javafaker.IdNumber;

public class Customer {
    private int id;
    private String lastName;
    private String name;
    private String fathersName;
    private String address;
    private String cardNumber;
    private String bankAccount;

    public Customer() {
    }

    public Customer(int id, String lastName, String name, String fathersName, String address, String cardNumber, String bankAccount) {
        this.id = id;
        this.lastName = lastName;
        this.name = name;
        this.fathersName = fathersName;
        this.address = address;
        this.cardNumber = cardNumber;
        this.bankAccount = bankAccount;
    }

    public int getId() {
        return id;

    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", \nname='" + name + '\'' +
                ", \nfathersName='" + fathersName + '\'' +
                ", \naddress='" + address + '\'' +
                ", \ncardNumber=" + cardNumber +
                ", \nbankAccount='" + bankAccount + '\'' +
                '}';
    }
}
