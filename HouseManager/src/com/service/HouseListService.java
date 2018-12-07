package com.service;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.Page;
import com.pojo.House;
import com.pojo.HouseDistrice;
import com.pojo.HouseStreet;
import com.pojo.HouseType;
import com.pojo.User;

public interface HouseListService {
	/**
	 * ��ѯ������Ϣ
	 * @return
	 */
	public Page<Object> getHouseWhere(Map<String, Object> map);
	/**
	 * ����id��ѯ������Ϣ
	 * @param map
	 * @return
	 */
	public House getHouseById(Map<String, Object> map);
	/**
	 * ����idɾ��������Ϣ
	 * @param map
	 * @return
	 */
	public int deleteById(int id);
	/**
	 * ��ȡ���е�����
	 * @return
	 */
	public List<HouseDistrice> getAllDname();
	/**
	 * ��������id��ѯ�ֵ�
	 * @param did
	 * @return
	 */
	public List<HouseStreet> getStreet(int did);
	/**
	 * ��ѯ���еķ�������
	 * @return
	 */
	public List<HouseType> getType();
	/**
	 * ����������Ϣ
	 * @param house
	 * @return
	 */
	public int addHouse(House house);
	/**
	 * �޸ķ�����Ϣ
	 * @param map
	 * @return
	 */
	public int updateHouse(House house);

}
