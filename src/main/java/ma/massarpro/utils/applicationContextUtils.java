package ma.massarpro.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class applicationContextUtils implements ApplicationContextAware {
	
	private static ApplicationContext ctx;
	 
	  @Override
	  public void setApplicationContext(ApplicationContext appContext) {
	    ctx = appContext;
	 
	  }
	 
	  public static ApplicationContext getApplicationContext() {
	    return ctx;
	  }
	  
	  public void init() {
		  System.out.println("iniiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiit");
	  }

	  
}
