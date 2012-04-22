package com.rajesh.data;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import com.rajesh.domain.User;

public class DataStuff {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public List<User> getNames() {
		return jdbcTemplate.queryForList("select * from user_table");
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void setNames(User user) {
		String query = "insert into user_table values('"+user.getName()+"','"+user.getPassword()+"',"+user.getGender()+",'"+user.getCountry()+"','"+user.getAboutYou()+"','"+user.getCommunity()+"',"+user.getMailingList()+")";
		System.out.println(query);
		jdbcTemplate.update(query);
	}
}





