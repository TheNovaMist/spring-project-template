package com.ysama.springbootmybatis.mapper;

import com.ysama.springbootmybatis.pojo.Employee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface EmployeeMapper {
@Insert("insert into employee (empid, first_name, last_name) values(#{empid}, #{firstName}, #{lastName})")
    void insertEmployee(Employee employee);


@Select("select distinct first_name, last_name from employee where empid = #{empid}")
    Employee getEmployeeName(@Param("empid") long empid);
}
