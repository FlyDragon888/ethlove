package com.smallT.IReserve.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.smallT.IReserve.entity.THouse;
import com.smallT.IReserve.entity.THouseDay;

@Repository
public interface IReserveDao {
	
	public void insertDayInfo(THouseDay  tHouseDay);
	
	public List <THouse> getAllHouse();
}
