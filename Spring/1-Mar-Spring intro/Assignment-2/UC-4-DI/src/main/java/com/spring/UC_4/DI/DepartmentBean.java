package com.spring.UC_4.DI;



import org.springframework.stereotype.Component;

@Component
public class DepartmentBean {
    private String departmentName = "IT Department";

    public String getDepartmentName() {
        return departmentName;
    }
}

