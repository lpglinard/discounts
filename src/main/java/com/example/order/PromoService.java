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

        boolean isValido; //Inicializando variavel
        LocalDate dataInicio = getPromoStart();
        LocalDate dataFim = getPromoEnd();

        if((today.isAfter(dataInicio) || today == dataInicio)
                && ((today.isBefore(dataFim) || today == dataFim))){

           isValido = true;

        }else{

            isValido = false;

        }
        return isValido;
    }
}
