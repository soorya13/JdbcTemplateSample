package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import model.Employee;

public class EmployeeMapper implements RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int rowNo) throws SQLException {
		Employee employee=new Employee();
		employee.setId(rs.getInt("id"));
		employee.setName(rs.getString("name"));
		return employee;
	}

}
