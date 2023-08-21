package com.example.springboottask.repositories;

import com.example.springboottask.entityes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>
{
}
