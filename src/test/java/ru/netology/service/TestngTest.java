package ru.netology.service;



import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class TestngTest {

    @org.testng.annotations.Test
    public void needToBuy(){
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void NoPurchase(){
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1_000;

        assertEquals(actual, expected);
    }


    @org.testng.annotations.Test
    public void notPayment(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1_000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }
}
