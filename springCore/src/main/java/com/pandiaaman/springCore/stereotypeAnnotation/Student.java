package com.pandiaaman.springCore.stereotypeAnnotation;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("studentOne")
public class Student {

	@Value("Aman")
	private String name;
	@Value("3")
	private int rollno;
	@Autowired
	@Qualifier("addressOne")
	private Address address;
	@Value("#{studEmails}") //this is called Spring expression language
	private List<String> studEmails;
	@Value("#{studScores}")
	private Map<String, Integer> studScores;
	
	public Student(String name, int rollno, Address address, List<String> emails, Map<String, Integer> scores) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.address = address;
		this.studEmails = emails;
		this.studScores = scores;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	public List<String> getStudEmails() {
		return studEmails;
	}
	public void setStudEmails(List<String> studEmails) {
		this.studEmails = studEmails;
	}
	public Map<String, Integer> getStudScores() {
		return studScores;
	}
	public void setStudScores(Map<String, Integer> studScores) {
		this.studScores = studScores;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", address=" + address + ", studEmails=" + studEmails
				+ ", studScores=" + studScores + "]";
	}
	
	
}
