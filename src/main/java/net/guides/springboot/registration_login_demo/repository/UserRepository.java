package net.guides.springboot.registration_login_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import net.guides.springboot.registration_login_demo.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}