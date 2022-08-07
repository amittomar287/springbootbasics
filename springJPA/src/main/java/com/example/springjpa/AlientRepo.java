package com.example.springjpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.springjpa.model.AlientJPA;

public interface AlientRepo extends JpaRepository<AlientJPA, Integer>{

	AlientJPA findByName(String name);
	
	List<AlientJPA> findByTech(String tech);
	
	/*
	 * @Query("from AlientJPA where id=?1") AlientJPA findByAlenID(int id);
	 */
	@Query("from AlientJPA where tech=?1 order by name")
	List<AlientJPA> getAlienInSortedOrder(String tech);
}
