package com.jspiders.map;

import java.util.Map;

public class Country {
	  private String name;
	  private Map<String,String> stateandlang;

      public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, String> getStateandlang() {
		return stateandlang;
	}
	public void setStateandlang(Map<String, String> stateandlang) {
		this.stateandlang = stateandlang;
	}
	@Override
	public String toString() {
		return "Country [name=" + name + ", stateandlang=" + stateandlang + "]";
	}
    
}
