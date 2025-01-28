package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
class Employee{

    private String employeeName;
    private double salary;

    public Employee(String employeeName, double salary) {
        this.salary = salary;
        this.employeeName = employeeName;
    }

}

public class EmployeeMain {

    public static void main(String[] args){
        Employee e1 = new Employee("A", 100);
        Employee e2 = new Employee("B", 200);
        var k = new ArrayList<Employee>();
        k.add(e1);
        k.add(e2);
        k.forEach(employee -> {
            employee.setSalary(employee.getSalary()*1.2);
        });
        k.forEach(employee -> {
            System.out.println(employee.getSalary());
        });
    }

}
