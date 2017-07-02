package br.com.edvaldomelo.servlet;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.edvaldomelo.dao.StudentDAO;
import br.com.edvaldomelo.entity.Student;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
 
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		String destiny = "sucess.jsp";
		String message = "";
		List<Student> list = new ArrayList<>();
 
 
		Student student = new Student();
		StudentDAO dao = new StudentDAO();
 
		try {
 
			// If the action is different of to list, the screen data is read
			if (!action.equalsIgnoreCase("Listing")) {
				student.setRegistration(Long.parseLong(request.getParameter("registration")));
				student.setName(request.getParameter("name"));
				student.setTelephone(request.getParameter("telephone"));
				student.setEmail(request.getParameter("email"));
 
				// It reads register date. If there is a formatting error
				// system will use the current date
				try {
					DateFormat df = new SimpleDateFormat("MM/dd/yyyy");					
					student.setRegisterDate(df.parse(request.getParameter("registerDate")));
				} catch (Exception e) {
					student.setRegisterDate(new Date());	
				}
 
			}
 
			if (action.equalsIgnoreCase("Add")) {
				// Verify if a informed registration already exists in database
				// If exists, a message will be sent, if not, it does the addition 
				if (dao.exist(student)) {
					message = "Informed registration already exists!";
				} else {
					dao.insert(student);
				}
			} else if (action.equalsIgnoreCase("Edit")) {
				dao.edit
				(student);
			} else if (action.equalsIgnoreCase("Delete")) {
				dao.delete(student);
			} else if (action.equalsIgnoreCase("Consult")) {
				request.setAttribute("student", student);
				student = dao.consult(student);
				destiny = "student.jsp";
			}
		} catch (Exception e) {
			message += e.getMessage();
			destiny = "error.jsp";
			e.printStackTrace();
		}
 
		// If message is empty, this means success!
		// If not, it will be displayed system error screen.
		if (message.length() == 0) {
			message = "Student was registered with sucess!";
		} else {
			destiny = "error.jsp";
		}
 
		// List all database's register
		list = dao.listing();
		request.setAttribute("listStudent", list);
		request.setAttribute("message", message);
 
 
		// System is directed to sucess.jsp page.
		// sucess.jp if all worked.
		// erro.jsp if there is an any problem.
		RequestDispatcher rd = request.getRequestDispatcher(destiny);
		rd.forward(request, response);
	}
}