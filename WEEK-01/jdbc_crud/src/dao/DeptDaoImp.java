package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pojo.Department;

public class DeptDaoImp implements IDeptDao {
	Connection conn = null;

	public DeptDaoImp() {
		conn = DBUtil.getDBConnection();
	}

	@Override
	public int insert(Department dept) {
		String insert = "insert into dept values(?,?,?)"; // ? positional parameters

		int count = 0;
		try {
			PreparedStatement pstmt = conn.prepareStatement(insert);

			pstmt.setInt(1, dept.getDno());
            pstmt.setString(2, dept.getDname());
            pstmt.setString(3, dept.getLocation());

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return count;
	}

	@Override
	public int update(Department dept) {
		String updateQuery = "update dept set dname=?, location=? where dno=?";
		int count = 0;
		try {
			PreparedStatement pstmt = conn.prepareStatement(updateQuery);

			pstmt.setString(1, dept.getDname());
			pstmt.setString(2, dept.getLocation());
			pstmt.setInt(3, dept.getDno());

			count = pstmt.executeUpdate();
			System.out.println(count + " record(s) updated");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public int deleteOne(int dno) {
		String deleteQuery = "DELETE FROM dept WHERE dno=?";
		int count = 0;
		try {
			PreparedStatement pstmt = conn.prepareStatement(deleteQuery);
			pstmt.setInt(1, dno);

			count = pstmt.executeUpdate();
			System.out.println(count + " record(s) deleted");

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return count;
	}

	@Override
	public Department selectOne(int dno) {
		String selectOneQuery = "SELECT dno,dname,location FROM dept WHERE dno=?";
		Department department = null;
		try {
			PreparedStatement pstmt = conn.prepareStatement(selectOneQuery);
			pstmt.setInt(1, dno);

			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				int departmentNumber = rs.getInt("dno");
				String departmentName = rs.getString("dname");
				String departmentLocation = rs.getString("location");

				department = new Department(departmentNumber, departmentName, departmentLocation);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return department;
	}

	@Override
	public List<Department> selectAll() {
		String selectAllQuery = "SELECT dno,dname,location FROM dept";
		List<Department> departments = new ArrayList<>();

		try {
			PreparedStatement pstmt = conn.prepareStatement(selectAllQuery);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				int departmentNumber = rs.getInt("dno");
				String departmentName = rs.getString("dname");
				String departmentLocation = rs.getString("location");

				Department department = new Department(departmentNumber, departmentName, departmentLocation);
				departments.add(department);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return departments;
	}

}
