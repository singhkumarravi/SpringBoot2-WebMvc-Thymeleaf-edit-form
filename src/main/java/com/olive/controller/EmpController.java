package com.olive.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.olive.model.Employee;


@Controller
@RequestMapping("/emp")
public class EmpController {

	@GetMapping("/edit")
	private String showEdit(Model model) {
		
		Employee e=new Employee();
		e.setEmpId(100);
		e.setEmpName("Ravi");
		e.setEmpDept("1");
		e.setEmpGen("MALE");
		e.setEmpLangs(Arrays.asList("ENG","ENG"));
		
		Map<String,String> data=new HashMap<String, String>();
		data.put("1", "DEV");
		data.put("2", "QA");
		data.put("3", "Test Dept");
		
		Map<String,String> langs=new HashMap<String, String>();
		langs.put("ENG", "ENG");
		langs.put("HINDI", "HINDI");
		langs.put("TEL", "TEL");
		  
		model.addAttribute("map",data);
		model.addAttribute("langs",langs);
		model.addAttribute("employee",e);
	
		return "employeeEdit2";
	}
}
