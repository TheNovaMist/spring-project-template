package com.ysama.springbootmybatis.pojo;

public class Employee {
    private long empid;
    private String firstName;
    private String lastName;
    public long getEmpid() {
        return empid;
    }
    public void setEmpid(long empid) {
        this.empid = empid;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}