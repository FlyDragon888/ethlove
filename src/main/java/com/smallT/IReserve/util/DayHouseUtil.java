package com.smallT.IReserve.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import com.smallT.IReserve.entity.THouse;
import com.smallT.IReserve.entity.THouseDay;
import com.smallT.IReserve.service.IreserveService;
import com.smallT.framework.utils.ServiceHelper;

public class DayHouseUtil {
	
	private static   IreserveService iReserveService;
	
	public static  void addDayHouse(int day){
		iReserveService = ServiceHelper.getIReserveService();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//此处获得所有房间信息
		List<THouse> hList = iReserveService.getAllHouse();
		for(THouse h:hList ){
			int i = 1;
			while(true){
				Calendar cal = Calendar.getInstance();
				cal.setTime(new Date());
				cal.add(Calendar.DAY_OF_YEAR, +i);
				String time = sdf.format(cal.getTime());
				
				THouseDay tHouseDay = new THouseDay();
				tHouseDay.setdRoomNo(h.getRoomNo() + "-" + time);
				tHouseDay.sethDate(cal.getTime());
				tHouseDay.setRoomNo(h.getRoomNo());
				tHouseDay.setHotelId(h.getHotelId());
				tHouseDay.setState(0);
				boolean isExist = iReserveService.isTimeExist(tHouseDay);
				if(!isExist){
					iReserveService.insertDayInfo(tHouseDay);
				}
				
				i++;
				if (i > day) {
					break;
				}
			}
		}
		
	}
	public static void startTimmer(){
		Timer timer = new Timer();

		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				addDayHouse(38);
				
			}
		}, 1000, 1000*60*60*24);
	}
	
	public static void main(String[] args) {
		addDayHouse(38);
	}
}
