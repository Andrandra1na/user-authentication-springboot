package net.guides.springboot.registration_login_demo.security;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import net.guides.springboot.registration_login_demo.entity.Role;
import net.guides.springboot.registration_login_demo.entity.User;
import net.guides.springboot.registration_login_demo.repository.UserRepository;

import java.util.Collection;
import java.util.stream.Collectors;

/**
 * CustomUserDetailsService is a service that implements UserDetailsService
 * to load user-specific data.
 * It retrieves user information from the database and maps it to Spring Security's UserDetails.
 */
@Service
public class CustomUserDetailsService implements UserDetailsService {
    /**
     * UserRepository is used to access user data from the database.
     */
    private UserRepository userRepository;

    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(email);

        if (user != null) {
            return new org.springframework.security.core.userdetails.User(user.getEmail(),
                    user.getPassword(),
                    mapRolesToAuthorities(user.getRoles()));
        }else{
            throw new UsernameNotFoundException("Invalid username or password.");
        }
    }

    private Collection < ? extends GrantedAuthority> mapRolesToAuthorities(Collection <Role> roles) {
        Collection < ? extends GrantedAuthority> mapRoles = roles.stream()
                .map(role -> new SimpleGrantedAuthority(role.getName()))
                .collect(Collectors.toList());
        return mapRoles;
    }
}
