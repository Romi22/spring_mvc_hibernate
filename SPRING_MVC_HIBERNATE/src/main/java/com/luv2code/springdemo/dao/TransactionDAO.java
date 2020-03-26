package com.luv2code.springdemo.dao;


import com.luv2code.springdemo.model.Account;
import com.luv2code.springdemo.model.Customer;
import com.luv2code.springdemo.model.Transaction;

import java.util.List;

public interface TransactionDAO
{
    public List<Transaction> getTransactions();

    public void saveTransaction(Transaction theTransaction);

    public Transaction getTransaction(int theId);

    public void deleteTransaction(int theId);

    public String debit(Transaction theTransaction);

    public String credit(Transaction theTransaction);

    public String checkBalance(Transaction theTransaction);


}
