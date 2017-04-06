package com.zillion.service;

import com.zillion.domain.Account;
import com.zillion.domain.Coach;

import java.util.List;

/**
 * Created by lpresswood on 4/6/17.
 * Copyright Zillion.com
 */
public interface CoachService {

    Coach createCoach(String name, String emailAddress);

    Coach createCoach(String name, String emailAddress, List<Account> members);

    List<Account> getMembersForCoach(String coachName);
}
