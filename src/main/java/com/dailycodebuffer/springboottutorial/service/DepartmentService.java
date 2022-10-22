package com.dailycodebuffer.springboottutorial.service;

import com.dailycodebuffer.springboottutorial.entity.Department;

public interface DepartmentService {
//     static Department saveDepartment(Department department) {
//          return null;
//     }

     public DepartmentRepository departmentRepository;
     default Department saveDepartment(Department department) {
         return departmentRepository.save(department);
     }
}
