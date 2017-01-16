package ConnectionUtils;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class ConnectionUtil {
	public static BasicDataSource getDataSource()
	{
		BasicDataSource bs=new BasicDataSource();
		bs.setDriverClassName("com.mysql.jdbc.Driver");
		bs.setUrl("jdbc:mysql://localhost:3306/");
		bs.setUsername("root");
		bs.setPassword("root");
		return bs;
		
	}
	public static JdbcTemplate getTemplate()
	{
		JdbcTemplate jd=new JdbcTemplate();
		jd.setDataSource(getDataSource());
		return jd;
	}

}
