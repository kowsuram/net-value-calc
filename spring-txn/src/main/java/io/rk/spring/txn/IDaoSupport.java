package io.rk.spring.txn;

public interface IDaoSupport {
	
	public int assignBenifits(int id, String plan);
	
	public int deassignBenifits(int id);
	
	public int insertEmployee(int id, String name, String email);
	
	public int deleteEmployee(int id);
}
