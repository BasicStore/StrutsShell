package com.struts.ex.ctrl;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.struts.ex.dm.State;
import com.struts.ex.dm.User;
import com.struts.ex.serv.ServiceFacade;
 

@Component
public class UserAction extends ActionSupport {
 
	private Logger logger = LoggerFactory.getLogger(UserAction.class);
	
	/**
     * Provide default value for Message property.
     */
    //public static final String MESSAGE = "global.message";
	public static final String MESSAGE = "message";
	
    private static final long serialVersionUID = 1L;
    
    private List<User> users;
     
    private String message;
    
    
    @Autowired
    private ServiceFacade userService;
     
    @SuppressWarnings("unchecked")
    public String execute() throws Exception {
        
    	logger.info("EXECUTING USErAction XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX************************************************************88");
    	
    	users = (List<User>) userService.doService("get");
        
    	initSessionState();
    	
    	
        // set msg literal, which will be loaded in the appropriate tongue
        setMessage(getText(MESSAGE));
        
        return SUCCESS;
    }

    
    private void initSessionState() {
    	// This new approach works, and it seems a session will always exist within the application context
    	Map session = ActionContext.getContext().getSession();
    	State state = new State(5,8);
    	state.getSheep().setBirthday(LocalDate.of(2018, 7, 6));
    	session.put("state", state);
    	
    	// OLD APPROACH TO SETTING SESSION:    	
//    	if (request != null && request.getSession() != null) {
//    		request.getSession().setAttribute("state", state);
//    	}
    }
    
    
    protected String doExecute() throws Exception
    {
    	return "Nil";
    }
    
    public List<User> getUsers(){
        return users;
    }

	public String getMessage() {
		logger.info("getMsg()");
		return message;
	}

	public void setMessage(String message) {
		logger.info("setMsg() = " + message);
		this.message = message;
	}
	
    
}