package com.cg.dao;

import com.cg.entities.BankAccount;


public interface BankRepository {
	
	public abstract BankAccount add(BankAccount acct);
	
	public abstract BankAccount search(int acct1);	

}
