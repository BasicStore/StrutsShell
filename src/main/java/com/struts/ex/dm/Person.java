package com.struts.ex.dm;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Person {
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private LocalDate birthday;
    private Date birthday2;
    private String nationality;
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public String toString() {
        return "First Name: " + getFirstName() + " Last Name:  " + getLastName() + 
        " Email:      " + getEmail() + " Age:      " + getAge(); 
        
    }

	public Date getBirthday2() {
		return birthday2;
	}

	public void setBirthday2(Date birthday2) {
		this.birthday2 = birthday2;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	
//	public Date getBirthdayDate() {
//		if (birthday != null) {
//			return Date.from(birthday.atStartOfDay(ZoneId.systemDefault()).toInstant());
//		}
//		
//		return null;
//	}
	
}


