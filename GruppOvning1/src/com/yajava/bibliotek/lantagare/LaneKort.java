package com.yajava.bibliotek.lantagare;

public class LaneKort {
	private String cardNr;
	private int pinCode;
	
	
	public LaneKort(String cardNr, int pinCode) {
		this.cardNr = cardNr;
		this.pinCode = pinCode;
	}
	
	
	public String getCardNr() {
		return cardNr;
	}
	
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}


}
