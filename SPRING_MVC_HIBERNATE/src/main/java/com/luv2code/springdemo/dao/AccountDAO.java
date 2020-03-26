package com.luv2code.springdemo.dao;


import com.luv2code.springdemo.model.Account;
import com.luv2code.springdemo.model.Customer;

import java.util.List;

public interface AccountDAO
{
    public List<Account> getAccounts();

    public void saveAccount(Account theAccount);

    public Account getAccount(int theId);

    public void deleteAccount(int theId);
}
