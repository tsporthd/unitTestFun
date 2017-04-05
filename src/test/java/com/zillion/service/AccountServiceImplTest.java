package com.zillion.service;

import com.zillion.domain.Account;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

import static org.junit.Assert.*;

/**
 * Created by lpresswood on 4/5/17.
 * Copyright Zillion.com
 */
public class AccountServiceImplTest {
    private AccountService accountService;

    @Before
    public void createService() {
        accountService = new AccountServiceImpl();
    }

    @Test
    public void createAccount() {
        Account account = accountService.createAccount("test");
        assertNotNull(account);
    }

    @Test
    public void findAccount() {
        Account account = accountService.createAccount("Test2");
        assertNotNull(account);
        Account foundAccount = accountService.findAccount(account.getId());
        assertNotNull(foundAccount);
    }

    @Test
    public void findAccount1() {
        String accountName = "Test3";
        Account account = accountService.createAccount(accountName);
        assertNotNull(account);
        Account foundAccount = accountService.findAccount(accountName);
        assertNotNull(foundAccount);
    }

    @Test
    public void deleteAccount() {
        String accountName = "Test4";
        Account account = accountService.createAccount(accountName);
        assertNotNull(account);
        accountService.deleteAccount(account.getId());
        account = accountService.findAccount(account.getId());
        assertNull(account);

    }

    @Test
    public void deleteAccount1() {
        String accountName = "Test5";
        Account account = accountService.createAccount(accountName);
        assertNotNull(account);
        accountService.deleteAccount(account.getAccountName());
        account = accountService.findAccount(account.getId());
        assertNull(account);
    }

    @Test
    public void testCreateWithMock(){
        AccountService service = mock(AccountService.class);
        String mockAccount = "MockAccount";
        Account sampleAccount = new Account(mockAccount);

        when(service.createAccount(mockAccount)).thenReturn(sampleAccount);

        Account testAccount = service.createAccount(mockAccount);
        assertNotNull(testAccount);
        assertTrue(testAccount.getAccountName().equals(mockAccount));



    }

}