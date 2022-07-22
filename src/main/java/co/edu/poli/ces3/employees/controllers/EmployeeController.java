package co.edu.poli.ces3.employees.controllers;


import co.edu.poli.ces3.employees.dao.EmployeeDao;
import co.edu.poli.ces3.employees.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    @RequestMapping(value = "test")
    public String test(){
        return "Hola Spring Boot";
    }

    @RequestMapping(value = "api/employees", method = RequestMethod.GET)
    public List<Employee> getEmployees(){
        /*ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"oscar",
                                    "mesa", "oscar@gmail.com",
                                    new Date(2022,7,10),
                                    null));
        employees.add(new Employee(1,"Diana",
                "Suarez", "diana@gmail.com",
                new Date(2022, 7, 20),
                null));*/

        return employeeDao.getEmployees();
    }

}
