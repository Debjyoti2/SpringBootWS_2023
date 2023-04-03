package com.tcs.pwb.springjdbc.dao;

import java.util.List;

import com.tcs.pwb.springjdbc.vo.UserVo;

public interface UserDAO {
	
	public int saveUser(UserVo user);
	public int updateUser(UserVo user);
	public int deleteUser(UserVo user);
	public List<UserVo> getallUser();
	public UserVo fetchSingleUser(int userId);
	
	

}
