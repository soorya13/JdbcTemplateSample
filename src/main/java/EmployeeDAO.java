import org.springframework.jdbc.core.JdbcTemplate;

import connectionutils.ConnectionUtil;
import model.Employee;

public class EmployeeDAO {
	private JdbcTemplate myTemplate=ConnectionUtil.getTemplate();
	public void add(Employee e)
	{
		String query="insert into emp_db.employee values(?,?)";
		Object[] params={e.getId(),e.getName()};
		
		myTemplate.update(query, params);
	}
	
	public void update(Employee e)
	{
		String query="update emp_db.employee set name=? where id=?";
		Object[] params={e.getName(),e.getId()};
		myTemplate.update(query,params);
	}
	public void delete(Employee e)
	{
		String query="delete from emp_db.employee where id=?";
		Object[] params={e.getId()};
		myTemplate.update(query,params);
	}
	public Employee get(int id)
	{
		String query="select id,name from emp_db.employee where id=?";
		Object[] params={id};
		return myTemplate.queryForObject(query,params,(rs,rowNo)->{
			Employee employee=new Employee();
			employee.setId(rs.getInt("id"));
			employee.setName(rs.getString("name"));
			return employee;
		});
	
	}
}
