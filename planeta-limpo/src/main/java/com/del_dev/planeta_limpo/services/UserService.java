package com.del_dev.planeta_limpo.services;


import com.del_dev.planeta_limpo.entities.User;
import com.del_dev.planeta_limpo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    @Transactional
    public User criarUsuario(User user) {
        if (user == null || user.getNome() == null || user.getSenha() == null) {
            throw new IllegalArgumentException("Usuário ou campos obrigatórios não podem ser nulos");
        }
        return repository.save(user);
    }

    @Transactional
    public List<User> findAll(){

        return repository.findAll();
    }

    @Transactional
    public User findBiId(long id){
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }

    @Transactional
    public void deleteId(long id){
        repository.deleteById(id);
    }

    @Transactional
    public User updateUsuario(long id, User updateUsuario){
        User user = repository.findById(id).orElseThrow(()-> new RuntimeException("Usuario não encontrado"));
        user.setNome(updateUsuario.getNome());
        user.setSenha(updateUsuario.getSenha());

        return repository.save(user);
    }

}
