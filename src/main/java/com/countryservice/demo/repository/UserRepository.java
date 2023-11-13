package com.countryservice.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.countryservice.demo.dao.User;

public interface UserRepository extends MongoRepository<User, Integer>{
	
	List<User> findByAddress(String address);

}