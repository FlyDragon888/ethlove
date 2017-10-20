package com.smallT.IReserve.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import com.smallT.IReserve.entity.THouse;
import com.smallT.IReserve.entity.THouseDay;
import com.smallT.IReserve.service.IReserveService;

public class DayHouseUtil {
	
	@Resource
	private static IReserveService iReserveService;
	
	public static  void addDayHouse(int day){
		SimpleDateFormat sdf = new SimpleDateFormat();
		//此处获得所有房间信息
		List<THouse> hList = iReserveService.getAllHouse();
		for(THouse h:hList ){
			int i = 1;
			while(true){
				Calendar cal = Calendar.getInstance();
				cal.setTime(new Date());
				cal.add(Calendar.DAY_OF_YEAR, +i);
				String time = sdf.format(cal.getTime());
				System.out.println(h.getRoomNo() + "---" + time);
				
				THouseDay tHouseDay = new THouseDay();
				tHouseDay.setdRoomNo(h.getRoomNo() + "-" + sdf.format(cal.getTime()));
				tHouseDay.sethDate(cal.getTime());
				tHouseDay.setRoomNo(h.getRoomNo());
				tHouseDay.setHotelId(h.getHoteld());
				tHouseDay.setState(0);
				iReserveService.insertDayInfo(tHouseDay);
				i++;
				if (i == day) {
					break;
				}
			}
		}
		
	}
	public static void main(String[] args) {
		addDayHouse(38);
	}
}
