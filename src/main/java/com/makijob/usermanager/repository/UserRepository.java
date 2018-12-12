package com.makijob.usermanager.repository;

import com.makijob.usermanager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
