package com.verifone.main.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CardDetails {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sim_card_no;
	private String mobile_no;
	private Date expriy_date;
	private String state_of_registration;
	private boolean KYC;
	private String telecom_provider;
	private String full_name;
	
	public Long getSim_card_no() {
		return sim_card_no;
	}
	public void setSim_card_no(Long sim_card_no) {
		this.sim_card_no = sim_card_no;
	}
	public String getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	public Date getExpriy_date() {
		return expriy_date;
	}
	public void setExpriy_date(Date expriy_date) {
		this.expriy_date = expriy_date;
	}
	public String getState_of_registration() {
		return state_of_registration;
	}
	public void setState_of_registration(String state_of_registration) {
		this.state_of_registration = state_of_registration;
	}
	public boolean isKYC() {
		return KYC;
	}
	public void setKYC(boolean kYC) {
		KYC = kYC;
	}
	public String getTelecom_provider() {
		return telecom_provider;
	}
	public void setTelecom_provider(String telecom_provider) {
		this.telecom_provider = telecom_provider;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public CardDetails() {
		super();
	}
	
	

}
