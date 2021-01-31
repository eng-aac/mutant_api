package com.example.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.main.entities.Species;

@Repository
public interface SpeciesRepository extends JpaRepository<Species, Integer> {
	
	
	@Query(value = "SELECT count(species_condition) FROM human_mutant.species WHERE species_condition = 'Human'", nativeQuery = true)
	int countByHuman();
	
	@Query(value = "SELECT count(species_condition) FROM human_mutant.species WHERE species_condition = 'Mutant'", nativeQuery = true)
	int countByMutant();


}
