package com.cognizant.creditcard.model;

import java.sql.Date;

public class AppBean 
{
	String uid,application_id,status;
	Date application_date;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getApplication_id() {
		return application_id;
	}

	public void setApplication_id(String application_id) {
		this.application_id = application_id;
	}

	public Date getApplication_date() {
		return application_date;
	}

	public void setApplication_date(Date application_date) {
		this.application_date = application_date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
