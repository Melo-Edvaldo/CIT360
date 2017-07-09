package br.com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bo.PersonBO;

/**
 * Servlet implementation class ServletMVC
 */
@WebServlet("/informations")
public class ServletMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletMVC() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PersonBO personBO = new PersonBO();
		
		if(personBO.insertPerson(request.getParameter("name"),
			request.getParameter("email")) == "output.jsp") {
				
			request.setAttribute("msg", "Sucess - Object Inserted in List!");
			request.getRequestDispatcher(personBO.insertPerson(request.getParameter("name"),
					request.getParameter("email"))).forward(request, response);
		}else{
			request.setAttribute("msg", "An error occurred while inserting the object in the list!");
			request.getRequestDispatcher(personBO.insertPerson(request.getParameter("name"),
					request.getParameter("email"))).forward(request, response);
		}
	}

}
