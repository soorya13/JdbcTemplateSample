import org.springframework.jdbc.core.JdbcTemplate;

import ConnectionUtils.ConnectionUtil;
import Model.Employee;

public class EmployeeDAO {
	public void add(Employee e)
	{
		String query="insert into emp_db.employee values(?,?)";
		Object[] params={e.getId(),e.getName()};
		JdbcTemplate myTemplate=ConnectionUtil.getTemplate();
		myTemplate.update(query, params);
	}

}
