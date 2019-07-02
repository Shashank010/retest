package com.cg.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cg.entities.BankAccount;
import com.cg.service.BankService;



@Controller
public class BankController {
	
	@Autowired
	private BankService bankService;
	
	@RequestMapping("/index.obj")//3
	public String showBooking(Model model) {
		model.addAttribute("acct", new BankAccount());
		//model.addAttribute("hotelname",name);
		return "index";
	}
	
	@RequestMapping(value = "/save.obj", method = RequestMethod.POST)
	public String saveBooking( @ModelAttribute("acct") @Valid BankAccount acct,
			BindingResult result, Model model)
			{
		acct = bankService.add(acct);
		model.addAttribute("acct", new BankAccount());
		model.addAttribute("acct1",acct);
		return "AccountCreated";
	}
	
	@RequestMapping(value = "/searchaccnt.obj", method = RequestMethod.POST)
	public String searchBooking( @ModelAttribute("acct") @Valid BankAccount acct1,
			BindingResult result, Model model) {
		acct1 = bankService.search(acct1.getId());
		System.out.println(acct1.getAccntNo());
		model.addAttribute("acct2",acct1);
		return "AccountCreated";
	}
}
