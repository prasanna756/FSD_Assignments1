package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dao.DeptDaoImp;
import dao.IDeptDao;
import pojo.Department;

class DeptDaoImpTest {

	static IDeptDao dao;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		dao = new DeptDaoImp();
	}

	@BeforeEach
	void setUp() {

	}

	@Test
	void testInsert() {
		Department dept = new Department();
		dept.setDno(110);
		dept.setDname("kala");
		dept.setLocation("chennai");

		int actual = dao.insert(dept);
		assertEquals(1, actual);
	}
	
	@Test
    void testUpdate() {
        Department dept = new Department();
        dept.setDno(110);
        dept.setDname("Mahi");
        dept.setLocation("Chennai");
        int actual = dao.update(dept);
        assertEquals(1, actual);
    }
	
	@Test
    void testDeleteOne() {
        int dnoToDelete = 110;
        int actual = dao.deleteOne(dnoToDelete);
        assertEquals(1, actual);
    }
	
	@Test
    void testSelectOne() {
        int dnoToSelect = 110;

        Department dept = dao.selectOne(dnoToSelect);
        assertNotNull(dept);
        assertEquals(dnoToSelect, dept.getDno());
	}

	@Test
	void testSelectAll() {
		List<Department> list = dao.selectAll();
		assertNotNull(list);
		assertTrue(list.size() > 0);

		Department dept = list.get(0);
		assertTrue(dept.getDno() > 0);

	}

}
