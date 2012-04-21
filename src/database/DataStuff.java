package database;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class DataStuff {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public List getNames() {
		return jdbcTemplate.queryForList("select * from test_table");
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void setNames(int i, String names) {
		String query = "insert into test_table values("+i+",'"+names+"')";
		jdbcTemplate.update(query);
	}
}





