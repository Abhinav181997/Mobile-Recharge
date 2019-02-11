package com.capgemini.mobile.service;

import com.capgemini.mobile.bean.Account;
import com.capgemini.mobile.exceptions.AccountException;

public interface AccountService {
	
	public Account getAccountDetails(String mobileNo);
	public double rechargeAccount(String mobileNo, double rechargeAmount);
	
	public boolean validatemobNo(String mobNo) throws AccountException;
	public boolean validateReAmount(double recAmount) throws AccountException;
}



