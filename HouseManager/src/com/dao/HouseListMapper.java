package com.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pojo.House;
import com.pojo.HouseDistrice;
import com.pojo.HouseStreet;
import com.pojo.HouseType;
import com.pojo.User;
@Repository
public interface HouseListMapper {
	/**
	 * ��ѯ������Ϣ
	 * @return
	 */
	@Autowired
	public List<House> getHouseWhere(Map<String, Object> map);
	/**
	 * ����id��ѯ������Ϣ
	 * @param map
	 * @return
	 */
	@Autowired
	public House getHouseById(Map<String, Object> map);
	/**
	 * ����idɾ��������Ϣ
	 * @param map
	 * @return
	 */
	@Autowired
	public int deleteById(int id);
	/**
	 * �޸ķ�����Ϣ
	 * @param map
	 * @return
	 */
	@Autowired
	public int updateHouse(House house);
	/**
	 * ��ȡ���е�����
	 * @return
	 */
	@Autowired
	public List<HouseDistrice> getAllDname();
	/**
	 * ��������id��ѯ�ֵ�
	 * @param did
	 * @return
	 */
	@Autowired
	public List<HouseStreet> getStreet(int did);
	/**
	 * ��ѯ���еķ�������
	 * @return
	 */
	@Autowired
	public List<HouseType> getType();
	/**
	 * ����������Ϣ
	 * @param house
	 * @return
	 */
	@Autowired
	public int addHouse(House house);
	
}
