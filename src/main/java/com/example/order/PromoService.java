package com.example.order;

import java.time.LocalDate;

public class PromoService {
    private LocalDate promoStart;
    private LocalDate promoEnd;

    public LocalDate getPromoStart() {
        return promoStart;
    }

    public void setPromoStart(LocalDate promoStart) {
        this.promoStart = promoStart;
    }

    public LocalDate getPromoEnd() {
        return promoEnd;
    }

    public void setPromoEnd(LocalDate promoEnd) {
        this.promoEnd = promoEnd;
    }

    public boolean checkPromoPeriod(LocalDate today) {
        if(promoEnd.isBefore(today)) {
            return true;
        } else {
            return false;
        }
    }
}
