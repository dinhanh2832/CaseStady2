package model;

public class Account {
    private String userName;
    private int passWork;
    private double money;
    private double time;
    private double unitPrice = 10000;

    public Account(String userName, int passWork,double money) {
        this.userName = userName;
        this.passWork = passWork;
        this.money = money;
    }

    public Account() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPassWork() {
        return passWork;
    }

    public void setPassWork(int passWork) {
        this.passWork = passWork;
    }
    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
    public double getTime() {
        time = money/unitPrice;
        return time;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Tên tài khoản: " + userName +
                ", Mật khẩu: " + passWork +
                ", Số tiền khả dụng: " + money +
                ", Thời gian sử dụng: " + time;
    }
}
