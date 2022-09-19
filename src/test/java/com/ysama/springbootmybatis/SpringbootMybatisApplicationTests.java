package com.ysama.springbootmybatis;

import com.ysama.springbootmybatis.mapper.EmployeeMapper;
import com.ysama.springbootmybatis.pojo.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class SpringbootMybatisApplicationTests {

    @Autowired
    private EmployeeMapper employeeMapper;

    @BeforeEach
    public void insertEmployee(){
        Employee emp = new Employee();
        emp.setEmpid(1);
        emp.setFirstName("Manik");
        emp.setLastName("Magar");
        employeeMapper.insertEmployee(emp);

        System.out.println("insertEmployee");
    }


    @Test
    public void testEmployee(){
        System.out.println("testEmployee");
        Employee emp = employeeMapper.getEmployeeName(1);
        Assertions.assertNotNull(emp);
        System.out.println(emp);
    }

    @Test
    void contextLoads() {
    }

}
