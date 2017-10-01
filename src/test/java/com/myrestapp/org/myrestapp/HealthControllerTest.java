package com.myrestapp.org.myrestapp;

import com.myrestapp.org.myrestapp.controller.HealthController;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by akbar on 9/30/2017.
 */
public class HealthControllerTest {

    HealthController healthController = new HealthController();

    @Test
    public void getHealth() {
        Assert.assertEquals("IT'S UP! Ayo Rama :)", healthController.getHealth());
    }


}
