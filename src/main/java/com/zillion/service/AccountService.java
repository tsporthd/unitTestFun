package com.zillion.service;

import com.zillion.domain.Account;

import java.util.UUID;

/**
 * Created by lpresswood on 4/5/17.
 * Copyright Zillion.com
 */
public interface AccountService {

    Account createAccount(String accountName);
    Account findAccount(String accountName);
    Account findAccount(UUID uuid);

    void deleteAccount(String accountName);
    void deleteAccount(UUID uuid);
}
