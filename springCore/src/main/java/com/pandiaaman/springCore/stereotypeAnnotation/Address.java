package com.pandiaaman.springCore.stereotypeAnnotation;

import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("addressOne")
public class Address {

	@Value("12")
	private int houseNo;
	@Value("mg road")
	private String roadNo;
	@Value("#{addressPhones}")
	private Set<String> phoneNos;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int houseNo, String roadNo, Set<String> phoneNos) {
		super();
		this.houseNo = houseNo;
		this.roadNo = roadNo;
		this.phoneNos = phoneNos;
	}
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getRoadNo() {
		return roadNo;
	}
	public void setRoadNo(String roadNo) {
		this.roadNo = roadNo;
	}
	
	
	public Set<String> getPhoneNos() {
		return phoneNos;
	}
	public void setPhoneNos(Set<String> phoneNos) {
		this.phoneNos = phoneNos;
	}
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", roadNo=" + roadNo + ", phoneNos=" + phoneNos + "]";
	}
	
	
}
