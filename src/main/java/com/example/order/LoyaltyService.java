package com.example.order;

import com.example.order.db.DBService;

public class LoyaltyService {

    protected DBService dbService = new DBService();

    public DBService getDbService() {
        return dbService;
    }

    public void setDbService(DBService dbService) {
        this.dbService = dbService;
    }

    public boolean checkLoyaltyStatus(int id) {
        return dbService.selectData(id);
    }
}
