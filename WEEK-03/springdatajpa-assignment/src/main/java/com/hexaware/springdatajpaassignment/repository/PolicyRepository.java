package com.hexaware.springdatajpaassignment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.springdatajpaassignment.entity.Policy;

@Repository
public interface PolicyRepository extends JpaRepository<Policy,Integer>{

	public List<Policy> findByCompany(String company);

}
