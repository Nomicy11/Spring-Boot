package com.spring.UC_4.DI;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
    private String name = "Nomicy Gupta";

    @Autowired
    private DepartmentBean departmentBean;

    public void showEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + departmentBean.getDepartmentName());
    }
}
