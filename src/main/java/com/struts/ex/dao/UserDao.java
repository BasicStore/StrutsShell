package com.struts.ex.dao;
import java.util.List;
import com.struts.ex.dm.User;

public interface UserDao {

	public List<User> getUsers();
    
	public void insertBatch();
	
}