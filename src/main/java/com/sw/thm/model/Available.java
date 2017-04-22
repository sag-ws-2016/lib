package com.sw.thm.model;

public class Available implements CleanerStateI {

    @Override
    public void startWork(Cleaner context) {
        if(context.getQuota()>0){
            context.setQuota(context.getQuota()-1);
            context.setCleanerState(new Busy());
        }
    }
    @Override
    public void finishWork(Cleaner context) {}
    @Override
    public void restock(Cleaner context, int restockAmount) {
        context.setQuota(context.getQuota() + restockAmount);
    }
}
