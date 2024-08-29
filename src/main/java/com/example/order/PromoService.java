package com.example.order;

import java.time.LocalDate;

public class PromoService {
    private LocalDate promoStart;
    private LocalDate promoEnd;

    public boolean checkPromoPeriod(LocalDate today) {
        LocalDate promoStart = LocalDate.of(today.getYear(), 12, 1);
        LocalDate promoEnd = LocalDate.of(today.getYear(), 12, 31);

        if (!today.isBefore(promoStart) && !today.isAfter(promoEnd)) {
            return true;
        }

        return false;
    }

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
}
