import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveEmployee(Employee e) {
		String query = "insert into employee values('" + e.getEid() + "','" + e.getEname() + "','" + e.getDepartment()
				+ "')";
		return jdbcTemplate.update(query);
	}

	public int updateEmployee(Employee e) {
		String query = "update employee set ename='" + e.getEname() + "',department='" + e.getDepartment() + "' where eid='"
				+ e.getEid() + "' ";
		return jdbcTemplate.update(query);
	}

	public int deleteEmployee(Employee e) {
		String query = "delete from employee where eid='" + e.getEid() + "' ";
		return jdbcTemplate.update(query);
	}
}
