package com.luv2code.springdemo.service;

import com.luv2code.springdemo.model.Account;
import java.util.List;

public interface AccountService
{
    public List<Account> getAccounts();

    public void saveAccount(Account theAccount);

    public Account getAccount(int theId);

    public void deleteAccount(int theId);
}
