package com.sw.thm.delegate;

import com.sw.thm.model.Contract;
import javassist.NotFoundException;

import java.util.List;

public interface ContractServiceInterface {
    Contract create(Contract contract) throws NotFoundException;
    Contract update(String id, Contract contract) throws NotFoundException;
    Contract getByID(String id) throws NotFoundException;
    List<Contract> getAll();
    void delete(String id) throws NotFoundException;
}

