package com.ted.politico.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Party
{
	@Id
	@GeneratedValue
	private int pId;
	private String pName;
	private String pHqAddress;
	private String pLogoUrl;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpHqAddress() {
		return pHqAddress;
	}
	public void setpHqAddress(String pHqAddress) {
		this.pHqAddress = pHqAddress;
	}
	public String getpLogoUrl() {
		return pLogoUrl;
	}
	public void setpLogoUrl(String pLogoUrl) {
		this.pLogoUrl = pLogoUrl;
	}
	@Override
	public String toString() {
		return "Party [pId=" + pId + ", pName=" + pName + ", pHqAddress=" + pHqAddress + ", pLogoUrl=" + pLogoUrl + "]";
	}
	

}
