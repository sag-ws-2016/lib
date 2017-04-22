package com.sw.thm.model;

public class NotAvailable implements CleanerStateI {

    @Override
    public void startWork(Cleaner context) {}
    @Override
    public void finishWork(Cleaner context) {}

    @Override
    public void restock(Cleaner context, int restockAmount) {
        context.setQuota(context.getQuota() + restockAmount);
        context.setCleanerState(new Available());
    }
}
