package com.onesoft.Bank.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onesoft.Bank.Entity.Bank;

public interface BankRepo extends JpaRepository<Bank, Integer> {

}
