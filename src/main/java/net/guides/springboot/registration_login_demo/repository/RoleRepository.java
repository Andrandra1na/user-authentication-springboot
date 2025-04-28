package net.guides.springboot.registration_login_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import net.guides.springboot.registration_login_demo.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}