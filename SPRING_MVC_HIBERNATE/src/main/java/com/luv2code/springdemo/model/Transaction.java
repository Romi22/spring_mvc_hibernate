package com.luv2code.springdemo.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="transaction")
public class Transaction
{
    String transactionID;

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionID='" + transactionID + '\'' +
                '}';
    }
}
