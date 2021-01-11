package io.rk.spring.txn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class OrgService {
	
	@Autowired
	private EmpService empService;
	@Autowired
	private BenifitService benifitService;
	
	
	@Transactional
	public void inFormality() {
		empService
				.insertEmployee(12, "Ram", "rkowsu@ivycomptech.com");
		benifitService.allocateBenifits();
	}
	
	public void outFormality(){
		empService.deleteEmployee(12);
		benifitService.deAllocateBenifits();
	}
}
