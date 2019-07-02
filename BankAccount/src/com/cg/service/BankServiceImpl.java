package com.cg.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.cg.dao.BankRepository;
import com.cg.entities.BankAccount;


@Service
@Transactional
public class BankServiceImpl implements BankService {
	
	@Autowired
	private BankRepository bankRepository;

	@Override
	public BankAccount add(BankAccount acct) {
		// TODO Auto-generated method stub
		return bankRepository.add(acct);
	}

	@Override
	public BankAccount search(int acct1) {
		// TODO Auto-generated method stub
		return bankRepository.search(acct1);
	}

}
