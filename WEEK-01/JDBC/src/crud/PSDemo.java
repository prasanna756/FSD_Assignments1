package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PSDemo {

	public static void main(String[] args) {
		Connection conn = DBUtil.getDBConnection();
		// INSERT
//		String insert = "insert into deptt values(?,?,?)";

		/*
		 * try { PreparedStatement pstmt = conn.prepareStatement(insert);
		 * 
		 * pstmt.setInt(1,80); pstmt.setString(2,"Logistics"); pstmt.setString(3,
		 * "Noida");
		 * 
		 * int count=pstmt.executeUpdate(); System.out.println(count);
		 * 
		 * } catch (SQLException e) { e.printStackTrace(); }
		 */

		// UPDATE

		String UpdateQuery = "update deptt set dname=?, location=? where dno= ?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(UpdateQuery);

			pstmt.setString(1, "Tours and trvaels");
			pstmt.setString(2, "Hyderabad");
			pstmt.setInt(3, 50);

			int count = pstmt.executeUpdate();
			System.out.println("record update is " + count);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

// SELECT ALL
//		String selectAll = "select dno,dname, location from deptt";
//		try {
//			PreparedStatement pstmt = conn.prepareStatement(selectAll);
//			ResultSet rs = pstmt.executeQuery();	
//			
//			while(rs.next()) {
//				System.out.println(rs.getInt("dno") + " "+rs.getString("dname")+" "+rs.getString("location"));
//			}
//		}
//
//		catch (SQLException e)
//		{ 
//			e.printStackTrace();
//		}
//	}
//}

// DELETE
//		String deleteQuery = "Delete from deptt where dno=?";
//		try {
//			PreparedStatement pstmt = conn.prepareStatement(deleteQuery);
//			pstmt.setInt(1, 80);
//			int count = pstmt.executeUpdate();
//			System.out.println("record deleted  " + count);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//}
