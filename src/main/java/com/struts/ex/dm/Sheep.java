package com.struts.ex.dm;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class Sheep {

	private String sheep1;
	
	private String sheep2;
	
	private String countryFrom;
	
	private boolean black;
		
	private String favouriteField;
	
	private SquashRacket squashRacket;
	
	private LocalDate birthday = LocalDate.of(1999, 2, 2);
	
	private LocalDateTime birthdayTime  = LocalDateTime.of(1999, 2, 2, 3, 3);
	
	public String getSheep1() {
		return sheep1;
	}
	
	public void setSheep1(String sheep1) {
		this.sheep1 = sheep1;
	}
	
	public String getSheep2() {
		return sheep2;
	}
	
	public void setSheep2(String sheep2) {
		this.sheep2 = sheep2;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public LocalDateTime getBirthdayTime() {
		return birthdayTime;
	}

	public void setBirthdayTime(LocalDateTime birthdayTime) {
		this.birthdayTime = birthdayTime;
	}

	public String getCountryFrom() {
		return countryFrom;
	}

	public void setCountryFrom(String countryFrom) {
		this.countryFrom = countryFrom;
	}

	public boolean isBlack() {
		return black;
	}

	public void setBlack(boolean black) {
		this.black = black;
	}

	public String getFavouriteField() {
		return favouriteField;
	}

	public void setFavouriteField(String favouriteField) {
		this.favouriteField = favouriteField;
	}

	public SquashRacket getSquashRacket() {
		return squashRacket;
	}

	public void setSquashRacket(String squashRacketStr) {
		squashRacket = SquashRacket.getRacket(squashRacketStr);
	}
		
	
//	public Date getBirthdayDate() {
//		if (birthday != null) {
//			return Date.from(birthday.atStartOfDay(ZoneId.systemDefault()).toInstant());
//		}
//		
//		return null;
//	}
	
	
	
}
