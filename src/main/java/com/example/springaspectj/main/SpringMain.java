package com.example.springaspectj.main;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.springaspectj.service.EmployeeService;


@SpringBootApplication
public class SpringMain {
    public static void main(String[] args){
        ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("spring.xml");

        EmployeeService employeeService=ctx.getBean("employeeService",EmployeeService.class);

        System.out.print(employeeService.getEmployee().getName());

        employeeService.getEmployee().setName("Kim");

        //employeeService.getEmployee().throwException();

        ctx.close();

    }

}