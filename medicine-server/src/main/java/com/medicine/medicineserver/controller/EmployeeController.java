package com.medicine.medicineserver.controller;

import com.medicine.medicineserver.entity.User;
import com.medicine.medicineserver.repository.EmployeeRepository;
import com.medicine.medicineserver.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//提交
//完成
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/getByEmployee/{id}")
    public User getByEmployee(@PathVariable(name = "id") Integer id){
        User user = userRepository.findById(id).get();
        return user;
    }

    @GetMapping("/insertEmployee")
    public User insertEmployee(User user){
        User one = userRepository.save(user);
        return one;
    }

}
