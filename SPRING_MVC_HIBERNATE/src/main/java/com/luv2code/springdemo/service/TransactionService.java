package com.luv2code.springdemo.service;

import com.luv2code.springdemo.model.Transaction;
import java.util.List;

public interface TransactionService
{
    public List<Transaction> getTransactions();

    public void saveTransaction(Transaction theTransaction);

    public Transaction getTransaction(int theId);

    public void deleteTransaction(int theId);

    public String debit(Transaction theTransaction);

    public String credit(Transaction theTransaction);

    public String checkBalance(Transaction theTransaction);

}
