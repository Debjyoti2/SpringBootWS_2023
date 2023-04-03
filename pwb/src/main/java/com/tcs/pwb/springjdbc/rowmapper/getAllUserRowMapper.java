package com.tcs.pwb.springjdbc.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.tcs.pwb.springjdbc.vo.UserVo;

public class getAllUserRowMapper implements RowMapper<UserVo> {

	@Override
	public UserVo mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		UserVo user = new UserVo();
		user.setUserId(rs.getInt("at_userid"));
		user.setUserName(rs.getString("at_username"));
		user.setEmail(rs.getString("at_email"));
		user.setPassword(rs.getString("at_password"));
		
		return user;
	}

}
