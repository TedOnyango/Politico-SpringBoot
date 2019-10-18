package com.ted.politico.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Office 
{
	@Id
	@GeneratedValue
	private int oId;
	private String oName;
	private String oType;
	public int getoId() {
		return oId;
	}
	public void setoId(int oId) {
		this.oId = oId;
	}
	public String getoName() {
		return oName;
	}
	public void setoName(String oName) {
		this.oName = oName;
	}
	public String getoType() {
		return oType;
	}
	public void setoType(String oType) {
		this.oType = oType;
	}
	@Override
	public String toString() {
		return "Office [oId=" + oId + ", oName=" + oName + ", oType=" + oType + ", getoId()=" + getoId()
				+ ", getoName()=" + getoName() + ", getoType()=" + getoType() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
