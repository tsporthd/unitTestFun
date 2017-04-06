package com.zillion.service;

import com.zillion.domain.Account;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Created by lpresswood on 4/5/17.
 * Copyright Zillion.com
 */
public class AccountServiceImpl implements AccountService {

    private Map<UUID,Account> myAccounts = new HashMap<>();

    @Override
    public Account createAccount(String accountName) {
        Account account = new Account(accountName);
        myAccounts.put(account.getId(),account);
        return account;
    }

    @Override
    public Account findAccount(String accountName) {
        return null;
    }

    @Override
    public Account findAccount(UUID uuid) {
        return myAccounts.get(uuid);
    }

    @Override
    public void deleteAccount(String accountName) {

    }

    @Override
    public void deleteAccount(UUID uuid) {

    }


}
