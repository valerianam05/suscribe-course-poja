package com.hei.demo.repository;

import com.hei.demo.entity.User;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
  Optional<User> findByEmail(String email);
}
