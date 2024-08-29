package com.example.order;

import com.example.order.db.DBService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class LoyaltyServiceTest {

    @Mock
    DBService dbService;

    @InjectMocks
    LoyaltyService loyaltyService;

    @BeforeEach
    void setUp() {
        loyaltyService = new LoyaltyService();
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void test_returnTrueIfClientIsMember() {
        int id = 1;
        when(dbService.selectData(anyInt())).thenReturn(true);
        boolean loyaltyStatus = loyaltyService.checkLoyaltyStatus(id);
        assertTrue(loyaltyStatus);
    }

    @Test
    public void test_returnFalseIfClientIsNotMember() {
        int id = 2;
        when(dbService.selectData(anyInt())).thenReturn(false);
        boolean loyaltyStatus = loyaltyService.checkLoyaltyStatus(id);
        assertFalse(loyaltyStatus);
    }
}