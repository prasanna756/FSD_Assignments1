package com.hexaware.springrestjpa.restcontroller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.hexaware.hibernate.entity.Employee;

@SpringBootTest
class EmployeeRestControllerTest {

	@Autowired
	RestTemplate restTemplate;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void testInsertEmployee() {
		Employee emp = new Employee(123, "HUSSAIN", 35000);
		ResponseEntity<Employee> response = restTemplate.postForEntity("http://localhost:8080/api/employees/add", emp,
				Employee.class);
		Employee e = response.getBody();
		assertEquals(123, e.getEid());
	}

	@Test
    void testUpdateEmployee() {
        int eid = 220;
        Employee emp = new Employee(eid, "PRASANNA", 60000);
        restTemplate.put("http://localhost:8080/api/employees/update", emp, eid);

        ResponseEntity<Employee> response = restTemplate.getForEntity("http://localhost:8080/api/employees/get/" + eid,
                Employee.class);
        Employee newemp = response.getBody();
        assertNotNull(newemp);
        assertEquals("PRASANNA", newemp.getEname());
        assertEquals(60000, newemp.getSalary());
    }

	@Test
	void testGetEmployeeById() {
		int eid = 220;
		ResponseEntity<Employee> response = restTemplate.getForEntity("http://localhost:8080/api/employees/get/" + eid,
				Employee.class);
		Employee emp = response.getBody();
		assertNotNull(emp);
		assertEquals(220, emp.getEid());

	}

//	@Test
//	void testGetAllEmployees() {
//		ResponseEntity<List> response=restTemplate.getForEntity("http://localhost:8080/api/employees/getall", List.class);
//		List<Employee> list=response.getBody();
//		assertTrue(list.size()>0);
//		
//	}

	@Test
	void testGetAll() {
		ResponseEntity<List> response = restTemplate.getForEntity("http://localhost:8080/api/employees/getall",
				List.class);
		List<Employee> list = response.getBody();
		assertTrue(list.size() > 0);
		List<Employee> list2 = restTemplate.getForObject("http://localhost:8080/api/employees/getall", List.class);
		assertNotNull(list2.size() > 0);
	}

	@Test
    void testDeleteById() {
        restTemplate.delete("http://localhost:8080/api/employees/delete/210");

        ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8080/api/employees/get/210" ,String.class);
        String string=response.getBody();
        assertNull(string);
    }
//	@Test
//	void testDeleteByID() {
//		
//		 restTemplate.delete("http://localhost:8081/api/hotels/delete/150");
//		 ResponseEntity<Hotel> response = restTemplate.getForEntity("http://localhost:8081/api/hotels/get/150", Hotel.class);
//		 Hotel hotel = response.getBody();
//	     assertNull(hotel);
//		
//	}

}
