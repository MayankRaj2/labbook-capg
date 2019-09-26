package com.cg.eis.service;

import java.util.ArrayList;

import com.cg.eis.bean.Employee;
import com.cg.eis.bean.EmployeeScheme;

public class EmployeeServiceImpl implements EmployeeService {


	ArrayList<Employee> l=new ArrayList<Employee>();
	public String addEmployee1(Employee e) {
		l.add(e);
		return "Employee added";
	}

	@Override
	public String findScheme(String Desg, double sal) {
		EmployeeScheme es=new EmployeeScheme();
		return es.find(Desg, sal);
	}

	public Employee getEmployee1(int id) {
		for(Employee i:l) {
			if(i.getId()==id) {
				return i;
			}
		}
		return null;
	}

	@Override
	public String addEmployee(Employee e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}


