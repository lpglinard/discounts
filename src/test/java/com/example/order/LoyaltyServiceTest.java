package com.example.order;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class LoyaltyServiceTest {

    LoyaltyService loyaltyService;

    @BeforeEach
    void setUp() {
        loyaltyService = new LoyaltyService();
    }

    @Test
    public void test_returnTrueIfClientIsMember() {
        int id = 1;
        boolean loyaltyStatus = loyaltyService.checkLoyaltyStatus(id);
        assertTrue(loyaltyStatus);
    }

    @Test
    public void test_returnFalseIfClientIsNotMember() {
        int id = 1;
        boolean loyaltyStatus = loyaltyService.checkLoyaltyStatus(id);
        assertFalse(loyaltyStatus);
    }

}