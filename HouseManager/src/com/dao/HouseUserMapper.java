package com.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pojo.User;
@Repository
public interface HouseUserMapper {
	/**
	 * ��¼
	 * 
	 * @param name
	 * @param password
	 * @return
	 */
	@Autowired
	public User login(@Param("userName") String userName, @Param("passWord") String passWord);
	/**
	 * �����û����ж��Ƿ����
	 * @param name
	 * @return
	 */
	@Autowired
	public int exists(String name);
	/**
	 * ע��
	 * @param user
	 * @return
	 */
	@Autowired
	public int register(User user);
	
	/**
	 * ��ѯ��ǰ�û���id
	 * @param id
	 * @return
	 */
	@Autowired
	public User getUserId(String name);

}
