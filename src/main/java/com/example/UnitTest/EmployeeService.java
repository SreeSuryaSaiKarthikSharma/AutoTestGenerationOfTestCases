package com.example.UnitTest;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


@org.springframework.stereotype.Service
public class EmployeeService {

    @Autowired Repository employeeRepository;

    public List<EmployeeModel> getAllEmployee() {
        return employeeRepository.findAll();
    }

    public EmployeeModel getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public EmployeeModel createEmployee(EmployeeModel employeeModel) {
        return employeeRepository.save(employeeModel);
    }

    public EmployeeModel updateEmployee(Long id, EmployeeModel employeeModel) {
        employeeModel.setEmp_Id(id);
        return employeeRepository.save(employeeModel);
    }

    public EmployeeModel deleteEmployee(EmployeeModel employeeModel) {
        employeeRepository.delete(employeeModel);
		return employeeModel;
    }

//	public static void employeeRepository() {
//		// TODO Auto-generated method stub
//		
//	}
}

