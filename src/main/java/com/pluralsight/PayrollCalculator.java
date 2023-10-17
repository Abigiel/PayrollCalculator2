package com.pluralsight;
import java.io.*;

public class PayrollCalculator {
    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("src/main/resources/employees.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String input;

            while((input= bufferedReader.readLine()) != null){
                String [] employees = input.split("\\|");
                int employeeId = Integer.parseInt(employees[0]);
                String name = employees[1];
                double hoursWorked = Double.parseDouble(employees[2]);
                double payRate = Double.parseDouble(employees[3]);

                Employee reader = new Employee(employeeId, name, hoursWorked, payRate);


                System.out.printf( "Employee Id: %d, Name: %s, GrossPay: $%.2f%n", reader.getEmployeeId(), reader.getName(), reader.getGrossPay());

            } bufferedReader.close();

        } catch (IOException e) {
           e.printStackTrace();
        }
    }
}
