package com.saitej.core;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import com.saitej.core.model.Employee;
@Controller
@RequestMapping("/")
public class EmployeeController {
	
	@GetMapping("emp")
	@ResponseStatus(value = HttpStatus.OK)
	public ModelAndView getEmployee() {
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName("employee");
		Employee employee = new Employee();
	    employee.setId(1L);
	    employee.setName("SAITEJ");
	    employee.setDept("Java");
		Employee employee2 = new Employee();
		employee2.setId(2L);
		employee2.setName("Krish");
		employee2.setDept("Spring");
	    List<Employee> list = List.of(employee,employee2);
	//	List<Employee> list = Arrays.asList(employee, employee2);
		mav.addObject("employees", list);
		return mav;
	}

}
