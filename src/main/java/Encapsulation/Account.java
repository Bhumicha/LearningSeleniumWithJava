package Encapsulation;

public class Account {
    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    private int accNo;
    private String name;
    private double amount;

    // manually creating getter and setter
/*
    void setAccNo(int accNo)
    {
        this.accNo=accNo; // this keyword represents class
    }
    int getAccNo()
    {
        return accNo;
    }

 */

}
