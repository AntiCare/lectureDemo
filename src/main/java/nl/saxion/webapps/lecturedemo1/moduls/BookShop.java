package nl.saxion.webapps.lecturedemo1.moduls;

import java.io.Serializable;

public class BookShop implements Serializable {
    private Integer id;
    private String shopName;
    private int employeeNum;
    private String address;
    private String phoneNumber;

    public BookShop(int id ,String shopName,int employeeNum,String address,String phoneNumber) {
        this.id=id;
        this.shopName=shopName;
        this.employeeNum = employeeNum;
        this.address=address;
        this.phoneNumber=phoneNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(int employeeNum) {
        this.employeeNum = employeeNum;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "id=" + id +
                ", shopName='" + shopName + '\'' +
                ", employeeNum=" + employeeNum +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
