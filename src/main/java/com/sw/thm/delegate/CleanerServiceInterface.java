/**
 * Created by christophcaps on 11.04.17.
 */

package com.sw.thm.delegate;

import com.sw.thm.model.Cleaner;
import javassist.NotFoundException;

import java.util.List;

public interface CleanerServiceInterface {
    Cleaner create(Cleaner cleaner) throws NotFoundException;
    Cleaner update(String id, Cleaner cleaner) throws NotFoundException;
    Cleaner getByID(String id) throws NotFoundException;
    List<Cleaner> getAll();
    void delete(String id) throws NotFoundException;
    Cleaner startWork(String id);
    Cleaner finishWork(String id);
    Cleaner restock(String id, int amount);
}

