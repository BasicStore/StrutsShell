package com.struts.ex;
import java.util.Locale;
import java.util.ResourceBundle;

import org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import com.struts.ex.serv.ServiceFacade;



@SpringBootApplication
public class StrutsShellApplication extends SpringBootServletInitializer implements ApplicationRunner {

	private Logger logger = LoggerFactory.getLogger(StrutsShellApplication.class);
	
	@Autowired
    private ServiceFacade userService;
	
	public static void main(String[] args) {
		SpringApplication.run(StrutsShellApplication.class, args);
	}

     
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(StrutsShellApplication.class);
    }
     
 
    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        StrutsPrepareAndExecuteFilter struts = new StrutsPrepareAndExecuteFilter();
        registrationBean.setFilter(struts);
        registrationBean.setOrder(1);
        return registrationBean;
    }
 
    @Override
    public void run(ApplicationArguments args) throws Exception {
        
    	System.out.println("*******************************************************************************************************");
    	logger.info("LOGGING %%%%%%%%%%%%%%%%");
    	
    	ResourceBundle rb = ResourceBundle.getBundle("config.sysprops");
    	String value = rb.getString("shell.struts.name");
    	logger.info("TEST CONFIG PROP VALUE HERE:  " + value);
    	
    	
    	//Missing key [global.message] in bundles [[global, org/apache/struts2/struts-messages, com/opensymphony/xwork2/xwork-messages]]!
    	
    	
    	if (userService == null) {
    		System.out.println("userService is NULL");
    	}
    	
    	userService.doService("insert");
    }
	
}
