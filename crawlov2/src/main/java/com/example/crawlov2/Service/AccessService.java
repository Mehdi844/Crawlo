package com.example.crawlov2.Service;

import com.example.crawlov2.Repo.AccessRepo;
import com.example.crawlov2.Model.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class AccessService implements AccessServiceInterface {

    @Autowired
    private AccessRepo accessRepo;


    @Override
    public Access CreateAccess(Access access) {
        return null;
    }


    @Override
    public Optional<Access> getAccessById(int id) {
        return accessRepo.findById(id);
    }

    @Override
    public List<Access> getAllAccesses() {
        return List.of();
    }

    @Override
    public Access updateAccess(int id, Access access) {

        Access accessToUpdate = accessRepo.findById(id).orElseThrow();

        return accessRepo.save(accessToUpdate);
    }

    @Override
    public void deleteAccess(int id) {
        accessRepo.deleteById(id);
    }

    public Optional<Access> getAccessDetailsById(int accessId) {
        return accessRepo.findAccessDetailsById(accessId);
    }
}
