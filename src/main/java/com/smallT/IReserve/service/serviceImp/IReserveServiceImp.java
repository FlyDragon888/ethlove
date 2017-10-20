package com.smallT.IReserve.service.serviceImp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.smallT.IReserve.dao.IReserveDao;
import com.smallT.IReserve.entity.THouse;
import com.smallT.IReserve.entity.THouseDay;
import com.smallT.IReserve.service.IReserveService;

@Service
public class IReserveServiceImp implements IReserveService{
	
	@Resource
	private  IReserveDao iReserveDao;
	@Override
	public void insertDayInfo(THouseDay tHouseDay) {
		
		
	}
	
	@Override
	public List<THouse> getAllHouse() {
		
		return iReserveDao.getAllHouse();
	}

}
