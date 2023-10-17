package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private double hoursWorked;
    private double payRate;

        public Employee(int employeeId,String name, double hoursWorked, double payRate){
            this.employeeId = employeeId;
            this.hoursWorked = hoursWorked;
            this.name = name;
            this.payRate =payRate;
        }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public String getName() {
        return name;
    }

    public void setEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getGrossPay() {
        return(payRate * hoursWorked);
    }
}



