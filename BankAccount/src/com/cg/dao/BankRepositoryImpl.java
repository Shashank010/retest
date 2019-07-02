package com.cg.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.entities.BankAccount;

@Repository
public class BankRepositoryImpl implements BankRepository {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public BankAccount add(BankAccount acct) {
		// TODO Auto-generated method stub
		entityManager.persist(acct);
		entityManager.flush();
		return acct;
	}

	@Override
	public BankAccount search(int id) {
		// TODO Auto-generated method stub
		BankAccount acct1 = entityManager.find(BankAccount.class,id);
		return acct1;
	}
}
