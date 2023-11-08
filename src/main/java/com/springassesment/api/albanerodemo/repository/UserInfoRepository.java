package com.springassesment.api.albanerodemo.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.springassesment.api.albanerodemo.model.UserInfo;

import java.util.Optional;

public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {
	 Optional<UserInfo> findByName(String username); 
}
