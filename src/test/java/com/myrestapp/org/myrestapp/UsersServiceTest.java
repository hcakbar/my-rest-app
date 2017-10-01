package com.myrestapp.org.myrestapp;

import com.myrestapp.org.myrestapp.users.UsersService;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by akbar on 9/30/2017.
 */
public class UsersServiceTest {

    UsersService usersService = new UsersService();

    @Test
    public void testGetAllUsers() {
        Assert.assertEquals("Shamim", usersService.getAllUsers().get(0).getId());
    }

}
