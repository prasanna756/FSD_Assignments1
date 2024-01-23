package presentation;

import java.util.List;
import java.util.Scanner;

import dao.DeptDaoImp;
import dao.IDeptDao;
import pojo.Department;

public class Client {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		IDeptDao dao =  new DeptDaoImp();
		
		boolean flag=true;
		
		
		while (flag) {
		System.out.println("**WELCOME TO DMS**");
		System.out.println("1.INSERT");
		System.out.println("2.UPDATE");
		System.out.println("3.DELETE");
		System.out.println("4.SELECT BY ID");
		System.out.println("5.SELECT ALL");
		System.out.println("6.EXIT");
		
		int choice = scanner.nextInt();
		
		switch(choice) {
		case 1:
			Department dept = readData();
			int count = dao.insert(dept);
			System.out.println(count + "record inserted successfully");
			
			break;
			
		case 2:
			Department updatedDept = readData();
			int updateCount = dao.update(updatedDept);
			System.out.println(updateCount+ " records(s) updated successfully");
			break;
		
		case 3:
			System.out.println("Enter DNO to delete: ");
			int deleteDno=scanner.nextInt();
			int deleteCount=dao.deleteOne(deleteDno);
			System.out.println(deleteCount+ " records(s) deleted succesfully");
			break;
			
		case 4:
			System.out.println("Enter DNO to select: ");
			int selectDno=scanner.nextInt();
			Department selectedDept=dao.selectOne(selectDno);
			System.out.println("Selected Department: "+ selectedDept);
			break;
			
		case 5:
			List<Department> allDepartments=dao.selectAll();
			System.out.println("All Departments: ");
			for(Department d : allDepartments) {
				System.out.println(d);
			}
			break;
		case 6:
			flag=false;
			break;
		}
		
		}
	}
		public static Department readData() {
		System.out.println("Enter DNO: ");
		int dno=scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter Dname: ");
		String dname= scanner.nextLine();
		
		System.out.println("Enter DLocation: ");
		String location = scanner.nextLine();
		
		Department dept = new Department(dno,dname,location);
		return dept;
		}

}
