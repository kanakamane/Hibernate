package com.hib.Entity;

import java.util.stream.Collector.Characteristics;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="studentdetail")
public class StudentDetail {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="sdid")
	private int sdid;
	@Column(name="mobile")
	private String mobile;
	@Column(name="city")
	private String city;
	@Column(name="state")
	private String state;
	
	
	@OneToOne(mappedBy ="studentdetail", cascade = CascadeType.ALL)
	private Student student;
	
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public int getSdid() {
		return sdid;
	}
	public void setSdid(int sdid) {
		this.sdid = sdid;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public StudentDetail(int sdid, String mobile, String city, String state) {
		super();
		this.sdid = sdid;
		this.mobile = mobile;
		this.city = city;
		this.state = state;
	}
	public StudentDetail(String mobile, String city, String state) {
		super();
		this.mobile = mobile;
		this.city = city;
		this.state = state;
	}
	public StudentDetail() {
		super();
	}
	@Override
	public String toString() {
		return  + sdid + "    " + mobile + "   " + city + "    " + state ;
	}
	

}
