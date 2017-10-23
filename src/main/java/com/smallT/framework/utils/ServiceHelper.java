package com.smallT.framework.utils;

import com.smallT.IReserve.service.IreserveService;

public final class ServiceHelper {
	
	public static Object getService(String service){
		return BusinessConsts.WEB_APP_CONTEXT.getBean(service);
	}
	
	public static IreserveService getIReserveService(){
		return (IreserveService) getService("ireserveServiceImp");
	}

}
