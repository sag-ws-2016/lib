package com.sw.thm.model;

public class Busy implements CleanerStateI {

    @Override
    public void startWork(Cleaner context) {
    }
    @Override
    public void finishWork(Cleaner context) {
        context.setCleanerState(new Available());
    }

    @Override
    public void restock(Cleaner context, int restockAmount) {
        context.setQuota(context.getQuota() + restockAmount);
    }

}
