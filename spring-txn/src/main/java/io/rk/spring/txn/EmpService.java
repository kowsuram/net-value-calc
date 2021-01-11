package io.rk.spring.txn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {
	
	@Autowired
	IDaoSupport dao;
	public int insertEmployee(int id, String name, String email) {
		System.out.println("<<<<<<<<<<<<<< inserting a new employee >>>>>>>>>>>>>>>>>>>>>>>>>");
		return dao.insertEmployee(id,name,email);
	}
	
	public int deleteEmployee(int id) {
		System.out.println("<<<<<<<<<<<<<< removing a new employee >>>>>>>>>>>>>>>>>>>>>>>>>");
		return dao.deleteEmployee(id);
	}
	
}
