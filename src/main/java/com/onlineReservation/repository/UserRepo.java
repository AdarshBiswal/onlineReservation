package com.onlineReservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.onlineReservation.model.UserModel;

@EnableJpaRepositories
@Repository
public interface UserRepo extends JpaRepository<UserModel, Integer> {
	
		public UserModel findById(int id);
		public UserModel findByMobile(String mobile);
		public UserModel findByEmail(String email);
		

	}
