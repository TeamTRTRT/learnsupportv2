package my.com.entity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
@Repository
public class Profile {
	private JdbcTemplate jdbcTemplate;
	
	
	@Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
	public void getProfile() {
		String sql  = "SELCET * FORM profile";
		List<khachhang> listKhachHang = jdbcTemplate.query(sql, new RowMapper<khachhang>() {

			@Override
			public khachhang mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
		});
	}
}
