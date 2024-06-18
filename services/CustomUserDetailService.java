package com.caz.jobportal.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.caz.jobportal.entity.Users;
import com.caz.jobportal.repository.UsersRepository;
import com.caz.jobportal.util.CustomUserDetails;

@Service
public class CustomUserDetailService implements UserDetailsService {

    private final UsersRepository usersRepository;

    public CustomUserDetailService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = usersRepository.findByEmail(username).orElseThrow(() -> new UsernameNotFoundException("Could not found user"));
        return new CustomUserDetails(user);
    }

}
