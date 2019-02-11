package com.capgemini.mobile.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.mobile.bean.Account;
import com.capgemini.mobile.dao.AccountDao;
import com.capgemini.mobile.dao.AccountDaoImp;
import com.capgemini.mobile.exceptions.AccountException;

public class AccountServiceImp implements AccountService{
	
	AccountDao dao;
	public AccountServiceImp() {
		dao=new AccountDaoImp();
	}
	

	@Override
	public Account getAccountDetails(String mobileNo) {
		
		return dao.getAccountDetails(mobileNo);
	}

	@Override
	public double rechargeAccount(String mobileNo, double rechargeAmount) {
		
		return dao.rechargeAccount(mobileNo, rechargeAmount);
	}


	@Override
	public boolean validatemobNo(String mobNo) throws AccountException {
		if(mobNo==null)
			throw new AccountException();
		Pattern pat=Pattern.compile("[6-9]{1}[0-9]{2,9}");
		Matcher mat=pat.matcher(mobNo);
		return mat.matches();
	
	}


	@Override
	public boolean validateReAmount(double recAmount) throws AccountException {
		if(recAmount>0){
			return true;
		}
		else if(recAmount==0)
		{
			throw new AccountException();
		}
		return false;
	}

}
