package com.del_dev.planeta_limpo.controlles;

import com.del_dev.planeta_limpo.entities.User;
import com.del_dev.planeta_limpo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserControlle {

    @Autowired
    private UserService service;

    @PostMapping
    private ResponseEntity<User> criandoUsuario(@RequestBody User user) {
        User novoUsuario = service.criarUsuario(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoUsuario);
    }

    @GetMapping
    public ResponseEntity<List<User>> findAllUser() {
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findBiIdUser(@PathVariable long id) {
        User obj = service.findBiId(id);
        return ResponseEntity.ok().body(obj);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> atualizarUser(@PathVariable long id, @RequestBody User user) {
        try {
            User usuario = service.updateUsuario(id, user);
            return ResponseEntity.ok(usuario);
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<User> deletarUser(@PathVariable long id) {
        try {
            service.deleteId(id);
            return ResponseEntity.noContent().build();
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
