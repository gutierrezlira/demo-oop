package by.itacademy.alinadarenskikh.javabasics.oop;


public class Student extends User {
    int grant;

    public int getGrant() {
        return grant;
    }

    public void setGrant(int grant) {
        this.grant = grant;
    }


    public int getIncome(){
        if (grant > 0)
            return grant;
        else return 0;

    }
}
