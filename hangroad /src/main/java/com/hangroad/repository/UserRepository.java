package com.hangroad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hangroad.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByUserName(String userName);

}
