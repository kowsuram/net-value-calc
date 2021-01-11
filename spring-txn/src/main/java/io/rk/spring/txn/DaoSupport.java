package io.rk.spring.txn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

@Repository
public class DaoSupport extends JdbcDaoSupport implements  IDaoSupport{
	
	@Autowired
	DataSource dataSource;
	
	public DaoSupport(){}
	
	@PostConstruct
	public void initialize(DataSource dataSource) {
		setDataSource(dataSource);
	}
	
	@Override
	public int assignBenifits(int id, String plan) {
		return getJdbcTemplate().update("insert into benifits(id,plan) values(?,?)", new Object[]{id, plan});
	}
	
	@Override
	public int deassignBenifits(int id) {
		return getJdbcTemplate().update("delete from benifits where id=?", new Object[]{id});
	}
	
	@Override
	public int insertEmployee(int id, String name, String email) {
		return getJdbcTemplate().update("insert into employee(id,name,email) values(?,?,?)", new Object[]{id, name, email});
	}
	
	@Override
	public int deleteEmployee(int id) {
		return getJdbcTemplate().update("delete from employee where id=?", new Object[]{id});
	}
}
