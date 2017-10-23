package com.smallT.IReserve.service.serviceImp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.smallT.IReserve.dao.IReserveDao;
import com.smallT.IReserve.entity.THouse;
import com.smallT.IReserve.entity.THouseDay;
import com.smallT.IReserve.service.IreserveService;


@Service
public class IreserveServiceImp implements IreserveService{
	
	@Resource
	private  IReserveDao iReserveDao;
	@Override
	public void insertDayInfo(THouseDay tHouseDay) {
		iReserveDao.insertDayInfo(tHouseDay);
	}
	
	@Override
	public List<THouse> getAllHouse() {
		
		return iReserveDao.getAllHouse();
	}

	@Override
	public boolean isTimeExist(THouseDay tHouseDay) {
		// TODO Auto-generated method stub
		boolean flag = false;
		 int i = iReserveDao.isTimeExit(tHouseDay);
		 if(i==1){
			 flag = true;
		 }
		 return flag;
	}

}
