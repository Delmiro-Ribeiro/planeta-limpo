package com.del_dev.planeta_limpo.repositories;

import com.del_dev.planeta_limpo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
