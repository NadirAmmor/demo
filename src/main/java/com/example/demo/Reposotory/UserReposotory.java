package com.example.demo.Reposotory;

import com.example.demo.entitee.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface UserReposotory extends JpaRepository<User,Integer> {
}
