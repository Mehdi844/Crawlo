package com.example.crawlov2.Service;

import com.example.crawlov2.Model.Access;

import java.util.List;
import java.util.Optional;

public interface AccessServiceInterface {
    Access CreateAccess(Access access);
    public Optional<Access> getAccessById(int id);
    List<Access> getAllAccesses();
    Access updateAccess(int id, Access access );
    void deleteAccess(int id);
}




