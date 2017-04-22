package com.sw.thm.model;

public interface CleanerStateI {
    public void startWork(Cleaner context);
    public void finishWork(Cleaner context);

    public void restock(Cleaner context, int restockAmount);
}
