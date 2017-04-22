package com.sw.thm.delegate;

import com.sw.thm.model.Cleaner;
import com.sw.thm.util.ObjectMapper;

/**
 * Created by jonas on 22.04.17.
 */
public class Test {
    public static void main(String[] args){
        Cleaner cleaner = new Cleaner();
        print(cleaner);
        cleaner.restock(1);
        print(cleaner);
        cleaner.startWork();
        print(cleaner);
        cleaner.finishWork();
        print(cleaner);
        cleaner.startWork();
        print(cleaner);
        cleaner.restock(1);
        print(cleaner);
        cleaner.startWork();
        print(cleaner);
        cleaner.finishWork();
        print(cleaner);

    }
    private static void print(Cleaner cleaner){
        ObjectMapper obj = new ObjectMapper();
        System.out.println(obj.dataToJson(cleaner));

        String json = obj.dataToJson(cleaner);
    }
}

