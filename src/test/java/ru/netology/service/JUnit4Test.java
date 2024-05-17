package ru.netology.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JUnit4Test {

    @org.junit.Test
    public void needToBuy(){
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual,expected);
    }

    @org.junit.Test
    public void NoPurchase(){
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1_000;

        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void notPayment(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1_000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

}
