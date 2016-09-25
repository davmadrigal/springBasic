package com.company.spring.tutorial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.spring.tutorial.entities.User;

//first param, second param
//name of the class, param primary key
public interface UserRepository extends JpaRepository<User,Long>{

}
