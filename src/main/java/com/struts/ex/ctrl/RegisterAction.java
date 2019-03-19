package com.struts.ex.ctrl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.struts.ex.dm.Person;

public class RegisterAction extends ActionSupport {
    
	private Logger logger = LoggerFactory.getLogger(RegisterAction.class);
	
    private Person personBean;

    private static final long serialVersionUID = 1L;
    
    public String execute() throws Exception {
        logger.info("Reporting from RegisterAction.............");
    	logger.info("Firstname = " + personBean.getFirstName());
    	logger.info("Lastname = " + personBean.getLastName());
    	logger.info("Email = " + personBean.getEmail());
    	logger.info("Age = " + personBean.getAge());    	
     	logger.info("Age = " + personBean.getBirthday2().toString());
    	
     	// brew your own forward tags.....micro brewery
//     	if (personBean.getFirstName() != null) {
//     		return "badddd";
//     	}
     	// <result name="badddd">/users.jsp</result>
     	
     	// brew your own generic error handling
     	if (personBean.getFirstName() != null && personBean.getFirstName().equals("qqq")) {
     		throw new NullPointerException("all gone bad");
     	}
     	if (personBean.getFirstName() != null && personBean.getFirstName().equals("ppp")) {
     		throw new ArrayIndexOutOfBoundsException("array index out of bounds - caught generically");
     	}
     	
     	
     	if (personBean.getFirstName() != null && personBean.getFirstName().equals("zzz")) {
     		String fundamentalError = getText("dodgy.message");
     		logger.info("DODGY MESSAGE = " + fundamentalError);
     		Map ctxt = ActionContext.getContext().getContextMap();
     		ctxt.put("dodgy", fundamentalError);
        	return INPUT;
     	}
     	
     	Map reqCtxt = (Map) ActionContext.getContext().get("request");
 		reqCtxt.put("doodles", "Some request msg goes here");
 		
        return SUCCESS;
    }
    
    public Person getPersonBean() {
        return personBean;
    }
    
    public void setPersonBean(Person person) {
        personBean = person;
    }
   
   
}
