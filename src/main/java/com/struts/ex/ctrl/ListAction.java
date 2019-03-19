package com.struts.ex.ctrl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.struts.ex.dm.Sheep;
import com.struts.ex.dm.SquashRacket;
import com.struts.ex.dm.User;

public class ListAction extends ActionSupport {
    
	private Logger logger = LoggerFactory.getLogger(ListAction.class);
	
    private static final long serialVersionUID = 1L;
    
    private List<String> comboMeals;
    
    private List<User> peopleList;
     
    private List<String> countriesList = Arrays.asList("British", "French", "Czech");

    private List<String> favouriteFieldsList;
    
    private List<SquashRacket> squashRacketEnumList;
    
    
    public List<String> getCountriesList() {
    	return countriesList;
    }

    public void setCountriesList(List<String> countriesList) {
    	this.countriesList = countriesList;
    }
    
	public List<String> getComboMeals() {
		return comboMeals;
	}

	public void setComboMeals(List<String> comboMeals) {
		this.comboMeals = comboMeals;
	}

	public List<User> getPeopleList() {
		return peopleList;
	}

	public void setPeopleList(List<User> peopleList) {
		this.peopleList = peopleList;
	}

	public List<String> getFavouriteFieldsList() {
		return favouriteFieldsList;
	}

	public void setFavouriteFieldsList(List<String> favouriteFieldsList) {
		this.favouriteFieldsList = favouriteFieldsList;
	}
	
	public List<SquashRacket> getSquashRacketEnumList() {
		return squashRacketEnumList;
	}

	public void setSquashRacketEnumList(List<SquashRacket> squashRacketEnumList) {
		this.squashRacketEnumList = squashRacketEnumList;
	}
	
	public String getDefaultFavouriteFieldValue(){
		return favouriteFieldsList.size() > 0 ? favouriteFieldsList.get(0) : "";
	}
		
	public String execute() {
		logger.info("executing in the list action");
		
		comboMeals = new ArrayList<String>();
		comboMeals.add("Snack Plate");
		comboMeals.add("Dinner Plate");
		comboMeals.add("Colonel Chicken Rice Combo");
		comboMeals.add("Colonel Burger");
		comboMeals.add("O.R. Fillet Burger");
		comboMeals.add("Zinger Burger");
		
		peopleList = new ArrayList<User>();
		peopleList.add(new User("firstName1", "lastName1"));
		peopleList.add(new User("firstName2", "lastName2"));
		peopleList.add(new User("firstName3", "lastName3"));
		peopleList.add(new User("firstName4", "lastName4"));
		
		favouriteFieldsList = Arrays.asList("Field A", "Field B", "Field C", "Field D");
		squashRacketEnumList = Arrays.stream(SquashRacket.values()).collect(Collectors.toList());
		
		Sheep mySheep = new Sheep();
		mySheep.setSheep1("sheepFirstNameZZZ");
		mySheep.setSheep2("sheepLastNameZZZ");
		
		
		Map<String, Sheep> reqCtxt = (Map) ActionContext.getContext().get("request");
 		reqCtxt.put("mySheep", mySheep);
		
		return SUCCESS;
	}

	
}


