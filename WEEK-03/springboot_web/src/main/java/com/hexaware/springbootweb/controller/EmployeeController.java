package com.hexaware.springbootweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hexaware.springbootweb.dao.IEmployeeDao;
import com.hexaware.springbootweb.entity.Employee;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/employees")
public class EmployeeController {// SERVLET

	@Autowired
	IEmployeeDao dao;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public String addEmployee(HttpServletRequest request, HttpServletResponse response) {
		int eid = Integer.parseInt(request.getParameter("eid"));
		String ename = request.getParameter("ename");
		double salary = Double.parseDouble(request.getParameter("salary"));
		Employee emp = new Employee(eid, ename, salary);

		return dao.addEmployee(emp);

	}

	@RequestMapping("/getall")
	// @ResponseBody
	public String getAllEmployees(HttpSession session) {
		List<Employee> list = dao.getAll();
		session.setAttribute("empList", list);

		return "displayAll";
	}

	@RequestMapping("/get")
	public String get() {
		return "success"; // views/success.jsp
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	public String addEmployee(HttpServletRequest request) {
		int eid = Integer.parseInt(request.getParameter("eid"));
		String ename = request.getParameter("ename");
		double salary = Double.parseDouble(request.getParameter("salary"));
		Employee emp = new Employee(eid, ename, salary);

		return dao.updateEmployee(emp);
	}

	@RequestMapping(value = "/delete")
	@ResponseBody
	public String delete(HttpServletRequest request) {
		int eid = Integer.parseInt(request.getParameter("eid"));

		return dao.deleteEmployee(eid);
	}

	@RequestMapping(value = "/getById", method = RequestMethod.GET)
	@ResponseBody
	public String getEmployeeById(HttpServletRequest request) {
		int eid = Integer.parseInt(request.getParameter("eid"));

		Employee employee = dao.getEmployeeById(eid);
		if (employee != null) {
			return "Employee details: " + employee.toString();
		} else {
			return "Employee with ID " + eid + " not found.";
		}

	}

}
