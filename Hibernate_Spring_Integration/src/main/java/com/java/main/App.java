package com.java.main;


import com.java.dao.EmployeeDao;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        EmployeeDao employeeDao = context.getBean(EmployeeDao.class);
        employeeDao.performOperations();
        context.close();
    }
}