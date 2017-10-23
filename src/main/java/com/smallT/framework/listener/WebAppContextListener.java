package com.smallT.framework.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.smallT.IReserve.util.DayHouseUtil;
import com.smallT.framework.utils.BusinessConsts;

/**
 * Application Lifecycle Listener implementation class WebAppContextListener
 *
 */
public class WebAppContextListener implements ServletContextListener {

	private static WebApplicationContext webApplicationContext; 
	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    @Override
    public void contextInitialized(ServletContextEvent sce)  { 
    	webApplicationContext  =  WebApplicationContextUtils.getWebApplicationContext(sce.getServletContext());
    	BusinessConsts.WEB_APP_CONTEXT = webApplicationContext;
    	DayHouseUtil.startTimmer();
    }

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}
	
}
