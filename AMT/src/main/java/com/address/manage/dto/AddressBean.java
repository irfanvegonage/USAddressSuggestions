package com.address.manage.dto;

import javax.persistence.*;


import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

 

@Entity @Table(name="address_info")
public class AddressBean {

		 
	   @Id @Column(name ="building_number")
		  private int number;
		  
		  @Column(name ="street_name")
		  private String streetName;

		  @Column(name ="state")
		  private String state;

		  private int pin;
		  private String country;
		  
		  public int getNumber()
		{ 
		 return number;
		}

		public void setNumber(int number)
		{ 
		 this.number = number;
		}

		 public String getStreetName()
		{ 
		 return streetName;
		}
		 
		public void setStreetName(String  streetName)
		{ 
		 this.streetName = streetName;
		}

		 
		public String getState()
		{ 
		 return state;
		}
		 
		public void setState(String  state)
		{ 
		 this.state = state;
		}

		public int getPin()
		{ 
		 return pin;
		}
		 
		public void setPin(int pin)
		{ 
		 this.pin = pin;
		}

		public String getCountry()
		{ 
		 return country;
		}
		 
		public void setCountry(String country)
		{ 
		 this.country = country;
		}


		@Override

		public String toString()
		{
		 return "AddressBean [number =" + number + " , streetName="+ streetName +",state"+ state + " , pin "+pin
		          + " , country ="+ country +"]";
		}
		
		}


