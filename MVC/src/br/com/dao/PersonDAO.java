package br.com.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.bean.PersonBean;

public class PersonDAO {

	public static List<PersonBean> list = null;
	
	public PersonDAO() {
		
		if(list == null) {
			list = new ArrayList<PersonBean>();
			PersonBean personBean = new PersonBean("Edvaldo", "edvaldomelo@byui.edu");
			list.add(personBean);
		}
	}
	
	public boolean insert(PersonBean personBean) throws Exception{
		
		list.add(personBean);
		return true;
		
	}
	
}
