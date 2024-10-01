package com.del_dev.planeta_limpo.services;


import com.del_dev.planeta_limpo.entities.User;
import com.del_dev.planeta_limpo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findBiId(long id){
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }

}
