package io.rk.spring.txn;

import org.springframework.stereotype.Service;

@Service
public class BenifitService {
	public void allocateBenifits() {
		System.out.println("Assigning benifits");
	}
	
	public void deAllocateBenifits() {
		System.out.println("De-allocating benifits");
	}
}
