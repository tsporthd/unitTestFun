package com.zillion.domain;

import java.util.UUID;

/**
 * Created by lpresswood on 4/5/17.
 * Copyright Zillion.com
 */
public class Account {

    private final UUID id;

    private final String accountName;

    public Account(String accountName) {
        this.id = UUID.randomUUID();
        this.accountName = accountName;
    }

    public UUID getId() {
        return id;
    }

    public String getAccountName() {
        return accountName;
    }
}
