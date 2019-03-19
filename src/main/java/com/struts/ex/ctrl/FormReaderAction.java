package com.struts.ex.ctrl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.ex.dm.Sheep;

public class FormReaderAction extends ActionSupport {
    
	private Logger logger = LoggerFactory.getLogger(RegisterAction.class);
	
    private Sheep sheep;

    private static final long serialVersionUID = 1L;
    
    
    public Sheep getSheep() {
		return sheep;
	}




	public void setSheep(Sheep sheep) {
		this.sheep = sheep;
	}




	public String execute() throws Exception {
        logger.info("Reporting from FormReaderAction.............");
    	if (sheep != null) {
    		logger.info("Sheep sheep1 form value = " + sheep.getSheep1());
    		logger.info("Sheep is from country = " + sheep.getCountryFrom());
    		logger.info("Sheep colour = " + sheep.isBlack());
    		logger.info("Favourite field = " + sheep.getFavouriteField());
    		logger.info("Squash racket = " + getText("SquashRacket." + sheep.getSquashRacket().getVal()));
    	}
        
    	logger.info("Sheep has been populated");
        return SUCCESS;
    }
    
    

}
