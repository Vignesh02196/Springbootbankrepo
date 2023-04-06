package com.onesoft.Bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.onesoft.Bank.Entity.Bank;
import com.onesoft.Bank.dao.BankDao;

@Service
public class BankService {
@Autowired
BankDao bandao;
public String sbank(List <Bank> b) {
	return bandao.sbank(b);

}
}
