package com.example.projectr.implement;

import com.example.projectr.users.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userimpl extends JpaRepository<user,Integer> {
}
