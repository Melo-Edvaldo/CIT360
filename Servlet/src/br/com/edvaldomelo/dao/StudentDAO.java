package br.com.edvaldomelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.edvaldomelo.entity.Student;


public class StudentDAO extends DAO {
	 
	public void edit(Student student) {
		try {
			Connection connection = getConnection();
 
			PreparedStatement pstmt = connection
					.prepareStatement("Update tbstudent SET name = ?, telephone = ?, email = ?, registerdate = ?"
							+ " WHERE registration = ? ");
			pstmt.setString(1, student.getName());
			pstmt.setString(2, student.getTelephone());
			pstmt.setString(3, student.getEmail());
			pstmt.setDate(4, new java.sql.Date(student.getRegisterDate().getTime()));
			pstmt.setLong(5, student.getRegistration());
			pstmt.execute();
			pstmt.close();
			connection.close();
 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
 
	public void delete(Student student) {
		try {
			Connection connection = getConnection();
			PreparedStatement pstm = connection
					.prepareStatement("Delete from tbstudent where registration = ? ");
			pstm.setLong(1, student.getRegistration());
			pstm.execute();
			pstm.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
 
	public boolean exist(Student student) {
		boolean found = false;
		try {
			Connection connection = getConnection();
			PreparedStatement pstm = connection
					.prepareStatement("Select * from tbstudent where registration =	?");
			pstm.setLong(1, student.getRegistration());
			ResultSet rs = pstm.executeQuery();
			if (rs.next()) {
				found = true;
			}
			pstm.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return found;
	}
 
	public void insert(Student student) {
		try {
			Connection connection = getConnection();
			PreparedStatement pstm = connection
					.prepareStatement("Insert into	tbstudent (registration, name, telephone, email, registerdate) values	(?,?,?,?,?)");
			pstm.setLong(1, student.getRegistration());
			pstm.setString(2, student.getName());
			pstm.setString(3, student.getTelephone());
			pstm.setString(4, student.getEmail());
			pstm.setDate(5, new java.sql.Date(student.getRegisterDate()
					.getTime()));
			pstm.execute();
			pstm.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
 
	public List<Student> listing() {
		List<Student> list = new ArrayList<>();
		try {
			Connection connection = getConnection();
			Statement stm = connection.createStatement();
			ResultSet rs = stm.executeQuery("Select * from tbstudent");
			while (rs.next()) {
				Student student = new Student();
				student.setRegistration(rs.getLong("registration"));
				student.setName(rs.getString("name"));
				student.setTelephone(rs.getString("telephone"));
				student.setEmail(rs.getString("email"));
				student.setRegisterDate(new java.util.Date(rs.getDate("registerdate").getTime()));
				list.add(student);
			}
			stm.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
 
	public Student consult(Student student) {
		try {
			Connection connection = getConnection();
			PreparedStatement pstm = connection
					.prepareStatement("Select * from tbstudent where registration =	?");
			pstm.setLong(1, student.getRegistration());
			ResultSet rs = pstm.executeQuery();
			if (rs.next()) {
				student.setRegistration(rs.getLong("registration"));
				student.setName(rs.getString("name"));
				student.setTelephone(rs.getString("telephone"));
				student.setEmail(rs.getString("email"));
				student.setRegisterDate(new java.util.Date(rs.getDate("registerdate").getTime()));
			}
			pstm.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return student;
	}
}
