package com.yajava.bibliotek.lantagare;

public class Lantagare {
	private String name;
	private String phoneNr;
	private String address;
	private LaneKort laneKort;
	
	public Lantagare(String name, String phoneNr, String address, LaneKort laneKort) {
		this.name = name;
		this.phoneNr = phoneNr;
		this.address = address;
		this.laneKort = laneKort;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhoneNr() {
		return phoneNr;
	}
	public void setPhoneNr(String phoneNr) {
		this.phoneNr = phoneNr;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public LaneKort getLaneKort() {
		return laneKort;
	}
}
