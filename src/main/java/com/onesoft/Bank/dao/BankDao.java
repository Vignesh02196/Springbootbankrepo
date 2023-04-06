package com.onesoft.Bank.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.onesoft.Bank.Entity.Bank;
import com.onesoft.Bank.repositary.BankRepo;

@Repository
public class BankDao {
	@Autowired
	BankRepo banrepo;
	public String sbank(List <Bank> b) {
		banrepo.saveAll(b);
		return "Sucessfully Saved";
	}
}
