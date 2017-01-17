import org.springframework.jdbc.core.JdbcTemplate;

import ConnectionUtils.ConnectionUtil;
import Mapper.EmployeeMapper;
import Model.Employee;

public class EmployeeDAO {
	JdbcTemplate myTemplate=ConnectionUtil.getTemplate();
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
		String query="delete from emp_db.employee where id="+e.getId();
		myTemplate.update(query);
	}
	public Employee get(int id)
	{
		String query="select *from emp_db.employee where id="+id;
		return myTemplate.queryForObject(query,new EmployeeMapper());
	
	}
}
