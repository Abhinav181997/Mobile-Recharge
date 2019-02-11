package com.capgemini.mobile.dao;

import com.capgemini.mobile.bean.Account;

public interface AccountDao {
	
	
	public Account getAccountDetails(String mobileNo);
	public double rechargeAccount(String mobileNo, double rechargeAmount);
	
	

}
