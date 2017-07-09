package br.com.bo;

import br.com.bean.PersonBean;
import br.com.dao.PersonDAO;

public class PersonBO {

	
	public String insertPerson(String name, String email) {

		try {
			PersonBean personBean = new PersonBean(name, email);
			PersonDAO personDAO = new PersonDAO();

			if (personDAO.insert(personBean)) {
				return "output.jsp";
			}else{
				return "input.jsp";
			}
		} catch (Exception e) {
			e.printStackTrace();
				return "input.jsp";
		}

	}
}
