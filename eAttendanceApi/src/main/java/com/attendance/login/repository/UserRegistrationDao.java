package com.attendance.login.repository;

import org.springframework.data.repository.CrudRepository;

import com.attendance.entity.login.UserRegistration;

public interface UserRegistrationDao extends CrudRepository<UserRegistration, Long>{

}
