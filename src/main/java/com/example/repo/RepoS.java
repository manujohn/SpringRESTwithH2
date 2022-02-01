package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.EntitiyS;

public interface RepoS extends JpaRepository<EntitiyS, Integer> {

	EntitiyS findByUserId(int userid);

}
