package com.cg.service;

import com.cg.entities.BankAccount;

public interface BankService {
	
	public abstract BankAccount add(BankAccount acct);
	
	public abstract BankAccount search(int acct1);	

}
