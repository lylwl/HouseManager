package com.service;

import org.apache.ibatis.annotations.Param;

import com.pojo.User;

public interface HouseUserService {
	/**
	 * ��¼
	 * 
	 * @param name
	 * @param password
	 * @return
	 */
	public User login(@Param("userName") String userName, @Param("passWord") String passWord);
	/**
	 * �����û����ж��Ƿ����
	 * @param name
	 * @return
	 */
	public int exists(String name);
	/**
	 * ע��
	 * @param user
	 * @return
	 */
	public int register(User user);
	/**
	 * ��ѯ��ǰ�û���id
	 * @param id
	 * @return
	 */
	public User getUserId(String name);
}
