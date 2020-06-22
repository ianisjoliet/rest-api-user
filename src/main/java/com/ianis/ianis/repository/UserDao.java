package com.ianis.ianis.repository;

import com.ianis.ianis.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UserDao extends JpaRepository<User, Long> {
    User findById(int userId);
    void deleteById(int userId);
}
