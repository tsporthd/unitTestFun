package com.zillion.service;

import com.zillion.domain.Account;
import com.zillion.domain.Coach;
import org.junit.Before;
import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by lpresswood on 4/6/17.
 * Copyright Zillion.com
 */
public class CoachServiceTest {
    CoachService coachService;

    @Before
    public void init(){
        //AccountService accountService = new AccountServiceImpl();

        // or

        // I can mock account Service
        AccountService accountServiceMock = mock(AccountService.class);

        UUID accountId = UUID.randomUUID();
        when(accountServiceMock.findAccount(accountId)).thenReturn(new Account("foo"));

        coachService = new CoachServiceImpl(accountServiceMock,);
    }

    @Test
    public void createCoach() {


    }

}