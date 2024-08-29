package com.example.order;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PromoServiceTest {
    @InjectMocks
    PromoService service = new PromoService();

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void test_TodayBetweenPromoPeriod_ReturnsTrue() {
        //Prepare
        LocalDate today = LocalDate.of(2024, 12, 18);

        //Execute
        boolean result = service.checkPromoPeriod(today);

        //Assert
        assertTrue(result);

    }

    @Test
    public void test_TodayAfterPromoPeriod_ReturnsFalse() {
        //Prepare
        LocalDate today = LocalDate.now();
        LocalDate start = LocalDate.now().minusDays(1);
        LocalDate end = LocalDate.now().plusDays(1);
        service.setPromoStart(start);
        service.setPromoEnd(end);

        //Execute
        boolean result = service.checkPromoPeriod(today);

        //Assert
        assertFalse(result);

    }

}