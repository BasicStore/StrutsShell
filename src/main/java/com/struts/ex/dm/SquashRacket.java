package com.struts.ex.dm;

public enum SquashRacket {

	PRINCE(1, "prince"),
	DUNLOP(2, "dunlop"),
	WILSON(3, "wilson");
	
	private final int id;
	private final String val;
		
	private SquashRacket(int id, String val) {
		this.id = id;
		this.val = val;
	}
	
	public int getId() {
		return id;
	}
	
	public String getVal() {
		return val;
	}
	
	public String val() {
		return getVal();
	}
	
	
	public static SquashRacket getRacket(String val) {
		if (val != null) {
			for (SquashRacket sqR : SquashRacket.values()) {
				if (sqR.getVal().contentEquals(val)) {
					return sqR;
				}
			}
		}
		
		return null;
	}
	
	
}
