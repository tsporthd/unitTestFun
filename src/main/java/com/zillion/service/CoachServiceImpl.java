package com.zillion.service;

import com.zillion.domain.Account;
import com.zillion.domain.Coach;

import java.util.List;

/**
 * Created by lpresswood on 4/6/17.
 * Copyright Zillion.com
 */
public class CoachServiceImpl implements  CoachService{

    private final AccountService accountService;
    private final EmailAddressChecker emailAddressChecker;

    public CoachServiceImpl(AccountService accountService, EmailAddressChecker emailAddressChecker) {
        this.accountService = accountService;
        this.emailAddressChecker = emailAddressChecker;
    }

    @Override
    public Coach createCoach(String name, String emailAddress) {


        return null;
    }


    @Override
    public Coach createCoach(String name, String emailAddress, List<Account> members) {
        for(Account account : members){
            if ( accountService.findAccount(account.getId()) != null ){
                // add the account to the coach
            }
        }

        return null;
    }

    @Override
    public List<Account> getMembersForCoach(String coachName) {
        return null;
    }
}
