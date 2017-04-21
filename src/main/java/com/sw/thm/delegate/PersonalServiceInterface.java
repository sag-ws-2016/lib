package com.sw.thm.delegate;

import com.sw.thm.model.Person;
import javassist.NotFoundException;

import java.util.List;

/**
 * Created by christophcaps on 21.04.17.
 */
public interface PersonalServiceInterface {
    Person getByID(String id) throws NotFoundException;
    List<Person> getAll();
}
