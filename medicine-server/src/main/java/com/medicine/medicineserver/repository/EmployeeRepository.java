package com.medicine.medicineserver.repository;

import com.medicine.medicineserver.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
//继承JpaRepository来完成对数据库的操作
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
