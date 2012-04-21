package database1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class DataStuff extends JdbcDaoSupport {
	public List getNames() {
		String querySql = "select id, name from login1 where id >= ?";
		return getJdbcTemplate().query(querySql, new Object[] { new Long(1) },
				new RowMapper() {
					public Object mapRow(ResultSet rs, int currentRowNum)
							throws SQLException {
						Person person = new Person();
						person.setId(rs.getLong("id"));
						person.setName(rs.getString("name"));
						return person;
					}
				});
	}

	public void updateAName(long id, String name) {
		String sql = "update login1 set name = ? where id = ?";
		getJdbcTemplate().update(sql, new Object[] { name, new Long(id) });
	}
}