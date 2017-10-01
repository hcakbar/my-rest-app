package com.myrestapp.org.myrestapp;

import com.myrestapp.org.myrestapp.controller.UsersController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UsersControllerTest {

	UsersController usersController = new UsersController();

	@Test
	public void testGetUser() {
		Assert.assertEquals("Shamim", usersController.getUser(1).getId());
	}



}
