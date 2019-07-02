package com.cg.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BankAccount implements Serializable{
	
	@Id
	private int id;
	private int accntNo;
	private String name, branch, accntType;
	public BankAccount(int id, int accntNo, String name, String branch,
			String accntType) {
		super();
		this.id = id;
		this.accntNo = accntNo;
		this.name = name;
		this.branch = branch;
		this.accntType = accntType;
	}
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAccntNo() {
		return accntNo;
	}
	public void setAccntNo(int accntNo) {
		this.accntNo = accntNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getAccntType() {
		return accntType;
	}
	public void setAccntType(String accntType) {
		this.accntType = accntType;
	}
	@Override
	public String toString() {
		return "BankAccount [id=" + id + ", accntNo=" + accntNo + ", name="
				+ name + ", branch=" + branch + ", accntType=" + accntType
				+ "]";
	}
	
	

}
