package com.zillion.domain;

import java.util.UUID;

/**
 * Created by lpresswood on 4/6/17.
 * Copyright Zillion.com
 */
public class Coach {

    private String name;
    private final UUID id;
    private String emailAddress;

    public Coach(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
        id = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
