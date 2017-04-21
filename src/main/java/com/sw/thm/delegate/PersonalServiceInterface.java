package com.sw.thm.delegate;

import com.sw.thm.model.Personal;
import javassist.NotFoundException;

import java.util.List;

public interface PersonalServiceInterface {
    Personal getByID(String id) throws NotFoundException;
    List<Personal> getAll();
}
