package com.onesoft.Bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

import com.onesoft.Bank.Entity.Bank;
import com.onesoft.Bank.service.BankService;

@RestController
@RequestMapping(value="/bank")

public class BankControl {
	@Autowired
	BankService banser;
	@PostMapping(value="/data")
	public String sbank(@RequestBody List<Bank> b) {
		return banser.sbank(b);
	}

}
