package com.luv2code.springdemo.service;

import com.luv2code.springdemo.model.Account;
import com.luv2code.springdemo.model.Branch;

import java.util.List;

public interface BranchService
{
    public List<Branch> getBranches();

    public void saveBranch(Branch theBranch);

    public Branch getBranch(int theId);

    public void deleteBranch(int theId);
}
