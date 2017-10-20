package com.smallT.IReserve.service;

import java.util.List;

import com.smallT.IReserve.entity.THouse;
import com.smallT.IReserve.entity.THouseDay;

public interface IReserveService {
	
	/**
	 * 定时插入房间每日信息
	 * @param tHouseDay
	 */
	public void insertDayInfo(THouseDay  tHouseDay);
	
	/**
	 * 查询所有房间信息
	 * @return
	 */
	public List<THouse>   getAllHouse();
}
