package com.example.PROJECT.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.PROJECT.model.SignUp;

@Repository
public interface SignUpRepo extends JpaRepository<SignUp, Integer> {

}