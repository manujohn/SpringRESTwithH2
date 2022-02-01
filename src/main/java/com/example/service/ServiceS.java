package com.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.EntitiyS;
import com.example.repo.RepoS;

@Service
public class ServiceS {

	@Autowired
	RepoS repo;

	Logger logger = LoggerFactory.getLogger(ServiceS.class);

	public EntitiyS saveUser(EntitiyS user) {
		logger.debug("In Services class saveUser method :" +user.toString());
		return repo.save(user);
	}

	public EntitiyS getUser(int userid) {
		logger.debug("In Services class getUser method :" +userid);
		return repo.findByUserId(userid);
	}

}
