package com.jiayen.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.jiayen.model.User;
import com.jiayen.model.dao.UserMapper;
public class UserTest extends BaseTest{
	@Autowired
		private UserMapper  userDao;
	@Test
	public void testAddUser(){
		User user = new User();
		user.setName("张三");
		user.setAge(22);
		userDao.insert(user);
		System.out.println("成功设置");
	}
}
