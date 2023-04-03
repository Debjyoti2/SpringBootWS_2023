package com.tcs.pwb.springjdbc.dao;

import java.sql.Types;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.tcs.pwb.springjdbc.rowmapper.getAllUserRowMapper;
import com.tcs.pwb.springjdbc.rowmapper.getSingleUserRowMapper;
import com.tcs.pwb.springjdbc.vo.UserVo;

@Repository
public class UserDAOImpl implements UserDAO{
	
	@Autowired
	NamedParameterJdbcTemplate njdbc;
	
	@Autowired
	JdbcTemplate jdbc;

	@Override
	public int saveUser(UserVo user) {

		String query="insert into t_usermst(at_userid,at_username,at_email,at_password)values(:in_userid,:in_username,:in_email,:in_password)";
		SqlParameterSource inputs =  new MapSqlParameterSource()
				.addValue("in_userid", user.getUserId(),Types.BIGINT)
				.addValue("in_username", user.getUserName(),Types.CHAR)
				.addValue("in_email", user.getEmail(),Types.CHAR)
				.addValue("in_password", user.getPassword(),Types.CHAR);
		
		int rowcount =  njdbc.update(query, inputs);
		return rowcount;
	}

	@Override
	public int updateUser(UserVo user) {
       
		
		return 0;
	}
 
	@Override
	public int deleteUser(UserVo user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<UserVo> getallUser() {

		String query="select at_userid,at_username,at_email,at_password from t_usermst u order by at_userid desc";
		SqlParameterSource inputs = new MapSqlParameterSource();
		List<UserVo> userList = njdbc.query(query, new getAllUserRowMapper());
		return userList;
	}

	@Override
	public UserVo fetchSingleUser(int userId) {
		
		String query="select at_userid,at_username,at_email,at_password from t_usermst u where u.at_userid=:in_userid";
		SqlParameterSource inputs = new MapSqlParameterSource().addValue("in_userid", userId);
		UserVo user = new UserVo();
		user = njdbc.queryForObject(query, inputs, new getSingleUserRowMapper());
		return user;
	}
	
	
	

}
