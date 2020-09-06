package com.fitsight.fsserviceuser.repository;

import com.fitsight.fsserviceuser.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
